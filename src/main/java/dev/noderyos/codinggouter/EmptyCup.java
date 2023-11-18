package dev.noderyos.codinggouter;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class EmptyCup extends Item {
    public EmptyCup(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().getBlockState(context.getBlockPos()).isOf(ModObjects.HOT_CHOCOLATE_BLOCK)){
            context.getPlayer().setStackInHand(Hand.MAIN_HAND, new ItemStack(ModObjects.HOT_CHOCOLATE));
        }
        return ActionResult.SUCCESS;
    }
}
