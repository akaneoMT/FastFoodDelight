package net.akaneo.fastfooddelight;

import net.akaneo.fastfooddelight.common.FFConfiguration;
import net.akaneo.fastfooddelight.common.registry.FFBlocks;
import net.akaneo.fastfooddelight.common.registry.FFCreativeTabs;
import net.akaneo.fastfooddelight.common.registry.FFItems;
import net.akaneo.fastfooddelight.common.registry.FFVillagers;
import net.akaneo.fastfooddelight.common.world.FFVillageStructures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FastFoodDelight implements ModInitializer {
    public static final String MODID = "fastfooddelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(FastFoodDelight.class);

    public static Identifier id(String name) {
        return Identifier.fromNamespaceAndPath(MODID, name);
    }

    @Override
    public void onInitialize() {
        FFConfiguration.touch();

        FFBlocks.touch();
        FFItems.touch();
        FFCreativeTabs.touch();
        FFVillagers.touch();

        FFVillageStructures.init();
    }
}