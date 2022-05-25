package site.orichalcum.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import site.orichalcum.OrichalcumMod;
import site.orichalcum.items.ModItemGroup;

public class ModBlocks {

    // 奥利哈矿石
    public static final Block ORICHALCUM_ORE = RegisterBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()),
            ModItemGroup.GROUP_MISC, Rarity.COMMON);

    // 奥利哈钢块
    public static final Block ORICHALCUM_BLOCK = RegisterBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),
            ModItemGroup.GROUP_MISC, Rarity.UNCOMMON, 64);

    // 深层奥利哈矿石
    public static final Block DEEPSLATE_ORICHALCUM_ORE = RegisterBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),
            ModItemGroup.GROUP_MISC);

    // 奥利哈熔炉
    public static final Block ORICHALC_FURNACE = RegisterBlock("orichalc_furnace",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),
            ModItemGroup.GROUP_MISC);

    private static Block RegisterBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(OrichalcumMod.MOD_ID, name), block);
    }

    private static Block RegisterBlock(String name, Block block, ItemGroup group, Rarity rarity) {
        registerBlockItem(name, block, group, rarity);
        return Registry.register(Registry.BLOCK, new Identifier(OrichalcumMod.MOD_ID, name), block);
    }

    private static Block RegisterBlock(String name, Block block, ItemGroup group, Rarity rarity, int maxCount) {
        registerBlockItem(name, block, group, rarity, maxCount);
        return Registry.register(Registry.BLOCK, new Identifier(OrichalcumMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(OrichalcumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()
                        .group(group)));
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, Rarity rarity) {
        return Registry.register(Registry.ITEM, new Identifier(OrichalcumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()
                        .group(group)
                        .rarity(rarity)));
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, Rarity rarity, int maxCount) {
        return Registry.register(Registry.ITEM, new Identifier(OrichalcumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()
                        .group(group)
                        .rarity(rarity)
                        .maxCount(maxCount)));
    }

    public static void RegisterModBlocks() {
        OrichalcumMod.LOGGER.info("Registering Blocks for " + OrichalcumMod.MOD_ID);
    }
}
