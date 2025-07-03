package net.harry.harrysworkshop.block.custom;

import net.harry.harrysworkshop.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlueMass extends Block {
    public BlueMass(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (stack.isOf(ModItems.VOID_ORB)) {
            player.damage(world.getDamageSources().generic(), 5);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.FAIL;



    }
}
