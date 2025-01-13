package net.hahava.sundried.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hahava.sundried.Sundried;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item METAL_SCRAP = registerItem("metal_scrap", new Item(new FabricItemSettings()));
    public static final Item IRON_GEAR = registerItem("iron_gear", new Item(new FabricItemSettings()));
    public static final Item STEEL_DRILL = registerItem("steel_drill", new Item(new FabricItemSettings()));
    public static final Item STURDY_BRICK = registerItem("sturdy_brick", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(METAL_SCRAP);
        entries.add(IRON_GEAR);
        entries.add(STURDY_BRICK);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Sundried.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Sundried.LOGGER.info("Registering Mod Items for " + Sundried.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
