package com.scesi.vinchucamod.entity.client;

import com.scesi.vinchucamod.VinchucaMod;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation VINCHUCA_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(VinchucaMod.MODID, "vinchuca"), "main");
}
