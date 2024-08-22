package fr.alasdiablo.mods.ore.tiny.data;

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

public class ItemsTagsProvider  extends ItemTagsProvider {
    public ItemsTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookup,
            @NotNull TagsProvider<Block> blockTagsProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookup, blockTagsProvider.contentsGetter(), TinyOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.copy(TinyOreTags.Blocks.ORES_TINY_COAL, TinyOreTags.Items.ORES_TINY_COAL);
        this.copy(TinyOreTags.Blocks.ORES_TINY_COPPER, TinyOreTags.Items.ORES_TINY_COPPER);
        this.copy(TinyOreTags.Blocks.ORES_TINY_DIAMOND, TinyOreTags.Items.ORES_TINY_DIAMOND);
        this.copy(TinyOreTags.Blocks.ORES_TINY_EMERALD, TinyOreTags.Items.ORES_TINY_EMERALD);
        this.copy(TinyOreTags.Blocks.ORES_TINY_GOLD, TinyOreTags.Items.ORES_TINY_GOLD);
        this.copy(TinyOreTags.Blocks.ORES_TINY_IRON, TinyOreTags.Items.ORES_TINY_IRON);
        this.copy(TinyOreTags.Blocks.ORES_TINY_LAPIS, TinyOreTags.Items.ORES_TINY_LAPIS);
        this.copy(TinyOreTags.Blocks.ORES_TINY_REDSTONE, TinyOreTags.Items.ORES_TINY_REDSTONE);

        this.copy(TinyOreTags.Blocks.ORES_TINY, TinyOreTags.Items.ORES_TINY);

        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
    }
}
