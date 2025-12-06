package fr.alasdiablo.mods.ore.tiny.block;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class TinyOreBlock extends DropExperienceBlock {

    public TinyOreBlock(IntProvider xpRange, ResourceKey<Block> id) {
        super(xpRange, BlockBehaviour.Properties.of()
                .setId(id)
                .mapColor(MapColor.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 3.0F));
    }
}
