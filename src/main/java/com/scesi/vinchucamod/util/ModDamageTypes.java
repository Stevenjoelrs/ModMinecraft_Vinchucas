package com.scesi.vinchucamod.util;

import com.scesi.vinchucamod.VinchucaMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

//@Mod.EventBusSubscriber(modid = VinchucaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDamageTypes {

    private ModDamageTypes() {
        // Private constructor to prevent instantiation
    }

    public static final DeferredRegister<DamageType> DAMAGE_TYPES
            = DeferredRegister.create(Registries.DAMAGE_TYPE, VinchucaMod.MODID);

    private static final String MAL_DE_CHAGAS_ID_STRING = "mal_de_chagas";

    public static final RegistryObject<DamageType> MAL_DE_CHAGAS
            = DAMAGE_TYPES.register(MAL_DE_CHAGAS_ID_STRING, () -> new DamageType(MAL_DE_CHAGAS_ID_STRING, 0.1F));

    public static final ResourceLocation MAL_DE_CHAGAS_ID = ResourceLocation.fromNamespaceAndPath(VinchucaMod.MODID, MAL_DE_CHAGAS_ID_STRING);

    public static final ResourceKey<DamageType> MAL_DE_CHAGAS_KEY
            = ResourceKey.create(Registries.DAMAGE_TYPE, MAL_DE_CHAGAS_ID);
}
