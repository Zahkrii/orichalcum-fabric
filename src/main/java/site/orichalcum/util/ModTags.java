package site.orichalcum.util;

import net.minecraft.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import site.orichalcum.OrichalcumMod;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(OrichalcumMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> RAW_ORICHALCUM = createTag("raw_orichalcum");
        public static final TagKey<Item> ORICHALCUM_ITEM = createTag("orichalcum_item");
        public static final TagKey<Item> ORICHALCUM_SHARD = createTag("orichalcum_shard");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(OrichalcumMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
