package com.scesi.vinchucamod.effect;

import javax.annotation.Nonnull;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ChagasEffect extends MobEffect {

    public ChagasEffect() {
        super(MobEffectCategory.HARMFUL, 0x8B0000); // Rojo oscuro
    }

    @SuppressWarnings("deprecation")
    
    @Override
    public boolean applyEffectTick(@Nonnull ServerLevel level, @Nonnull LivingEntity entity, int amplifier) {
        if (entity instanceof Player player && player.getFoodData().getFoodLevel() <= 19) {
            player.hurt(level.damageSources().generic(), 2.0F);
        }
        return true;
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % 40 == 0;
    }
}
