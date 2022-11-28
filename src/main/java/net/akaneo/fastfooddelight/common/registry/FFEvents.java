package net.akaneo.fastfooddelight.common.registry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.akaneo.fastfooddelight.FastFoodDelight;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.List;

public class FFEvents {
    @Mod.EventBusSubscriber(modid = FastFoodDelight.MODID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void addCustomTrades(VillagerTradesEvent event) {

            // Fries
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.FRENCH_FRIES.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CARROT_FRIES.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.FRIED_ONIONS.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.MIXED_SALAD.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }

            // Burgers tier 1
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.EGG_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.COD_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.SALMON_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }

            // Burgers tier 2
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHICKEN_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.MUTTON_WRAP.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CHEESE_WRAP.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CHICKEN_WRAP.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.BACON_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.RABBIT_SANDWICH.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }

            // Burgers tier 3
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.HAMBURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 6),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.PORK_SANDWICH.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 6),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CHEESEBURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 7),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CHICKEN_CHEESE_SANDWICH.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 7),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CROQUE_MONSIEUR.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 6),
                        stack, 10, 5, 0.0F));
            }

            // Drinks
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.COLA_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.ORANGE_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.LEMON_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CREAMING_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.ICED_TEA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }

            // Desserts
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.CHOCOLATE_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.SWEET_BERRY_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.FRUIT_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(FFItems.APPLE_SAUCE.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == FFVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.FRUIT_SALAD.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
        }
    }
}