package site.orichalcum.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import site.orichalcum.OrichalcumMod;
import site.orichalcum.blocks.ModBlocks;

public class ModItemGroup {

    // 分类：奥利哈钢 - 杂项
    public static final ItemGroup GROUP_MISC = FabricItemGroupBuilder.build(
            new Identifier(OrichalcumMod.MOD_ID, "misc"),
            () -> new ItemStack(ModBlocks.ORICHALCUM_BLOCK));
}