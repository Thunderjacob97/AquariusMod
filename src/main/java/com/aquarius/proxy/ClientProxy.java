package com.aquarius.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import com.aquarius.AquariusMod.AquariusMod;;

public class ClientProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
		 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(AquariusMod.modId + ":" + id, "inventory"));
	}
}
