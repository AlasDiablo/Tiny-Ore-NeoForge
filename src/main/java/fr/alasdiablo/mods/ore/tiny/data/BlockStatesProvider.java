package fr.alasdiablo.mods.ore.tiny.data;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static fr.alasdiablo.mods.ore.tiny.registry.TinyOreBlocks.*;

public class BlockStatesProvider extends BlockStateProvider {
    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TinyOre.MOD_ID, exFileHelper);
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

    public void simpleBlockWithItem(Block block) {
        this.simpleBlockWithItem(block, this.cubeAll(block));
    }
}
