package net.hahava.sundried.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hahava.sundried.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ASPHALT);
        addDrop(ModBlocks.BRIMSTONE_ORE);
        addDrop(ModBlocks.CRACKED_BRICKS);
    }
}
