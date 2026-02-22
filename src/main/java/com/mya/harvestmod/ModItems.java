package com.mya.harvestmod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BOK_CHOY = Registry.register(
            Registries.ITEM,
            Identifier.of(HarvestMod.MOD_ID, "bok_choy"),
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HarvestMod.MOD_ID, "bok_choy"))))
    );

    public static void registerModItems() {}
}