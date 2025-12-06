package fr.alasdiablo.mods.ore.tiny.data.model;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import static fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks.*;

public class ModelsProvider extends ModelProvider {
    public ModelsProvider(PackOutput output) {
        super(output, TinyOre.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(TINY_COAL_ORE.get());
        blockModels.createTrivialCube(TINY_COPPER_ORE.get());
        blockModels.createTrivialCube(TINY_DIAMOND_ORE.get());
        blockModels.createTrivialCube(TINY_EMERALD_ORE.get());
        blockModels.createTrivialCube(TINY_GOLD_ORE.get());
        blockModels.createTrivialCube(TINY_IRON_ORE.get());
        blockModels.createTrivialCube(TINY_LAPIS_ORE.get());
        blockModels.createTrivialCube(TINY_REDSTONE_ORE.get());

        blockModels.createTrivialCube(DEEPSLATE_TINY_COAL_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_COPPER_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_DIAMOND_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_EMERALD_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_GOLD_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_IRON_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_LAPIS_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TINY_REDSTONE_ORE.get());
    }
}
