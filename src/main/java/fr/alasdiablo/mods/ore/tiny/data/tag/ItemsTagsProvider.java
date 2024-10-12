package fr.alasdiablo.mods.ore.tiny.data.tag;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.tag.TinyOreTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemsTagsProvider extends ItemTagsProvider {
    public ItemsTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookup,
            @NotNull TagsProvider<Block> blockTagsProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookup, blockTagsProvider.contentsGetter(), TinyOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Vanilla Ore
        this.copy(TinyOreTags.Blocks.ORES_TINY_COAL, TinyOreTags.Items.ORES_TINY_COAL);
        this.copy(TinyOreTags.Blocks.ORES_TINY_COPPER, TinyOreTags.Items.ORES_TINY_COPPER);
        this.copy(TinyOreTags.Blocks.ORES_TINY_DIAMOND, TinyOreTags.Items.ORES_TINY_DIAMOND);
        this.copy(TinyOreTags.Blocks.ORES_TINY_EMERALD, TinyOreTags.Items.ORES_TINY_EMERALD);
        this.copy(TinyOreTags.Blocks.ORES_TINY_GOLD, TinyOreTags.Items.ORES_TINY_GOLD);
        this.copy(TinyOreTags.Blocks.ORES_TINY_IRON, TinyOreTags.Items.ORES_TINY_IRON);
        this.copy(TinyOreTags.Blocks.ORES_TINY_LAPIS, TinyOreTags.Items.ORES_TINY_LAPIS);
        this.copy(TinyOreTags.Blocks.ORES_TINY_REDSTONE, TinyOreTags.Items.ORES_TINY_REDSTONE);

        this.copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        this.copy(Tags.Blocks.ORES_COPPER, Tags.Items.ORES_COPPER);
        this.copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        this.copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        this.copy(Tags.Blocks.ORES_GOLD, Tags.Items.ORES_GOLD);
        this.copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        this.copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        this.copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);

        // Modded Ore
        this.copy(TinyOreTags.Blocks.ORES_TINY_LEAD, TinyOreTags.Items.ORES_TINY_LEAD);
        this.copy(TinyOreTags.Blocks.ORES_TINY_NICKEL, TinyOreTags.Items.ORES_TINY_NICKEL);
        this.copy(TinyOreTags.Blocks.ORES_TINY_SILVER, TinyOreTags.Items.ORES_TINY_SILVER);
        this.copy(TinyOreTags.Blocks.ORES_TINY_SULFUR, TinyOreTags.Items.ORES_TINY_SULFUR);
        this.copy(TinyOreTags.Blocks.ORES_TINY_TIN, TinyOreTags.Items.ORES_TINY_TIN);
        this.copy(TinyOreTags.Blocks.ORES_TINY_ZINC, TinyOreTags.Items.ORES_TINY_ZINC);

        this.copy(TinyOreTags.Blocks.ORES_LEAD, TinyOreTags.Items.ORES_LEAD);
        this.copy(TinyOreTags.Blocks.ORES_NICKEL, TinyOreTags.Items.ORES_NICKEL);
        this.copy(TinyOreTags.Blocks.ORES_SILVER, TinyOreTags.Items.ORES_SILVER);
        this.copy(TinyOreTags.Blocks.ORES_SULFUR, TinyOreTags.Items.ORES_SULFUR);
        this.copy(TinyOreTags.Blocks.ORES_TIN, TinyOreTags.Items.ORES_TIN);
        this.copy(TinyOreTags.Blocks.ORES_ZINC, TinyOreTags.Items.ORES_ZINC);


        this.copy(TinyOreTags.Blocks.ORES_TINY, TinyOreTags.Items.ORES_TINY);

        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
        this.copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        this.copy(Tags.Blocks.ORES_IN_GROUND_STONE, Tags.Items.ORES_IN_GROUND_STONE);
        this.copy(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, Tags.Items.ORES_IN_GROUND_DEEPSLATE);
    }
}
