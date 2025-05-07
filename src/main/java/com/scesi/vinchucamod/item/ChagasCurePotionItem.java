package com.scesi.vinchucamod.item;

import com.scesi.vinchucamod.VinchucaMod;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.level.Level;
import net.minecraft.core.Holder;

public class ChagasCurePotionItem extends PotionItem {

    public ChagasCurePotionItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide) {
            Holder<?> holder = VinchucaMod.CHAGAS.getHolder().orElse(null);
            if (holder != null) {
                entity.removeEffect((Holder) holder);
            }
        }
        return super.finishUsingItem(stack, level, entity);
    }
}