package fr.alasdiablo.mods.ore.tiny;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.ore.tiny.data.datapack.DatapackEntriesProvider;
import fr.alasdiablo.mods.ore.tiny.data.lang.LanguagesProvider;
import fr.alasdiablo.mods.ore.tiny.data.loot.LootTablesProvider;
import fr.alasdiablo.mods.ore.tiny.data.model.BlockStatesProvider;
import fr.alasdiablo.mods.ore.tiny.data.recipe.RecipesProvider;
import fr.alasdiablo.mods.ore.tiny.data.tag.BlocksTagsProvider;
import fr.alasdiablo.mods.ore.tiny.data.tag.ItemsTagsProvider;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreCreativeTabs;
import fr.alasdiablo.mods.ore.tiny.tag.TinyOreTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

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

    private void gatherData(@NotNull GatherDataEvent event) {
        TinyOre.LOGGER.debug("Start data generator");
        final DataGenerator                            generator          = event.getGenerator();
        final PackOutput                               output             = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup             = event.getLookupProvider();
        final ExistingFileHelper                       existingFileHelper = event.getExistingFileHelper();

        TinyOre.LOGGER.debug("Add Client Provider");

        TinyOre.LOGGER.debug("Add Block State Provider");
        generator.addProvider(event.includeClient(), new BlockStatesProvider(output, existingFileHelper));

        TinyOre.LOGGER.debug("Add Language Provider");
        generator.addProvider(event.includeClient(), new LanguagesProvider.French.Canada(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.French.France(output));

        generator.addProvider(event.includeClient(), new LanguagesProvider.English.Australia(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.English.Canada(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.English.NewZealand(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.English.UnitedKingdom(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.English.UnitedStates(output));

        TinyOre.LOGGER.debug("Add Server Provider");

        TinyOre.LOGGER.debug("Add Tags Provider");
        final BlocksTagsProvider blockTagsProvider = new BlocksTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ItemsTagsProvider(output, lookup, blockTagsProvider, existingFileHelper));

        TinyOre.LOGGER.debug("Add Datapack Provider");
        generator.addProvider(event.includeServer(), new DatapackEntriesProvider(output, lookup));

        TinyOre.LOGGER.debug("Add Loot Table Provider");
        generator.addProvider(event.includeServer(), new LootTablesProvider(output, lookup));

        TinyOre.LOGGER.debug("Add Recipes Provider");
        generator.addProvider(event.includeServer(), new RecipesProvider(output, lookup));
    }
}
