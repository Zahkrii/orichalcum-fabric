package site.orichalcum.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import site.orichalcum.OrichalcumMod;

public class ModScreenHandler {
    public static ScreenHandlerType<OrichalcFurnaceScreenHandler> ORICHALC_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry
            .registerSimple(new Identifier(OrichalcumMod.MOD_ID, "orichalc_furnace"),
                    OrichalcFurnaceScreenHandler::new);

    public static void RegisterModScreenHandler() {
        OrichalcumMod.LOGGER.info("Registering ScreenHandler for " + OrichalcumMod.MOD_ID);
    }
}
