package net.akaneo.fastfooddelight.common.registry;
import com.google.common.collect.ImmutableSet;
import net.akaneo.fastfooddelight.FastFoodDelight;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class FFVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, FastFoodDelight.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, FastFoodDelight.MODID);

    public static final RegistryObject<PoiType> CHECKOUT_MACHINE_POI = POI_TYPES.register("checkout_machine_poi",
            () -> new PoiType(ImmutableSet.copyOf(FFBlocks.CHECKOUT_MACHINE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> FAST_FOOD_WAITER = VILLAGER_PROFESSIONS.register("fast_food_waiter",
            () -> new VillagerProfession("fast_food_waiter", x -> x.get() == CHECKOUT_MACHINE_POI.get(),
                    x -> x.get() == CHECKOUT_MACHINE_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_BUTCHER));


    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, CHECKOUT_MACHINE_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}