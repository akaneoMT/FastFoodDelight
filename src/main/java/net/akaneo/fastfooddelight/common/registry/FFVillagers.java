package net.akaneo.fastfooddelight.common.registry;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.akaneo.fastfooddelight.FastFoodDelight;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PoiHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;

import java.util.function.Supplier;

public class FFVillagers
{
	public static final String FAST_FOOD_WAITER_NAME = "fast_food_waiter";

	public static final ResourceKey<PoiType> CHECKOUT_MACHINE_POI_KEY =
			ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, FastFoodDelight.id("checkout_machine_poi"));
	public static final PoiType CHECKOUT_MACHINE_POI =
			PoiHelper.register(CHECKOUT_MACHINE_POI_KEY.identifier(), 1, 1, FFBlocks.CHECKOUT_MACHINE.get());

	public static final Supplier<VillagerProfession> FAST_FOOD_WAITER = FFRegUtils.register(FAST_FOOD_WAITER_NAME,
			() -> new VillagerProfession(
					Component.translatable("entity.minecraft.villager." + FastFoodDelight.MODID + "." + FAST_FOOD_WAITER_NAME),
					poi -> poi.is(CHECKOUT_MACHINE_POI_KEY),
					poi -> poi.is(CHECKOUT_MACHINE_POI_KEY),
					ImmutableSet.of(),
					ImmutableSet.of(),
					SoundEvents.VILLAGER_WORK_BUTCHER,
					tradeSetsByLevel(FAST_FOOD_WAITER_NAME)),
			BuiltInRegistries.VILLAGER_PROFESSION);

	private static Int2ObjectMap<ResourceKey<TradeSet>> tradeSetsByLevel(String profession) {
		Int2ObjectMap<ResourceKey<TradeSet>> tradeSets = new Int2ObjectOpenHashMap<>();
		for (int level = 1; level <= 5; level++) {
			tradeSets.put(level, ResourceKey.create(Registries.TRADE_SET, FastFoodDelight.id(profession + "/level_" + level)));
		}
		return tradeSets;
	}

	public static void touch() {
	}
}
