package fr.alasdiablo.mods.ore.tiny.data.tag;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks.*;
import static fr.alasdiablo.mods.ore.tiny.tag.TinyOreTags.Blocks.*;

@SuppressWarnings("unchecked")
public class BlocksTagsProvider extends BlockTagsProvider {

    public BlocksTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, TinyOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        // Vanilla Ore
        this.tag(ORES_TINY_COAL).add(TINY_COAL_ORE.get(), DEEPSLATE_TINY_COAL_ORE.get());
        this.tag(ORES_TINY_COPPER).add(TINY_COPPER_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get());
        this.tag(ORES_TINY_DIAMOND).add(TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get());
        this.tag(ORES_TINY_EMERALD).add(TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get());
        this.tag(ORES_TINY_GOLD).add(TINY_GOLD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get());
        this.tag(ORES_TINY_IRON).add(TINY_IRON_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get());
        this.tag(ORES_TINY_LAPIS).add(TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get());
        this.tag(ORES_TINY_REDSTONE).add(TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get());

        this.tag(Tags.Blocks.ORES_COAL).add(TINY_COAL_ORE.get(), DEEPSLATE_TINY_COAL_ORE.get());
        this.tag(Tags.Blocks.ORES_COPPER).add(TINY_COPPER_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get());
        this.tag(Tags.Blocks.ORES_DIAMOND).add(TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get());
        this.tag(Tags.Blocks.ORES_EMERALD).add(TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get());
        this.tag(Tags.Blocks.ORES_GOLD).add(TINY_GOLD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get());
        this.tag(Tags.Blocks.ORES_IRON).add(TINY_IRON_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get());
        this.tag(Tags.Blocks.ORES_LAPIS).add(TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get());
        this.tag(Tags.Blocks.ORES_REDSTONE).add(TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get());

        // Modded Ore
        this.tag(ORES_TINY_LEAD);
        this.tag(ORES_TINY_NICKEL);
        this.tag(ORES_TINY_SILVER);
        this.tag(ORES_TINY_SULFUR);
        this.tag(ORES_TINY_TIN);
        this.tag(ORES_TINY_ZINC);

        this.tag(ORES_TINY).addTags(
                // Vanilla Ore
                ORES_TINY_COAL, ORES_TINY_COPPER, ORES_TINY_DIAMOND, ORES_TINY_EMERALD,
                ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS, ORES_TINY_REDSTONE,
                // Modded Ore
                ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER, ORES_TINY_SULFUR,
                ORES_TINY_TIN, ORES_TINY_ZINC
        );

        this.tag(Tags.Blocks.ORES).addTag(ORES_TINY);
        this.tag(Tags.Blocks.ORE_RATES_SPARSE).addTag(ORES_TINY);
        this.tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(
                TINY_COAL_ORE.get(), TINY_COPPER_ORE.get(), TINY_DIAMOND_ORE.get(),
                TINY_EMERALD_ORE.get(), TINY_GOLD_ORE.get(), TINY_IRON_ORE.get(),
                TINY_LAPIS_ORE.get(), TINY_REDSTONE_ORE.get()
        );
        this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(
                DEEPSLATE_TINY_COAL_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get(),
                DEEPSLATE_TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get(),
                DEEPSLATE_TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                TINY_COAL_ORE.get(), DEEPSLATE_TINY_COAL_ORE.get(),
                TINY_COPPER_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get(),
                TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get(),
                TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get(),
                TINY_GOLD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get(),
                TINY_IRON_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get(),
                TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get(),
                TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                TINY_COPPER_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get(),
                TINY_IRON_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get(),
                TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get(),
                TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get(),
                TINY_GOLD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get(),
                TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get()
        );
    }
}
