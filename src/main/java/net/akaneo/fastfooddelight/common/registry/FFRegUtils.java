package net.akaneo.fastfooddelight.common.registry;

import net.akaneo.fastfooddelight.FastFoodDelight;
import net.minecraft.core.Registry;

import java.util.function.Supplier;

public class FFRegUtils
{
	public static <R, T extends R> Supplier<T> register(String name, Supplier<T> supplier, Registry<R> registry) {
		T object = supplier.get();
		Registry.register(registry, FastFoodDelight.id(name), object);
		return () -> object;
	}
}
