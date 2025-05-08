package com.scesi.vinchucamod.event;

import com.scesi.vinchucamod.VinchucaMod;
import com.scesi.vinchucamod.entity.client.ModModelLayers;
import com.scesi.vinchucamod.entity.client.VinchucaModel;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VinchucaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.VINCHUCA_LAYER, VinchucaModel::createBodyLayer);
    }
}
