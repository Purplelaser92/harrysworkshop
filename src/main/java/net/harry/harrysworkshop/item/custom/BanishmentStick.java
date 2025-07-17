package net.harry.harrysworkshop.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import java.util.List;


public class BanishmentStick extends Item {
    public BanishmentStick(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (entity.isAlive()) {
            entity.addVelocity(0, 1, 0);
        }

        return ActionResult.PASS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.harrysworkshop.banishment_stick.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.harrysworkshop.banishment_stick"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
