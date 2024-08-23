package fr.alasdiablo.mods.ore.tiny.data;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
import fr.alasdiablo.mods.resources.ExtendedResourcesRegistries;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends RecipeProvider {

    public RecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        super.buildRecipes(recipeOutput);

        this.registerTinyOre(TinyOreBlocks.TINY_COAL_ORE, ExtendedResourcesItems.COAL_NUGGET, 0.1f,
                             ExtendedResourcesRegistries.COAL_NUGGET, recipeOutput, TinyOreRegistries.TINY_COAL_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE, ExtendedResourcesItems.COAL_NUGGET, 0.1f,
                             ExtendedResourcesRegistries.COAL_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_COAL_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_COPPER_ORE, ExtendedResourcesItems.COPPER_NUGGET, 0.7F,
                             ExtendedResourcesRegistries.COPPER_NUGGET, recipeOutput, TinyOreRegistries.TINY_COPPER_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE, ExtendedResourcesItems.COPPER_NUGGET, 0.7F,
                             ExtendedResourcesRegistries.COPPER_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_COPPER_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_DIAMOND_ORE, ExtendedResourcesItems.DIAMOND_NUGGET, 1.0F,
                             ExtendedResourcesRegistries.DIAMOND_NUGGET, recipeOutput, TinyOreRegistries.TINY_DIAMOND_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE, ExtendedResourcesItems.DIAMOND_NUGGET, 1.0F,
                             ExtendedResourcesRegistries.DIAMOND_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_DIAMOND_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_EMERALD_ORE, ExtendedResourcesItems.EMERALD_NUGGET, 1.0F,
                             ExtendedResourcesRegistries.EMERALD_NUGGET, recipeOutput, TinyOreRegistries.TINY_EMERALD_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE, ExtendedResourcesItems.EMERALD_NUGGET, 1.0F,
                             ExtendedResourcesRegistries.EMERALD_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_EMERALD_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_GOLD_ORE, Items.GOLD_NUGGET, 1.0F,
                             "gold_nugget", recipeOutput, TinyOreRegistries.TINY_GOLD_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE, Items.GOLD_NUGGET, 1.0F,
                             "gold_nugget", recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_GOLD_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_IRON_ORE, Items.IRON_NUGGET, 0.7F,
                             "iron_nugget", recipeOutput, TinyOreRegistries.TINY_IRON_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE, Items.IRON_NUGGET, 0.7F,
                             "iron_nugget", recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_IRON_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_LAPIS_ORE, ExtendedResourcesItems.LAPIS_NUGGET, 0.2F,
                             ExtendedResourcesRegistries.LAPIS_NUGGET, recipeOutput, TinyOreRegistries.TINY_LAPIS_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE, ExtendedResourcesItems.LAPIS_NUGGET, 0.2F,
                             ExtendedResourcesRegistries.LAPIS_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_LAPIS_ORE);

        this.registerTinyOre(TinyOreBlocks.TINY_REDSTONE_ORE, ExtendedResourcesItems.REDSTONE_NUGGET, 0.7F,
                             ExtendedResourcesRegistries.REDSTONE_NUGGET, recipeOutput, TinyOreRegistries.TINY_REDSTONE_ORE);
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE, ExtendedResourcesItems.REDSTONE_NUGGET, 0.7F,
                             ExtendedResourcesRegistries.REDSTONE_NUGGET, recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_REDSTONE_ORE);
    }

    private void registerTinyOre(ItemLike ingredient, ItemLike result, float experience, String group, RecipeOutput recipeOutput, String name) {
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ingredient),
                        RecipeCategory.MISC,
                        result,
                        experience,
                        200
                ).group(group)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(TinyOre.MOD_ID, name + "_smelting"));
        SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(ingredient),
                        RecipeCategory.MISC,
                        result,
                        experience,
                        100
                ).group(group)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(TinyOre.MOD_ID, name + "_blasting"));
    }
}
