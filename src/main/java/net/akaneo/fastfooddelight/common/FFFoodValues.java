package net.akaneo.fastfooddelight.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class FFFoodValues
{
	// Basic Foods
	public static final FoodProperties CHEESE = (new FoodProperties.Builder())
			.nutrition(1).saturationModifier(0.4f).build();
	public static final FoodProperties FRIES = (new FoodProperties.Builder())
			.nutrition(5).saturationModifier(0.6f).build();

	// Sandwiches & Wraps
	public static final FoodProperties COD_SANDWICH = (new FoodProperties.Builder())
			.nutrition(8).saturationModifier(0.8f).build();
	public static final FoodProperties SALMON_SANDWICH = (new FoodProperties.Builder())
			.nutrition(8).saturationModifier(0.8f).build();
	public static final FoodProperties PORK_SANDWICH = (new FoodProperties.Builder())
			.nutrition(11).saturationModifier(0.8f).build();
	public static final FoodProperties CHEESEBURGER = (new FoodProperties.Builder())
			.nutrition(13).saturationModifier(0.8f).build();
	public static final FoodProperties CHICKEN_CHEESE_SANDWICH = (new FoodProperties.Builder())
			.nutrition(12).saturationModifier(0.8f).build();
	public static final FoodProperties CROQUE_MONSIEUR = (new FoodProperties.Builder())
			.nutrition(12).saturationModifier(0.8f).build();
	public static final FoodProperties RABBIT_SANDWICH = (new FoodProperties.Builder())
			.nutrition(8).saturationModifier(0.8f).build();
	public static final FoodProperties CHEESE_WRAP = (new FoodProperties.Builder())
			.nutrition(8).saturationModifier(0.8f).build();

	// Desserts
	public static final FoodProperties ICE_CREAM_BASIC = (new FoodProperties.Builder())
			.nutrition(5).saturationModifier(0.6f).build();
	public static final FoodProperties ICE_CREAM_ADV = (new FoodProperties.Builder())
			.nutrition(8).saturationModifier(0.6f).build();

	public static class ConsumableValues
	{
		// Sodas
		public static final Consumable SODA = Consumables.defaultDrink()
				.onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0)))
				.build();
	}
}
