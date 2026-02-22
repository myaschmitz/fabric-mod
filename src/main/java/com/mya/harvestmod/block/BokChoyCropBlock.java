package com.mya.harvestmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class BokChoyCropBlock extends CropBlock {

    public BokChoyCropBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModBlocks.BOK_CHOY_SEEDS_ITEM;
    }
}