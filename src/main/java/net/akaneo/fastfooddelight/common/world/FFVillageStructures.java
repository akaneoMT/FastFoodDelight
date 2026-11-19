package net.akaneo.fastfooddelight.common.world;

import com.mojang.datafixers.util.Pair;
import net.akaneo.fastfooddelight.FastFoodDelight;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import java.util.ArrayList;
import java.util.List;

/**
 * Adds the fast food buildings to vanilla villages. Same approach as Farmer's Delight's VillageStructures.
 * Requires fastfooddelight.classtweaker to reach StructureTemplatePool's templates and rawTemplates fields.
 */
public class FFVillageStructures
{
	// Vanilla house pools weigh 68 to 87 in total: 15 gives a fast food in roughly 8 villages out of 10,
	// with fewer duplicates than the 25 used in 1.19
	private static final int FAST_FOOD_WEIGHT = 15;

	public static void init() {
		// Template pools are data-driven: they only exist once the server has loaded its registries
		ServerLifecycleEvents.SERVER_STARTING.register(FFVillageStructures::addNewVillageBuildings);
	}

	public static void addNewVillageBuildings(MinecraftServer server) {
		Registry<StructureTemplatePool> templatePools = server.registryAccess().lookupOrThrow(Registries.TEMPLATE_POOL);
		Registry<StructureProcessorList> processorLists = server.registryAccess().lookupOrThrow(Registries.PROCESSOR_LIST);

		for (String biome : List.of("plains", "snowy", "savanna", "taiga", "desert")) {
			addBuildingToPool(templatePools, processorLists,
					Identifier.withDefaultNamespace("village/" + biome + "/houses"),
					FastFoodDelight.MODID + ":village/houses/" + biome + "_fast_food",
					FAST_FOOD_WEIGHT);
		}
	}

	/**
	 * Adds a building to a template pool. Additive: several mods can add to the same pool safely.
	 * The weight is the number of times the piece appears in the pool.
	 */
	public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry, Registry<StructureProcessorList> processorListRegistry, Identifier poolRL, String nbtPieceRL, int weight) {
		StructureTemplatePool pool = templatePoolRegistry.getValue(poolRL);
		if (pool == null) return;

		Holder<StructureProcessorList> emptyProcessorList = processorListRegistry.getOrThrow(
				ResourceKey.create(Registries.PROCESSOR_LIST, Identifier.withDefaultNamespace("empty")));

		// "legacy" like vanilla village houses: the structure's air blocks don't overwrite the terrain
		SinglePoolElement piece = SinglePoolElement.legacy(nbtPieceRL, emptyProcessorList).apply(StructureTemplatePool.Projection.RIGID);

		for (int i = 0; i < weight; i++) {
			pool.templates.add(piece);
		}

		// Not used by vanilla, but other mods may read it: keep it in sync (copy, as it can be immutable)
		List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(pool.rawTemplates);
		listOfPieceEntries.add(new Pair<>(piece, weight));
		pool.rawTemplates = listOfPieceEntries;
	}
}
