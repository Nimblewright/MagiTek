package eu.nimblemods.magitek;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import eu.nimblemods.magitek.handler.ConfigurationHandler;
import eu.nimblemods.magitek.init.ModBlocks;
import eu.nimblemods.magitek.init.ModItems;
import eu.nimblemods.magitek.init.Recipes;
import eu.nimblemods.magitek.proxy.IProxy;
import eu.nimblemods.magitek.reference.Reference;
import eu.nimblemods.magitek.util.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MagiTek
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static MagiTek instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        Logger.info("Pre Initialization complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        Recipes.init();

        Logger.info("Initialization complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        Logger.info("Post initialization complete");
    }
}
