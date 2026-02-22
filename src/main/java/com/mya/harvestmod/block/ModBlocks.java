package com.mya.harvestmod.block;

import com.mya.harvestmod.HarvestMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final BokChoyCropBlock BOK_CHOY_CROP = Registry.register(
            Registries.BLOCK,
            Identifier.of(HarvestMod.MOD_ID, "bok_choy_crop"),
            new BokChoyCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(HarvestMod.MOD_ID, "bok_choy_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .noBlockBreakParticles())
    );

    public static final Item BOK_CHOY_SEEDS_ITEM = Registry.register(
            Registries.ITEM,
            Identifier.of(HarvestMod.MOD_ID, "bok_choy_seeds"),
            new BlockItem(BOK_CHOY_CROP, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HarvestMod.MOD_ID, "bok_choy_seeds"))))
    );

    public static void registerModBlocks() {}
}