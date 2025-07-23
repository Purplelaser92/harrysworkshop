package net.harry.harrysworkshop.block.custom;

import net.harry.harrysworkshop.item.ModItems;
import net.harry.harrysworkshop.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class BlueMass extends Block {
    public BlueMass(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (isValidItem(player.getMainHandStack())) {
            player.damage(world.getDamageSources().generic(), 5);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.FAIL;



    }

    private boolean isValidItem(ItemStack mainHandStack) {
        return mainHandStack.isIn(ModTags.Items.REPELLED_BY_BLUE_MASS);
    }


    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.harrysworkshop.blue_mass.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
