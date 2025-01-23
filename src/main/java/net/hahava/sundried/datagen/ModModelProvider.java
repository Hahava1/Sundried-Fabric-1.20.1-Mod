package net.hahava.sundried.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hahava.sundried.block.ModBlocks;
import net.hahava.sundried.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASPHALT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIMSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IRON_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANNED_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_DRILL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STURDY_BRICK, Models.GENERATED);
    }
}
