package net.akaneo.fastfooddelight.common.registry;

import com.google.common.collect.Sets;
import net.akaneo.fastfooddelight.FastFoodDelight;
import net.akaneo.fastfooddelight.common.FFFoodValues;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import java.util.LinkedHashSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;
import static vectorwing.farmersdelight.common.registry.ModItems.drinkItem;
import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;

@SuppressWarnings("unused")
public class FFItems
{
	public static final LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

	public static ResourceKey<Item> key(String path) {
		return ResourceKey.create(Registries.ITEM, FastFoodDelight.id(path));
	}

	private static Supplier<Item> registerWithTab(final String name, final Function<Item.Properties, Item> function, final Item.Properties properties) {
		properties.setId(key(name));
		Supplier<Item> item = FFRegUtils.register(name, () -> function.apply(properties), BuiltInRegistries.ITEM);
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	private static Supplier<Item> registerBlockWithTab(final String name, final BiFunction<Block, Item.Properties, Item> function, final Block block, final Item.Properties properties) {
		properties.setId(key(name));
		properties.useBlockDescriptionPrefix();
		Supplier<Item> item = FFRegUtils.register(name, () -> function.apply(block, properties), BuiltInRegistries.ITEM);
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	// Blocks
	public static final Supplier<Item> CHECKOUT_MACHINE = registerBlockWithTab("checkout_machine",
			BlockItem::new, FFBlocks.CHECKOUT_MACHINE.get(), basicItem());

	// Ingredients & containers
	public static final Supplier<Item> FRIES_BOWL = registerWithTab("fries_bowl",
			Item::new, basicItem());
	public static final Supplier<Item> CHEESE = registerWithTab("cheese",
			Item::new, foodItem(FFFoodValues.CHEESE));

	// Fries
	public static final Supplier<Item> FRENCH_FRIES = registerWithTab("french_fries",
			ConsumableItem::new, foodItem(FFFoodValues.FRIES).craftRemainder(FRIES_BOWL.get()));
	public static final Supplier<Item> CARROT_FRIES = registerWithTab("carrot_fries",
			ConsumableItem::new, foodItem(FFFoodValues.FRIES).craftRemainder(FRIES_BOWL.get()));
	public static final Supplier<Item> FRIED_ONIONS = registerWithTab("fried_onions",
			ConsumableItem::new, foodItem(FFFoodValues.FRIES).craftRemainder(FRIES_BOWL.get()));
	public static final Supplier<Item> BEET_FRIES = registerWithTab("beet_fries",
			ConsumableItem::new, foodItem(FFFoodValues.FRIES).craftRemainder(FRIES_BOWL.get()));

	// Sandwiches & wraps
	public static final Supplier<Item> COD_SANDWICH = registerWithTab("cod_sandwich",
			ConsumableItem::new, foodItem(FFFoodValues.COD_SANDWICH));
	public static final Supplier<Item> SALMON_SANDWICH = registerWithTab("salmon_sandwich",
			ConsumableItem::new, foodItem(FFFoodValues.SALMON_SANDWICH));
	public static final Supplier<Item> PORK_SANDWICH = registerWithTab("pork_sandwich",
			ConsumableItem::new, foodItem(FFFoodValues.PORK_SANDWICH));
	public static final Supplier<Item> CHEESEBURGER = registerWithTab("cheeseburger",
			ConsumableItem::new, foodItem(FFFoodValues.CHEESEBURGER));
	public static final Supplier<Item> CHICKEN_CHEESE_SANDWICH = registerWithTab("chicken_cheese_sandwich",
			ConsumableItem::new, foodItem(FFFoodValues.CHICKEN_CHEESE_SANDWICH));
	public static final Supplier<Item> CROQUE_MONSIEUR = registerWithTab("croque_monsieur",
			ConsumableItem::new, foodItem(FFFoodValues.CROQUE_MONSIEUR));
	public static final Supplier<Item> RABBIT_SANDWICH = registerWithTab("rabbit_sandwich",
			ConsumableItem::new, foodItem(FFFoodValues.RABBIT_SANDWICH));
	public static final Supplier<Item> CHEESE_WRAP = registerWithTab("cheese_wrap",
			ConsumableItem::new, foodItem(FFFoodValues.CHEESE_WRAP));
	public static final Supplier<Item> CHICKEN_WRAP = registerWithTab("chicken_wrap",
			ConsumableItem::new, foodItem(FoodValues.MUTTON_WRAP));
	public static final Supplier<Item> CHICKEN_NUGGETS = registerWithTab("chicken_nuggets",
			ConsumableItem::new, foodItem(FFFoodValues.FRIES));

	// Drinks
	public static final Supplier<Item> COLA_SODA = registerWithTab("cola_soda",
			properties -> new ConsumableItem(properties, true), drinkItem(FFFoodValues.ConsumableValues.SODA));
	public static final Supplier<Item> ORANGE_SODA = registerWithTab("orange_soda",
			properties -> new ConsumableItem(properties, true), drinkItem(FFFoodValues.ConsumableValues.SODA));
	public static final Supplier<Item> LEMON_SODA = registerWithTab("lemon_soda",
			properties -> new ConsumableItem(properties, true), drinkItem(FFFoodValues.ConsumableValues.SODA));
	public static final Supplier<Item> CREAMING_SODA = registerWithTab("creaming_soda",
			properties -> new ConsumableItem(properties, true), drinkItem(FFFoodValues.ConsumableValues.SODA));
	public static final Supplier<Item> ICED_TEA = registerWithTab("iced_tea",
			properties -> new ConsumableItem(properties, true), drinkItem(FFFoodValues.ConsumableValues.SODA));

	// Desserts
	public static final Supplier<Item> ICE_CREAM = registerWithTab("ice_cream",
			ConsumableItem::new, foodItem(FFFoodValues.ICE_CREAM_BASIC).craftRemainder(Items.BOWL));
	public static final Supplier<Item> CHOCOLATE_ICE_CREAM = registerWithTab("chocolate_ice_cream",
			ConsumableItem::new, foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
	public static final Supplier<Item> SWEET_BERRY_ICE_CREAM = registerWithTab("sweet_berry_ice_cream",
			ConsumableItem::new, foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
	public static final Supplier<Item> FRUIT_ICE_CREAM = registerWithTab("fruit_ice_cream",
			ConsumableItem::new, foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
	public static final Supplier<Item> APPLE_SAUCE = registerWithTab("apple_sauce",
			ConsumableItem::new, foodItem(FFFoodValues.ICE_CREAM_BASIC).craftRemainder(Items.BOWL));

	public static void touch() {
	}
}
