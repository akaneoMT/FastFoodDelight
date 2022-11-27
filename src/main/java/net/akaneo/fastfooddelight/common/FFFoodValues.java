package net.akaneo.fastfooddelight.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;

public class FFFoodValues extends FoodValues {

    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties FRIES = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties COD_SANDWICH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties SALMON_SANDWICH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties PORK_SANDWICH = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.8F).build();
    public static final FoodProperties CHEESEBURGER = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.8F).build();
    public static final FoodProperties CHICKEN_CHEESE_SANDWICH = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).build();

    public static final FoodProperties CROQUE_MONSIEUR = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).build();
    public static final FoodProperties RABBIT_SANDWICH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();

    public static final FoodProperties CHEESE_WRAP = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();

    public static final FoodProperties SODA = (new FoodProperties.Builder()).alwaysEat().effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 300, 0);
    }, 1.0F).build();

    public static final FoodProperties ICE_CREAM_BASIC = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties ICE_CREAM_ADV = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();


}
