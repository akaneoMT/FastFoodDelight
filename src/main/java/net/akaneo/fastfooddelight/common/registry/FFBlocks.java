package net.akaneo.fastfooddelight.common.registry;

import net.akaneo.fastfooddelight.FastFoodDelight;
import net.akaneo.fastfooddelight.common.block.CheckoutMachineBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

public class FFBlocks
{
	public static ResourceKey<Block> key(String path) {
		return ResourceKey.create(Registries.BLOCK, FastFoodDelight.id(path));
	}

	private static Supplier<Block> regBlock(final String name, final Function<BlockBehaviour.Properties, Block> function, final BlockBehaviour.Properties properties) {
		properties.setId(key(name));
		return FFRegUtils.register(name, () -> function.apply(properties), BuiltInRegistries.BLOCK);
	}

	// Workstations
	public static final Supplier<Block> CHECKOUT_MACHINE = regBlock("checkout_machine",
			CheckoutMachineBlock::new, Block.Properties.of().mapColor(MapColor.METAL).strength(0.5F, 6.0F).sound(SoundType.LANTERN).noOcclusion());

	public static void touch() {
	}
}
