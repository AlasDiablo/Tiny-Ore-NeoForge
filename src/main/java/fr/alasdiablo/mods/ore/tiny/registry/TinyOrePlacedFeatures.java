package fr.alasdiablo.mods.ore.tiny.registry;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TinyOrePlacedFeatures {
    static final DeferredRegister<PlacedFeature> PLACED_FEATURE = DeferredRegister.create(
            Registries.PLACED_FEATURE, TinyOre.MOD_ID);

    public static void init(IEventBus bus) {
        PLACED_FEATURE.register(bus);
    }
}
