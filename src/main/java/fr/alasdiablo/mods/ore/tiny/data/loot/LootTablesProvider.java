package fr.alasdiablo.mods.ore.tiny.data.loot;

import fr.alasdiablo.mods.ore.tiny.data.loot.table.BlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LootTablesProvider extends LootTableProvider {
    public LootTablesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup) {
        super(
                output,
                Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)),
                lookup
        );
    }
}
