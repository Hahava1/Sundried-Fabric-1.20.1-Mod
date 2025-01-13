package net.hahava.sundried;

import net.fabricmc.api.ModInitializer;

import net.hahava.sundried.block.ModBlocks;
import net.hahava.sundried.item.ModItemGroups;
import net.hahava.sundried.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sundried implements ModInitializer {
	public static final String MOD_ID = "sundried";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

	}
}