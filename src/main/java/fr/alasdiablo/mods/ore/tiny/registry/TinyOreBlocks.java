package fr.alasdiablo.mods.ore.tiny.registry;

import fr.alasdiablo.mods.ore.tiny.TinyOre;
import fr.alasdiablo.mods.ore.tiny.TinyOreRegistries;
import fr.alasdiablo.mods.ore.tiny.block.TinyOreBlock;
import fr.alasdiablo.mods.ore.tiny.block.TinyRedStoneOreBlock;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class TinyOreBlocks {
    static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TinyOre.MOD_ID);
    static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TinyOre.MOD_ID);

    private static <T extends Block> @NotNull DeferredBlock<T> register(Supplier<T> block, String name) {
        DeferredBlock<T> blockRegistry = BLOCKS.register(name, block);
        ITEMS.registerSimpleBlockItem(blockRegistry);
        return blockRegistry;
    }

    public static final DeferredBlock<Block> TINY_COAL_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(0, 1)), TinyOreRegistries.TINY_COAL_ORE);
    public static final DeferredBlock<Block> TINY_COPPER_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(0, 1)), TinyOreRegistries.TINY_COPPER_ORE);
    public static final DeferredBlock<Block> TINY_DIAMOND_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(1, 3)), TinyOreRegistries.TINY_DIAMOND_ORE);
    public static final DeferredBlock<Block> TINY_EMERALD_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(1, 3)), TinyOreRegistries.TINY_EMERALD_ORE);
    public static final DeferredBlock<Block> TINY_GOLD_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(0, 1)), TinyOreRegistries.TINY_GOLD_ORE);
    public static final DeferredBlock<Block> TINY_IRON_ORE = register(
            () -> new TinyOreBlock(UniformInt.of(0, 1)), TinyOreRegistries.TINY_IRON_ORE);
    public static final DeferredBlock<Block> TINY_REDSTONE_ORE = register(
            () -> new TinyRedStoneOreBlock(UniformInt.of(0, 2)), TinyOreRegistries.TINY_REDSTONE_ORE);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
