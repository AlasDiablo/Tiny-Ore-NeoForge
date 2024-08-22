package fr.alasdiablo.mods.ore.tiny;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreCreativeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import org.slf4j.Logger;

public class TinyOre {
    public static final String MOD_ID = "dio_tiny_ore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TinyOre(IEventBus modEventBus, ModContainer modContainer) {
        TinyOreBlocks.init(modEventBus);
        TinyOreCreativeTabs.init(modEventBus);
    }
}
