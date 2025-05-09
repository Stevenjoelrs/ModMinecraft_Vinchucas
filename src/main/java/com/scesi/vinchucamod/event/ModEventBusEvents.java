package com.scesi.vinchucamod.event;

import com.scesi.vinchucamod.VinchucaMod;
import com.scesi.vinchucamod.entity.MobEntities;
import com.scesi.vinchucamod.entity.custom.VinchucaEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VinchucaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(MobEntities.VINCHUCA.get(), VinchucaEntity.createAttributes().build());
    }
}
