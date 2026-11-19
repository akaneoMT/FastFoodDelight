package net.akaneo.fastfooddelight.common;

import net.akaneo.fastfooddelight.FastFoodDelight;
import vectorwing.farmersdelight.refabricated.mlconfigs.ConfigBuilder;
import vectorwing.farmersdelight.refabricated.mlconfigs.ConfigType;
import vectorwing.farmersdelight.refabricated.mlconfigs.ModConfigHolder;

import java.util.function.Supplier;

public class FFConfiguration
{
	public static ModConfigHolder COMMON_CONFIG;

	// World
	public static final String CATEGORY_WORLD = "world";
	public static Supplier<Boolean> GENERATE_VILLAGE_FAST_FOODS;
	public static Supplier<Integer> VILLAGE_FAST_FOOD_WEIGHT;

	static {
		ConfigBuilder COMMON_BUILDER = ConfigBuilder.create(FastFoodDelight.MODID, ConfigType.COMMON);

		COMMON_BUILDER.push(CATEGORY_WORLD);
		GENERATE_VILLAGE_FAST_FOODS = COMMON_BUILDER.comment("If enabled, Fast Food shops will generate in Villages.")
				.define("generateVillageFastFoods", true);
		VILLAGE_FAST_FOOD_WEIGHT = COMMON_BUILDER.comment("Weight of Fast Food shops among village houses. Vanilla houses total 68 to 87 per village type: higher means more frequent, and more duplicates.")
				.define("villageFastFoodWeight", 15, 0, 50);
		COMMON_BUILDER.pop();

		COMMON_CONFIG = COMMON_BUILDER.build();
		COMMON_CONFIG.forceLoad();
	}

	public static void touch() {
	}
}
