package net.harry.harrysworkshop;

import net.fabricmc.api.ModInitializer;

import net.harry.harrysworkshop.block.ModBlocks;
import net.harry.harrysworkshop.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HarrysWorkshop implements ModInitializer {
	public static final String MOD_ID = "harrysworkshop";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}