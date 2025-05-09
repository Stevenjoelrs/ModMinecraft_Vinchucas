package com.scesi.vinchucamod.entity;

import com.scesi.vinchucamod.VinchucaMod;
import com.scesi.vinchucamod.entity.custom.VinchucaEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * MobEntities
 */
public class MobEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VinchucaMod.MODID);
    
    public static final RegistryObject<EntityType<VinchucaEntity>> VINCHUCA = 
        ENTITY_TYPES.register("vinchuca",
            () -> EntityType.Builder.of(VinchucaEntity::new, MobCategory.MONSTER)
            .sized(1f, 1f)
            .build(ResourceKey.create(Registries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(VinchucaMod.MODID, "vinchuca"))));
}
