package com.aquarius.AquariusMod;

import com.aquarius.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AquariusMod.modId, name = AquariusMod.name, 
		version = AquariusMod.version, acceptedMinecraftVersions = "[1.10.2]")

public class AquariusMod {
	@SidedProxy(serverSide = "com.aquarius.proxy.CommonProxy", clientSide = "com.aquarius.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "tutorial";
	public static final String name = "Tutorial Mod";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static AquariusMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
