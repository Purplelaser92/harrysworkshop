package net.harry.harrysworkshop.util;

import net.harry.harrysworkshop.HarrysWorkshop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HarrysWorkshop.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REPELLED_BY_BLUE_MASS = createTag("repelled_by_blue_mass");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HarrysWorkshop.MOD_ID, name));
        }
    }
}
