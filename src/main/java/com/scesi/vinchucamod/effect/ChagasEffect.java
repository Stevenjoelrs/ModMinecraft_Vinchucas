package com.scesi.vinchucamod.effect;

import javax.annotation.Nonnull;

import com.scesi.vinchucamod.util.ModDamageTypes;

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
        if (entity instanceof Player player && player.getFoodData().getFoodLevel() <= 6) {
            var lookup = level.registryAccess().lookup(net.minecraft.core.registries.Registries.DAMAGE_TYPE);
            if (lookup.isPresent()) {
                var holder = lookup.get().get(ModDamageTypes.MAL_DE_CHAGAS_ID);
                if (holder.isPresent()) {
                    player.hurt(new net.minecraft.world.damagesource.DamageSource(holder.get()), 1.0F);
                }
            }
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % 40 == 0;
    }
}
