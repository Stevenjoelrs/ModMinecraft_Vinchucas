package com.scesi.vinchucamod.entity.client;

import com.scesi.vinchucamod.VinchucaMod;
import com.scesi.vinchucamod.entity.custom.VinchucaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class VinchucaRenderer extends MobRenderer<VinchucaEntity, VinchucaRenderState, VinchucaModel> {

    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(VinchucaMod.MODID, "textures/entity/vinchuca.png");

    public VinchucaRenderer(EntityRendererProvider.Context context) {
        super(context, new VinchucaModel(context.bakeLayer(VinchucaModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public VinchucaRenderState createRenderState() {
        return new VinchucaRenderState();
    }

    @Override
    public ResourceLocation getTextureLocation(VinchucaRenderState renderState) {
        return TEXTURE;
    }
}
