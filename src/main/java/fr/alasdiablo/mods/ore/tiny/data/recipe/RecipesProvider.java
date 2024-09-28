package fr.alasdiablo.mods.ore.tiny.data.recipe;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks;
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
    private final String modid;

    public RecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this(output, TinyOre.MOD_ID, registries);
    }

    public RecipesProvider(PackOutput output, String modid, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
        this.modid = modid;
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        super.buildRecipes(recipeOutput);

        this.registerTinyOre(TinyOreBlocks.TINY_COAL_ORE, Items.COAL, 0.1f,
                             recipeOutput, TinyOreRegistries.TINY_COAL_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_COAL_ORE, Items.COAL, 0.1f,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_COAL_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_COPPER_ORE, Items.COPPER_INGOT, 0.7F,
                             recipeOutput, TinyOreRegistries.TINY_COPPER_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_COPPER_ORE, Items.COPPER_INGOT, 0.7F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_COPPER_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_DIAMOND_ORE, Items.DIAMOND, 1.0F,
                             recipeOutput, TinyOreRegistries.TINY_DIAMOND_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_DIAMOND_ORE, Items.DIAMOND, 1.0F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_DIAMOND_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_EMERALD_ORE, Items.EMERALD, 1.0F,
                             recipeOutput, TinyOreRegistries.TINY_EMERALD_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_EMERALD_ORE, Items.EMERALD, 1.0F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_EMERALD_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_GOLD_ORE, Items.GOLD_INGOT, 1.0F,
                             recipeOutput, TinyOreRegistries.TINY_GOLD_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_GOLD_ORE, Items.GOLD_INGOT, 1.0F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_GOLD_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_IRON_ORE, Items.IRON_INGOT, 0.7F,
                             recipeOutput, TinyOreRegistries.TINY_IRON_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_IRON_ORE, Items.IRON_INGOT, 0.7F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_IRON_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_LAPIS_ORE, Items.LAPIS_LAZULI, 0.2F,
                             recipeOutput, TinyOreRegistries.TINY_LAPIS_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_LAPIS_ORE, Items.LAPIS_LAZULI, 0.2F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_LAPIS_ORE
        );

        this.registerTinyOre(TinyOreBlocks.TINY_REDSTONE_ORE, Items.REDSTONE, 0.7F,
                             recipeOutput, TinyOreRegistries.TINY_REDSTONE_ORE
        );
        this.registerTinyOre(TinyOreBlocks.DEEPSLATE_TINY_REDSTONE_ORE, Items.REDSTONE, 0.7F,
                             recipeOutput, TinyOreRegistries.DEEPSLATE_TINY_REDSTONE_ORE
        );
    }

    protected void registerTinyOre(ItemLike ingredient, ItemLike result, float experience, RecipeOutput recipeOutput, String name) {
        SimpleCookingRecipeBuilder.smelting(
                        Ingredient.of(ingredient),
                        RecipeCategory.MISC,
                        result,
                        experience,
                        200
                ).group(getItemName(result))
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(this.modid, name + "_smelting"));
        SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(ingredient),
                        RecipeCategory.MISC,
                        result,
                        experience,
                        100
                ).group(getItemName(result))
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(this.modid, name + "_blasting"));
    }
}
