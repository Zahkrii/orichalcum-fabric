package site.orichalcum;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import site.orichalcum.screen.ModScreenHandler;
import site.orichalcum.screen.OrichalcFurnaceScreen;

public class OrichalcumClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandler.ORICHALC_FURNACE_SCREEN_HANDLER, OrichalcFurnaceScreen::new);
    }

}
