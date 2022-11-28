package net.akaneo.fastfooddelight.common.registry;

import net.akaneo.fastfooddelight.FastFoodDelight;
import net.akaneo.fastfooddelight.common.FFFoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

public class FFItems extends ModItems {

    public static Item.Properties basicItem() {
        return (new Item.Properties()).tab(FastFoodDelight.CREATIVE_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).tab(FastFoodDelight.CREATIVE_TAB);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(FastFoodDelight.CREATIVE_TAB);
    }

    public static Item.Properties friesBowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(FFItems.FRIES_BOWL.get()).stacksTo(16).tab(FastFoodDelight.CREATIVE_TAB);
    }

    public static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FastFoodDelight.CREATIVE_TAB);
    }

    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> CHECKOUT_MACHINE;

    public static final RegistryObject<Item> FRIES_BOWL;
    public static final RegistryObject<Item> CHEESE;

    public static final RegistryObject<Item> FRENCH_FRIES;
    public static final RegistryObject<Item> CARROT_FRIES;
    public static final RegistryObject<Item> FRIED_ONIONS;

    public static final RegistryObject<Item> COD_SANDWICH;
    public static final RegistryObject<Item> SALMON_SANDWICH;
    public static final RegistryObject<Item> PORK_SANDWICH;
    public static final RegistryObject<Item> CHEESEBURGER;
    public static final RegistryObject<Item> CHICKEN_CHEESE_SANDWICH;
    public static final RegistryObject<Item> CROQUE_MONSIEUR;
    public static final RegistryObject<Item> RABBIT_SANDWICH;
    public static final RegistryObject<Item> CHEESE_WRAP;
    public static final RegistryObject<Item> CHICKEN_WRAP;
    public static final RegistryObject<Item> CHICKEN_NUGGETS;


    public static final RegistryObject<Item> COLA_SODA;
    public static final RegistryObject<Item> ORANGE_SODA;
    public static final RegistryObject<Item> LEMON_SODA;
    public static final RegistryObject<Item> CREAMING_SODA;
    public static final RegistryObject<Item> ICED_TEA;

    public static final RegistryObject<Item> ICE_CREAM;
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM;
    public static final RegistryObject<Item> SWEET_BERRY_ICE_CREAM;
    public static final RegistryObject<Item> FRUIT_ICE_CREAM;
    public static final RegistryObject<Item> APPLE_SAUCE;





    static {

        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "fastfooddelight");
        CHECKOUT_MACHINE = ITEMS.register("checkout_machine", () -> {
            return new BlockItem((Block) FFBlocks.CHECKOUT_MACHINE.get(), basicItem());
        });
        CHEESE = ITEMS.register("cheese", () -> {
            return new Item(foodItem(FFFoodValues.CHEESE));
        });
        FRIES_BOWL = ITEMS.register("fries_bowl", () -> {
            return new Item(basicItem());
        });

        // Fries

        FRENCH_FRIES = ITEMS.register("french_fries", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.FRIES).craftRemainder(FFItems.FRIES_BOWL.get()));
        });
        CARROT_FRIES = ITEMS.register("carrot_fries", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.FRIES).craftRemainder(FFItems.FRIES_BOWL.get()));
        });
        FRIED_ONIONS = ITEMS.register("fried_onions", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.FRIES).craftRemainder(FFItems.FRIES_BOWL.get()));
        });

        // Burgers

        COD_SANDWICH = ITEMS.register("cod_sandwich", () -> {
            return new Item(foodItem(FFFoodValues.COD_SANDWICH));
        });
        SALMON_SANDWICH = ITEMS.register("salmon_sandwich", () -> {
            return new Item(foodItem(FFFoodValues.SALMON_SANDWICH));
        });
        PORK_SANDWICH = ITEMS.register("pork_sandwich", () -> {
            return new Item(foodItem(FFFoodValues.PORK_SANDWICH));
        });
        CHEESEBURGER = ITEMS.register("cheeseburger", () -> {
            return new Item(foodItem(FFFoodValues.CHEESEBURGER));
        });
        CHICKEN_CHEESE_SANDWICH = ITEMS.register("chicken_cheese_sandwich", () -> {
            return new Item(foodItem(FFFoodValues.CHICKEN_CHEESE_SANDWICH));
        });
        CROQUE_MONSIEUR = ITEMS.register("croque_monsieur", () -> {
            return new Item(foodItem(FFFoodValues.CROQUE_MONSIEUR));
        });
        RABBIT_SANDWICH = ITEMS.register("rabbit_sandwich", () -> {
            return new Item(foodItem(FFFoodValues.RABBIT_SANDWICH));
        });
        CHEESE_WRAP = ITEMS.register("cheese_wrap", () -> {
            return new Item(foodItem(FFFoodValues.CHEESE_WRAP));
        });
        CHICKEN_WRAP = ITEMS.register("chicken_wrap", () -> {
            return new Item(foodItem(FoodValues.MUTTON_WRAP));
        });
        CHICKEN_NUGGETS = ITEMS.register("chicken_nuggets", () -> {
            return new Item(foodItem(FFFoodValues.FRIES));
        });

        // Drinks

        COLA_SODA = ITEMS.register("cola_soda", () -> {
            return new DrinkableItem(drinkItem().food(FFFoodValues.SODA), true, false);
        });
        ORANGE_SODA = ITEMS.register("orange_soda", () -> {
            return new DrinkableItem(drinkItem().food(FFFoodValues.SODA), true, false);
        });
        LEMON_SODA = ITEMS.register("lemon_soda", () -> {
            return new DrinkableItem(drinkItem().food(FFFoodValues.SODA), true, false);
        });
        CREAMING_SODA = ITEMS.register("creaming_soda", () -> {
            return new DrinkableItem(drinkItem().food(FFFoodValues.SODA), true, false);
        });
        ICED_TEA = ITEMS.register("iced_tea", () -> {
            return new DrinkableItem(drinkItem().food(FFFoodValues.SODA), true, false);
        });

        // Desserts

        ICE_CREAM = ITEMS.register("ice_cream", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.ICE_CREAM_BASIC).craftRemainder(Items.BOWL));
        });
        CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
        });
        SWEET_BERRY_ICE_CREAM = ITEMS.register("sweet_berry_ice_cream", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
        });
        FRUIT_ICE_CREAM = ITEMS.register("fruit_ice_cream", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.ICE_CREAM_ADV).craftRemainder(Items.BOWL));
        });
        APPLE_SAUCE = ITEMS.register("apple_sauce", () -> {
            return new ConsumableItem(foodItem(FFFoodValues.ICE_CREAM_BASIC).craftRemainder(Items.BOWL));
        });
    }
}
