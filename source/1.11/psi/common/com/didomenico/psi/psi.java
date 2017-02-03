package com.didomenico.psi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.didomenico.psi.CommonProxy;
import com.didomenico.psi.ClientProxy;

@Mod(modid = psi.MOD_ID, name = psi.MOD_NAME, version = psi.VERSION)//, dependencies = psi.DEPENDENCIES)
public class psi {
	
	public static final String MOD_ID = "psi";
	public static final String MOD_NAME = "PSIONICS";
	public static final String VERSION = "@VERSION@";
	//public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2188,);[other mods]";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	// variables
	
	// ie:
	//public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static psi instance;
	
	@SidedProxy(clientSide = "com.didomenico.psi.ClientProxy", serverSide = "com.didomenico.psi.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
	};
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	};
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	};
	
	
}
