package fr.alasdiablo.mods.ore.tiny.registry;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class TinyOreBiomeModifiers {
    static final DeferredRegister<BiomeModifier> BIOME_MODIFIER = DeferredRegister.create(
            NeoForgeRegistries.Keys.BIOME_MODIFIERS, TinyOre.MOD_ID);

    public static void init(IEventBus bus) {
        BIOME_MODIFIER.register(bus);
    }
}
