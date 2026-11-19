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

public class FFVillageStructures
{
	private static final int FAST_FOOD_WEIGHT = 15;

	public static void init() {
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

	public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry, Registry<StructureProcessorList> processorListRegistry, Identifier poolRL, String nbtPieceRL, int weight) {
		StructureTemplatePool pool = templatePoolRegistry.getValue(poolRL);
		if (pool == null) return;

		Holder<StructureProcessorList> emptyProcessorList = processorListRegistry.getOrThrow(
				ResourceKey.create(Registries.PROCESSOR_LIST, Identifier.withDefaultNamespace("empty")));

		SinglePoolElement piece = SinglePoolElement.legacy(nbtPieceRL, emptyProcessorList).apply(StructureTemplatePool.Projection.RIGID);

		for (int i = 0; i < weight; i++) {
			pool.templates.add(piece);
		}

		List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(pool.rawTemplates);
		listOfPieceEntries.add(new Pair<>(piece, weight));
		pool.rawTemplates = listOfPieceEntries;
	}
}
