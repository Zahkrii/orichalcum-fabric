package site.orichalcum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import site.orichalcum.blocks.ModBlocks;
import site.orichalcum.blocks.entities.ModBlockEntities;
import site.orichalcum.items.ModItems;
import site.orichalcum.screen.ModScreenHandler;

public class OrichalcumMod implements ModInitializer {

	public static final String MOD_ID = "orichalcum";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.RegisterModItems();
		ModBlocks.RegisterModBlocks();
		ModBlockEntities.RegisterModBlockEntities();
		ModScreenHandler.RegisterModScreenHandler();
	}
}
