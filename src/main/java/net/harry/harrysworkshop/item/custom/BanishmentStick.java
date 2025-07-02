package net.harry.harrysworkshop.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;


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
}
