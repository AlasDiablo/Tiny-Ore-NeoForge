package fr.alasdiablo.mods.ore.tiny.data.datapack;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ConfiguredFeatures {
    private static final RuleTest STONE_ORE_REPLACEABLES     = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    private static final RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_COAL     = register(TinyOreRegistries.TINY_COAL_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_COPPER   = register(TinyOreRegistries.TINY_COPPER_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_DIAMOND  = register(TinyOreRegistries.TINY_DIAMOND_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_EMERALD  = register(TinyOreRegistries.TINY_EMERALD_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_GOLD     = register(TinyOreRegistries.TINY_GOLD_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_IRON     = register(TinyOreRegistries.TINY_IRON_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_LAPIS    = register(TinyOreRegistries.TINY_LAPIS_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_REDSTONE = register(TinyOreRegistries.TINY_REDSTONE_ORE);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_COAL_EXTRA     = register(TinyOreRegistries.TINY_COAL_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_COPPER_EXTRA   = register(TinyOreRegistries.TINY_COPPER_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_DIAMOND_EXTRA  = register(TinyOreRegistries.TINY_DIAMOND_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_EMERALD_EXTRA  = register(TinyOreRegistries.TINY_EMERALD_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_GOLD_EXTRA     = register(TinyOreRegistries.TINY_GOLD_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_IRON_EXTRA     = register(TinyOreRegistries.TINY_IRON_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_LAPIS_EXTRA    = register(TinyOreRegistries.TINY_LAPIS_ORE + "_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TINY_REDSTONE_EXTRA = register(TinyOreRegistries.TINY_REDSTONE_ORE + "_extra");

    private static @NotNull ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>> createConfiguredFeature(
            @NotNull DeferredBlock<Block> stoneOre,
            @NotNull DeferredBlock<Block> deepslateOre
    ) {
        return createConfiguredFeature(stoneOre, deepslateOre, 4);
    }

    private static @NotNull ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>> createConfiguredFeature(
            @NotNull DeferredBlock<Block> stoneOre,
            @NotNull DeferredBlock<Block> deepslateOre,
            int size
    ) {
        List<OreConfiguration.TargetBlockState> targetStates = List.of(
                OreConfiguration.target(STONE_ORE_REPLACEABLES, stoneOre.get().defaultBlockState()),
                OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, deepslateOre.get().defaultBlockState())
        );

        return new ConfiguredFeature<>(
                Feature.ORE,
                new OreConfiguration(targetStates, size)
        );
    }

    public static void bootstrap(@NotNull BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.register(ORE_TINY_COAL, createConfiguredFeature(TinyOreBlocks.TINY_COAL_ORE, TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE));
        context.register(ORE_TINY_COPPER, createConfiguredFeature(TinyOreBlocks.TINY_COPPER_ORE, TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE));
        context.register(ORE_TINY_DIAMOND, createConfiguredFeature(TinyOreBlocks.TINY_DIAMOND_ORE, TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE));
        context.register(ORE_TINY_EMERALD, createConfiguredFeature(TinyOreBlocks.TINY_EMERALD_ORE, TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE));
        context.register(ORE_TINY_GOLD, createConfiguredFeature(TinyOreBlocks.TINY_GOLD_ORE, TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE));
        context.register(ORE_TINY_IRON, createConfiguredFeature(TinyOreBlocks.TINY_IRON_ORE, TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE));
        context.register(ORE_TINY_LAPIS, createConfiguredFeature(TinyOreBlocks.TINY_LAPIS_ORE, TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE));
        context.register(ORE_TINY_REDSTONE, createConfiguredFeature(TinyOreBlocks.TINY_REDSTONE_ORE, TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE));

        context.register(ORE_TINY_COAL_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_COAL_ORE, TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE, 18));
        context.register(ORE_TINY_COPPER_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_COPPER_ORE, TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE, 18));
        context.register(ORE_TINY_DIAMOND_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_DIAMOND_ORE, TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE, 12));
        context.register(ORE_TINY_EMERALD_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_EMERALD_ORE, TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE, 8));
        context.register(ORE_TINY_GOLD_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_GOLD_ORE, TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE, 16));
        context.register(ORE_TINY_IRON_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_IRON_ORE, TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE, 12));
        context.register(ORE_TINY_LAPIS_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_LAPIS_ORE, TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE, 12));
        context.register(ORE_TINY_REDSTONE_EXTRA, createConfiguredFeature(TinyOreBlocks.TINY_REDSTONE_ORE, TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE, 12));
    }

    private static @NotNull ResourceKey<ConfiguredFeature<?, ?>> register(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(TinyOre.MOD_ID, name)
        );
    }
}
