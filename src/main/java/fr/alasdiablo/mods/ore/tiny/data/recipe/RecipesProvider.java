package fr.alasdiablo.mods.ore.tiny.data.recipe;

import fr.alasdiablo.mods.lib.data.DioRecipieProvider;
import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends DioRecipieProvider {

    public RecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(TinyOre.MOD_ID, registries, output);
    }

    @Override
    protected void buildRecipes() {
        this.oreCooking(TinyOreBlocks.TINY_COAL_ORE, Items.COAL, 0.1f, TinyOreRegistries.TINY_COAL_ORE);
        this.oreCooking(TinyOreBlocks.TINY_COPPER_ORE, Items.COAL, 0.7f, TinyOreRegistries.TINY_COPPER_ORE);
        this.oreCooking(TinyOreBlocks.TINY_DIAMOND_ORE, Items.COAL, 1.0f, TinyOreRegistries.TINY_DIAMOND_ORE);
        this.oreCooking(TinyOreBlocks.TINY_EMERALD_ORE, Items.COAL, 1.0f, TinyOreRegistries.TINY_EMERALD_ORE);
        this.oreCooking(TinyOreBlocks.TINY_GOLD_ORE, Items.COAL, 1.0f, TinyOreRegistries.TINY_GOLD_ORE);
        this.oreCooking(TinyOreBlocks.TINY_IRON_ORE, Items.COAL, 0.7f, TinyOreRegistries.TINY_IRON_ORE);
        this.oreCooking(TinyOreBlocks.TINY_LAPIS_ORE, Items.COAL, 0.2f, TinyOreRegistries.TINY_LAPIS_ORE);
        this.oreCooking(TinyOreBlocks.TINY_REDSTONE_ORE, Items.COAL, 0.7f, TinyOreRegistries.TINY_REDSTONE_ORE);

        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE, Items.COAL, 0.1f, TinyOreRegistries.DEEPSLATE_TINY_COAL_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE, Items.COAL, 0.7f, TinyOreRegistries.DEEPSLATE_TINY_COPPER_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE, Items.COAL, 1.0f, TinyOreRegistries.DEEPSLATE_TINY_DIAMOND_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE, Items.COAL, 1.0f, TinyOreRegistries.DEEPSLATE_TINY_EMERALD_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE, Items.COAL, 1.0f, TinyOreRegistries.DEEPSLATE_TINY_GOLD_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE, Items.COAL, 0.7f, TinyOreRegistries.DEEPSLATE_TINY_IRON_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE, Items.COAL, 0.2f, TinyOreRegistries.DEEPSLATE_TINY_LAPIS_ORE);
        this.oreCooking(TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE, Items.COAL, 0.7f, TinyOreRegistries.DEEPSLATE_TINY_REDSTONE_ORE);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput output) {
            return new RecipesProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Dio's Tiny Ore Recipes Provider";
        }
    }
}
