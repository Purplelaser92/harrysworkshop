package net.harry.harrysworkshop.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.harry.harrysworkshop.HarrysWorkshop;
import net.harry.harrysworkshop.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HARRYSWORKSHOP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HarrysWorkshop.MOD_ID, "harrysworkshop_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_SPIRAL))
                    .displayName(Text.translatable("itemgroup.harrysworkshop.harrysworkshop_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_SPIRAL);
                        entries.add(ModItems.VOID_ORB);
                        entries.add(ModItems.BANISHMENT_STICK);
                        entries.add(ModItems.BLUE_FOOD);
                        entries.add(ModItems.PORTABLE_FIRE);
                        entries.add(ModBlocks.VOID_BLOCK);
                        entries.add(ModBlocks.BLUE_MASS);



                    })

                    .build());

    public static void registerItemGroups() {
        HarrysWorkshop.LOGGER.info("Registering Item Groups for " + HarrysWorkshop.MOD_ID);
    }
}
