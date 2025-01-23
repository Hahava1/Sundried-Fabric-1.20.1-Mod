package net.hahava.sundried.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hahava.sundried.Sundried;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ASPHALT = registerBlock("asphalt_road",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block BRIMSTONE_ORE = registerBlock("brimstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).strength(2f), UniformIntProvider.create(2, 5)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Sundried.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Sundried.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Sundried.LOGGER.info("Registering ModBlocks for "+ Sundried.MOD_ID);
    }
}
