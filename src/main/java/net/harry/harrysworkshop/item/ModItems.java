package net.harry.harrysworkshop.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.harry.harrysworkshop.HarrysWorkshop;
import net.harry.harrysworkshop.item.custom.BanishmentStick;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_SPIRAL = registerItem("pink_spiral", new Item(new Item.Settings()));
    public static final Item VOID_ORB = registerItem("void_orb", new Item(new Item.Settings()));

    public static final Item BANISHMENT_STICK = registerItem("banishment_stick", new BanishmentStick(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HarrysWorkshop.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HarrysWorkshop.LOGGER.info("Registering Mod Items for " + HarrysWorkshop.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_SPIRAL);
            fabricItemGroupEntries.add(VOID_ORB);
        });
    }

}
