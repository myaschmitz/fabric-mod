package com.mya.harvestmod;

import com.mya.harvestmod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
//import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class HarvestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlock(ModBlocks.BOK_CHOY_CROP, BlockRenderLayer.CUTOUT);
	}
}