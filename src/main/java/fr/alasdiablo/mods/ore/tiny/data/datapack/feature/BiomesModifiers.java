package fr.alasdiablo.mods.ore.tiny.data.datapack.feature;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BiomesModifiers {

    public static final ResourceKey<BiomeModifier> ORE_TINY_COAL     = register(TinyOreRegistries.TINY_COAL_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_COPPER   = register(TinyOreRegistries.TINY_COPPER_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_DIAMOND  = register(TinyOreRegistries.TINY_DIAMOND_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_EMERALD  = register(TinyOreRegistries.TINY_EMERALD_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_GOLD     = register(TinyOreRegistries.TINY_GOLD_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_IRON     = register(TinyOreRegistries.TINY_IRON_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_LAPIS    = register(TinyOreRegistries.TINY_LAPIS_ORE);
    public static final ResourceKey<BiomeModifier> ORE_TINY_REDSTONE = register(TinyOreRegistries.TINY_REDSTONE_ORE);

    public static final ResourceKey<BiomeModifier> ORE_TINY_COAL_DESERT       = register(TinyOreRegistries.TINY_COAL_ORE + "_desert");
    public static final ResourceKey<BiomeModifier> ORE_TINY_COAL_SAVANNA      = register(TinyOreRegistries.TINY_COAL_ORE + "_savanna");
    public static final ResourceKey<BiomeModifier> ORE_TINY_COPPER_OCEAN      = register(TinyOreRegistries.TINY_COPPER_ORE + "_ocean");
    public static final ResourceKey<BiomeModifier> ORE_TINY_DIAMOND_JUNGLE    = register(TinyOreRegistries.TINY_DIAMOND_ORE + "_jungle");
    public static final ResourceKey<BiomeModifier> ORE_TINY_EMERALD_MOUNTAIN  = register(TinyOreRegistries.TINY_EMERALD_ORE + "_mountain");
    public static final ResourceKey<BiomeModifier> ORE_TINY_GOLD_BADLANDS     = register(TinyOreRegistries.TINY_GOLD_ORE + "_badlands");
    public static final ResourceKey<BiomeModifier> ORE_TINY_IRON_MOUNTAIN     = register(TinyOreRegistries.TINY_IRON_ORE + "_mountain");
    public static final ResourceKey<BiomeModifier> ORE_TINY_IRON_BIRCH_FOREST = register(TinyOreRegistries.TINY_IRON_ORE + "_birch_forest");
    public static final ResourceKey<BiomeModifier> ORE_TINY_LAPIS_TAIGA       = register(TinyOreRegistries.TINY_LAPIS_ORE + "_taiga");
    public static final ResourceKey<BiomeModifier> ORE_TINY_LAPIS_DARK_FOREST = register(TinyOreRegistries.TINY_LAPIS_ORE + "_dark_forest");
    public static final ResourceKey<BiomeModifier> ORE_TINY_REDSTONE_SWAMP    = register(TinyOreRegistries.TINY_REDSTONE_ORE + "_swap");

    @Contract(value = "_, _ -> new", pure = true)
    public static BiomeModifiers.@NotNull AddFeaturesBiomeModifier createBiomeModifier(HolderSet<Biome> biomes, HolderSet<PlacedFeature> features) {
        return new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes,
                features,
                GenerationStep.Decoration.UNDERGROUND_ORES
        );
    }

    public static void bootstrap(@NotNull BootstrapContext<BiomeModifier> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<Biome>         biomes         = context.lookup(Registries.BIOME);

        context.register(ORE_TINY_COAL, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_COAL))
        ));
        context.register(ORE_TINY_COPPER, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_COPPER))
        ));
        context.register(ORE_TINY_DIAMOND, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_DIAMOND))
        ));
        context.register(ORE_TINY_EMERALD, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_EMERALD))
        ));
        context.register(ORE_TINY_GOLD, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_GOLD))
        ));
        context.register(ORE_TINY_IRON, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_IRON))
        ));
        context.register(ORE_TINY_LAPIS, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_LAPIS))
        ));
        context.register(ORE_TINY_REDSTONE, createBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_REDSTONE))
        ));


        context.register(ORE_TINY_COAL_DESERT, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DESERT),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_COAL_EXTRA))
        ));
        context.register(ORE_TINY_COAL_SAVANNA, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_COAL_EXTRA))
        ));


        context.register(ORE_TINY_COPPER_OCEAN, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_COPPER_EXTRA))
        ));


        context.register(ORE_TINY_DIAMOND_JUNGLE, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_DIAMOND_EXTRA))
        ));


        context.register(ORE_TINY_EMERALD_MOUNTAIN, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_EMERALD_EXTRA))
        ));


        context.register(ORE_TINY_GOLD_BADLANDS, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_BADLANDS),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_GOLD_EXTRA))
        ));


        context.register(ORE_TINY_IRON_MOUNTAIN, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_IRON_MOUNTAIN))
        ));
        context.register(ORE_TINY_IRON_BIRCH_FOREST, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_BIRCH_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_IRON_BIRCH_FOREST))
        ));


        context.register(ORE_TINY_LAPIS_TAIGA, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_TAIGA),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_LAPIS_EXTRA))
        ));
        context.register(ORE_TINY_LAPIS_DARK_FOREST, createBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DARK_FOREST)),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_LAPIS_EXTRA))
        ));


        context.register(ORE_TINY_REDSTONE_SWAMP, createBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(PlacedFeatures.ORE_TINY_REDSTONE_EXTRA))
        ));
    }

    private static @NotNull ResourceKey<BiomeModifier> register(String name) {
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(TinyOre.MOD_ID, name)
        );
    }
}
