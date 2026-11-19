package net.akaneo.fastfooddelight.common.registry;

import net.akaneo.fastfooddelight.FastFoodDelight;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class FFCreativeTabs
{
	public static final Supplier<CreativeModeTab> TAB_FAST_FOOD_DELIGHT = FFRegUtils.register(FastFoodDelight.MODID,
			() -> FabricCreativeModeTab.builder()
					.title(Component.translatable("itemGroup.fastfooddelight"))
					.icon(() -> new ItemStack(FFItems.FRENCH_FRIES.get()))
					.displayItems((parameters, output) -> FFItems.CREATIVE_TAB_ITEMS.forEach(item -> output.accept(item.get())))
					.build(),
			BuiltInRegistries.CREATIVE_MODE_TAB);

	public static void touch() {
	}
}
