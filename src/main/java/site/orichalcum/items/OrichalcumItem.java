package site.orichalcum.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class OrichalcumItem extends Item {

    // 奥利哈钢
    public OrichalcumItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // 默认为灰色文本
        tooltip.add(new TranslatableText("item.orichalcum.orichalcum_item.tooltip").formatted(Formatting.GRAY));
    }
}
