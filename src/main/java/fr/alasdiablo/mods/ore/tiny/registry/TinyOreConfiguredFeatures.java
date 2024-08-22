package fr.alasdiablo.mods.ore.tiny.registry;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TinyOreConfiguredFeatures {
    static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE = DeferredRegister.create(
            Registries.CONFIGURED_FEATURE, TinyOre.MOD_ID);

    public static void init(IEventBus bus) {
        CONFIGURED_FEATURE.register(bus);
    }
}
