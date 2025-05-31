package net.harry.harrysworkshop.item;

import net.harry.harrysworkshop.HarrysWorkshop;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_SPIRAL = registerItem(name:"pink_spiral", new Item(new Item.Settings()));

    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HarrysWorkshop.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HarrysWorkshop.LOGGER.info("Registering Mod Items for " + HarrysWorkshop.MOD_ID);
    }

}
