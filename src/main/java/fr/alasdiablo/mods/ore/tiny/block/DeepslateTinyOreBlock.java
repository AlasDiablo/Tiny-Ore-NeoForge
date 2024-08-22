package fr.alasdiablo.mods.ore.tiny.block;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class DeepslateTinyOreBlock extends DropExperienceBlock {

    public DeepslateTinyOreBlock(IntProvider xpRange) {
        super(xpRange, Properties.of()
                .mapColor(MapColor.DEEPSLATE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(4.5F, 3.0F)
                .sound(SoundType.DEEPSLATE));
    }
}
