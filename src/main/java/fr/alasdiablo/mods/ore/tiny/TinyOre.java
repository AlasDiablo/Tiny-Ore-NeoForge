package fr.alasdiablo.mods.ore.tiny;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.ore.tiny.data.datapack.DatapackEntriesProvider;
import fr.alasdiablo.mods.ore.tiny.data.lang.LanguagesProvider;
import fr.alasdiablo.mods.ore.tiny.data.loot.LootTablesProvider;
import fr.alasdiablo.mods.ore.tiny.data.model.ModelsProvider;
import fr.alasdiablo.mods.ore.tiny.data.recipe.RecipesProvider;
import fr.alasdiablo.mods.ore.tiny.data.tag.BlocksTagsProvider;
import fr.alasdiablo.mods.ore.tiny.data.tag.ItemsTagsProvider;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreCreativeTabs;
import fr.alasdiablo.mods.ore.tiny.tag.TinyOreTags;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(TinyOre.MOD_ID)
public class TinyOre {
    public static final String MOD_ID = "dio_tiny_ore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TinyOre(IEventBus modEventBus, ModContainer modContainer) {
        TinyOreTags.Items.init();
        TinyOreTags.Blocks.init();

        TinyOreBlocks.init(modEventBus);
        TinyOreCreativeTabs.init(modEventBus);

        modEventBus.addListener(this::gatherData);
    }

    private void gatherData(@NotNull GatherDataEvent.Client event) {
        TinyOre.LOGGER.debug("Start data generator");

        TinyOre.LOGGER.debug("Add Client Provider");

        TinyOre.LOGGER.debug("Add Block State Provider");
        event.createProvider(ModelsProvider::new);

        TinyOre.LOGGER.debug("Add Language Provider");
        event.createProvider(LanguagesProvider.French.Canada::new);
        event.createProvider(LanguagesProvider.French.France::new);

        event.createProvider(LanguagesProvider.English.Australia::new);
        event.createProvider(LanguagesProvider.English.Canada::new);
        event.createProvider(LanguagesProvider.English.NewZealand::new);
        event.createProvider(LanguagesProvider.English.UnitedKingdom::new);
        event.createProvider(LanguagesProvider.English.UnitedStates::new);

        TinyOre.LOGGER.debug("Add Server Provider");

        TinyOre.LOGGER.debug("Add Tags Provider");
        event.createBlockAndItemTags(BlocksTagsProvider::new, ItemsTagsProvider::new);

        TinyOre.LOGGER.debug("Add Datapack Provider");
        event.createProvider(DatapackEntriesProvider::new);

        TinyOre.LOGGER.debug("Add Loot Table Provider");
        event.createProvider(LootTablesProvider::new);

        TinyOre.LOGGER.debug("Add Recipes Provider");
        event.createProvider(RecipesProvider.Runner::new);
    }
}
