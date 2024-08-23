package fr.alasdiablo.mods.ore.tiny.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class TinyOreTags {
    public static class Items {
        public static void init() {}

        public static final TagKey<Item> ORES_TINY = commonTag("ores/tiny");

        public static final TagKey<Item> ORES_TINY_COAL     = commonTag("ores/tiny/coal");
        public static final TagKey<Item> ORES_TINY_COPPER   = commonTag("ores/tiny/copper");
        public static final TagKey<Item> ORES_TINY_DIAMOND  = commonTag("ores/tiny/diamond");
        public static final TagKey<Item> ORES_TINY_EMERALD  = commonTag("ores/tiny/emerald");
        public static final TagKey<Item> ORES_TINY_GOLD     = commonTag("ores/tiny/gold");
        public static final TagKey<Item> ORES_TINY_IRON     = commonTag("ores/tiny/iron");
        public static final TagKey<Item> ORES_TINY_LAPIS    = commonTag("ores/tiny/lapis");
        public static final TagKey<Item> ORES_TINY_REDSTONE = commonTag("ores/tiny/redstone");


        private static @NotNull TagKey<Item> commonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Blocks {
        public static void init() {}

        public static final TagKey<Block> ORES_TINY = commonTag("ores/tiny");

        public static final TagKey<Block> ORES_TINY_COAL     = commonTag("ores/tiny/coal");
        public static final TagKey<Block> ORES_TINY_COPPER   = commonTag("ores/tiny/copper");
        public static final TagKey<Block> ORES_TINY_DIAMOND  = commonTag("ores/tiny/diamond");
        public static final TagKey<Block> ORES_TINY_EMERALD  = commonTag("ores/tiny/emerald");
        public static final TagKey<Block> ORES_TINY_GOLD     = commonTag("ores/tiny/gold");
        public static final TagKey<Block> ORES_TINY_IRON     = commonTag("ores/tiny/iron");
        public static final TagKey<Block> ORES_TINY_LAPIS    = commonTag("ores/tiny/lapis");
        public static final TagKey<Block> ORES_TINY_REDSTONE = commonTag("ores/tiny/redstone");


        private static @NotNull TagKey<Block> commonTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
