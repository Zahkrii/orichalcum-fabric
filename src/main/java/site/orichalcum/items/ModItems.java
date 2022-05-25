package site.orichalcum.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import site.orichalcum.OrichalcumMod;

public class ModItems {

    // 奥利哈原矿
    public static final Item RAW_ORICHALCUM = RegisterItem("raw_orichalcum",
            new RawOrichalcum(new FabricItemSettings()
                    .group(ModItemGroup.GROUP_MISC)));

    // 奥利哈钢
    public static final Item ORICHALCUM_ITEM = RegisterItem("orichalcum_item",
            new OrichalcumItem(new FabricItemSettings()
                    .group(ModItemGroup.GROUP_MISC)
                    .rarity(Rarity.UNCOMMON)));

    // 奥利哈钢碎片
    public static final Item ORICHALCUM_SHARD = RegisterItem("orichalcum_shard",
            new RawOrichalcum(new FabricItemSettings()
                    .group(ModItemGroup.GROUP_MISC)));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OrichalcumMod.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        OrichalcumMod.LOGGER.info("Registering Items for " + OrichalcumMod.MOD_ID);
    }
}
