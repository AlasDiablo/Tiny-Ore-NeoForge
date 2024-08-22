package fr.alasdiablo.mods.ore.tiny.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeepslateTinyRedStoneOreBlock extends RedStoneOreBlock {
    private final IntProvider xpRange;

    public DeepslateTinyRedStoneOreBlock(IntProvider xpRange) {
        super(Properties.of()
                      .mapColor(MapColor.DEEPSLATE)
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .requiresCorrectToolForDrops()
                      .randomTicks()
                      .lightLevel(value -> value.getValue(BlockStateProperties.LIT) ? 9 : 0)
                      .strength(4.5F, 3.0F)
                      .sound(SoundType.DEEPSLATE));

        this.xpRange = xpRange;
    }

    @Override
    public int getExpDrop(
            @NotNull BlockState state,
            @NotNull LevelAccessor level,
            @NotNull BlockPos pos,
            @Nullable BlockEntity blockEntity,
            @Nullable Entity breaker,
            @NotNull ItemStack tool
    ) {
        return this.xpRange.sample(level.getRandom());
    }
}
