package fr.alasdiablo.mods.ore.tiny.data.model;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks.*;

public class BlockStatesProvider extends BlockStateProvider {
    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        this(output, TinyOre.MOD_ID, exFileHelper);
    }

    public BlockStatesProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(TINY_COAL_ORE.get());
        this.simpleBlockWithItem(TINY_COPPER_ORE.get());
        this.simpleBlockWithItem(TINY_DIAMOND_ORE.get());
        this.simpleBlockWithItem(TINY_EMERALD_ORE.get());
        this.simpleBlockWithItem(TINY_GOLD_ORE.get());
        this.simpleBlockWithItem(TINY_IRON_ORE.get());
        this.simpleBlockWithItem(TINY_LAPIS_ORE.get());
        this.simpleBlockWithItem(TINY_REDSTONE_ORE.get());

        this.simpleBlockWithItem(DEEPSLATE_TINY_COAL_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_COPPER_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_DIAMOND_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_EMERALD_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_GOLD_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_IRON_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_LAPIS_ORE.get());
        this.simpleBlockWithItem(DEEPSLATE_TINY_REDSTONE_ORE.get());
    }

    protected void simpleBlockWithItem(Block block) {
        this.simpleBlockWithItem(block, this.cubeAll(block));
    }
}
