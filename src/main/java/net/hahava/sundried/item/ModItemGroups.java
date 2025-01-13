package net.hahava.sundried.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hahava.sundried.Sundried;
import net.hahava.sundried.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SUNDRIED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Sundried.MOD_ID, "sundried"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sundried"))
                    .icon(() -> new ItemStack(ModItems.IRON_GEAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IRON_GEAR);
                        entries.add(ModItems.METAL_SCRAP);
                        entries.add(ModItems.STURDY_BRICK);

                        entries.add(ModBlocks.ASPHALT);
                        entries.add(ModBlocks.CRACKED_BRICKS);

                        entries.add(ModItems.STEEL_DRILL);
                    }).build());
    public static void registerItemGroups(){
        Sundried.LOGGER.info("Registering Item Groups for " + Sundried.MOD_ID);
    }
}
