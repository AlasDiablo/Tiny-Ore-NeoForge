package fr.alasdiablo.mods.ore.tiny.data.datapack;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_TINY_COAL     = register(TinyOreRegistries.TINY_COAL_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_COPPER   = register(TinyOreRegistries.TINY_COPPER_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_DIAMOND  = register(TinyOreRegistries.TINY_DIAMOND_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_EMERALD  = register(TinyOreRegistries.TINY_EMERALD_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_GOLD     = register(TinyOreRegistries.TINY_GOLD_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_IRON     = register(TinyOreRegistries.TINY_IRON_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_LAPIS    = register(TinyOreRegistries.TINY_LAPIS_ORE);
    public static final ResourceKey<PlacedFeature> ORE_TINY_REDSTONE = register(TinyOreRegistries.TINY_REDSTONE_ORE);

    public static final ResourceKey<PlacedFeature> ORE_TINY_COAL_EXTRA     = register(TinyOreRegistries.TINY_COAL_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_COPPER_EXTRA   = register(TinyOreRegistries.TINY_COPPER_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_DIAMOND_EXTRA  = register(TinyOreRegistries.TINY_DIAMOND_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_EMERALD_EXTRA  = register(TinyOreRegistries.TINY_EMERALD_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_GOLD_EXTRA     = register(TinyOreRegistries.TINY_GOLD_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_IRON_EXTRA     = register(TinyOreRegistries.TINY_IRON_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_LAPIS_EXTRA    = register(TinyOreRegistries.TINY_LAPIS_ORE + "_extra");
    public static final ResourceKey<PlacedFeature> ORE_TINY_REDSTONE_EXTRA = register(TinyOreRegistries.TINY_REDSTONE_ORE + "_extra");

    private static @NotNull PlacedFeature createPlacedFeature(
            Holder.Reference<ConfiguredFeature<?, ?>> configuredFeature, int count, HeightRangePlacement heightRange
    ) {
        return new PlacedFeature(configuredFeature, List.of(CountPlacement.of(count), InSquarePlacement.spread(), heightRange, BiomeFilter.biome()));
    }

    private static @NotNull PlacedFeature createDefaultPlacedFeature(
            Holder.Reference<ConfiguredFeature<?, ?>> configuredFeature
    ) {
        return createPlacedFeature(configuredFeature, 8, HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(127)));
    }

    private static @NotNull PlacedFeature createExtraPlacedFeature(
            Holder.Reference<ConfiguredFeature<?, ?>> configuredFeature, int count, VerticalAnchor bottom, VerticalAnchor top
    ) {
        return createPlacedFeature(configuredFeature, count, HeightRangePlacement.triangle(bottom, top));
    }

    public static void bootstrap(@NotNull BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        context.register(ORE_TINY_COAL, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_COAL)));
        context.register(ORE_TINY_COPPER, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_COPPER)));
        context.register(ORE_TINY_DIAMOND, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_DIAMOND)));
        context.register(ORE_TINY_EMERALD, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_EMERALD)));
        context.register(ORE_TINY_GOLD, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_GOLD)));
        context.register(ORE_TINY_IRON, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_IRON)));
        context.register(ORE_TINY_LAPIS, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_LAPIS)));
        context.register(ORE_TINY_REDSTONE, createDefaultPlacedFeature(configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_REDSTONE)));


        context.register(
                ORE_TINY_COAL_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_COAL_EXTRA),
                        28,
                        VerticalAnchor.absolute(-12),
                        VerticalAnchor.absolute(127)
                )
        );
        context.register(
                ORE_TINY_COPPER_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_COPPER_EXTRA),
                        20,
                        VerticalAnchor.absolute(-12),
                        VerticalAnchor.absolute(60)
                )
        );
        context.register(
                ORE_TINY_DIAMOND_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_DIAMOND_EXTRA),
                        12,
                        VerticalAnchor.BOTTOM,
                        VerticalAnchor.absolute(24)
                )
        );
        context.register(
                ORE_TINY_EMERALD_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_EMERALD_EXTRA),
                        8,
                        VerticalAnchor.BOTTOM,
                        VerticalAnchor.absolute(24)
                )
        );
        context.register(
                ORE_TINY_GOLD_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_GOLD_EXTRA),
                        20,
                        VerticalAnchor.absolute(-28),
                        VerticalAnchor.absolute(32)
                )
        );
        context.register(
                ORE_TINY_IRON_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_IRON_EXTRA),
                        20,
                        VerticalAnchor.absolute(-12),
                        VerticalAnchor.absolute(52)
                )
        );
        context.register(
                ORE_TINY_LAPIS_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_LAPIS_EXTRA),
                        12,
                        VerticalAnchor.absolute(-32),
                        VerticalAnchor.absolute(32)
                )
        );
        context.register(
                ORE_TINY_REDSTONE_EXTRA,
                createExtraPlacedFeature(
                        configuredFeatures.getOrThrow(ConfiguredFeatures.ORE_TINY_REDSTONE_EXTRA),
                        12,
                        VerticalAnchor.absolute(-38),
                        VerticalAnchor.absolute(32)
                )
        );
    }

    private static @NotNull ResourceKey<PlacedFeature> register(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(TinyOre.MOD_ID, name));
    }
}
