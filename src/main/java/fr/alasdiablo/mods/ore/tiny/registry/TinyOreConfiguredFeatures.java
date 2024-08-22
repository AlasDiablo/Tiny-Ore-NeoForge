package fr.alasdiablo.mods.ore.tiny.registry;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TinyOreConfiguredFeatures {
    private static final RuleTest STONE_ORE_REPLACEABLES     = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    private static final RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

    static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE = DeferredRegister.create(
            Registries.CONFIGURED_FEATURE, TinyOre.MOD_ID);

    private static @NotNull DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> registerOre(
            String name,
            @NotNull DeferredBlock<Block> stoneOre,
            @NotNull DeferredBlock<Block> deepslateOre,
            int size
    ) {
        List<OreConfiguration.TargetBlockState> targetStates = List.of(
                OreConfiguration.target(STONE_ORE_REPLACEABLES, stoneOre.get().defaultBlockState()),
                OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, deepslateOre.get().defaultBlockState())
        );

        return CONFIGURED_FEATURE.register(name, () -> new ConfiguredFeature<>(
                Feature.ORE,
                new OreConfiguration(targetStates, size)
        ));
    }

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_COAL
            = registerOre(TinyOreRegistries.TINY_COAL_ORE, TinyOreBlocks.TINY_COAL_ORE, TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_COPPER
            = registerOre(TinyOreRegistries.TINY_COPPER_ORE, TinyOreBlocks.TINY_COPPER_ORE, TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_DIAMOND
            = registerOre(TinyOreRegistries.TINY_DIAMOND_ORE, TinyOreBlocks.TINY_DIAMOND_ORE, TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_EMERALD
            = registerOre(TinyOreRegistries.TINY_EMERALD_ORE, TinyOreBlocks.TINY_EMERALD_ORE, TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_GOLD
            = registerOre(TinyOreRegistries.TINY_GOLD_ORE, TinyOreBlocks.TINY_GOLD_ORE, TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_IRON
            = registerOre(TinyOreRegistries.TINY_IRON_ORE, TinyOreBlocks.TINY_IRON_ORE, TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_LAPIS
            = registerOre(TinyOreRegistries.TINY_LAPIS_ORE, TinyOreBlocks.TINY_LAPIS_ORE, TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE, 1);

    public static final DeferredHolder<ConfiguredFeature<?, ?>, ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_TINY_REDSTONE
            = registerOre(TinyOreRegistries.TINY_REDSTONE_ORE, TinyOreBlocks.TINY_REDSTONE_ORE, TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE, 1);

    public static void init(IEventBus bus) {
        CONFIGURED_FEATURE.register(bus);
    }
}
