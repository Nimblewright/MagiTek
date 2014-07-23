package eu.nimblemods.magitek.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import eu.nimblemods.magitek.reference.Reference;
import eu.nimblemods.magitek.util.Logger;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        //Create Configuration object from given file
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e)
    {
        if(e.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        try
        {
            //Load the configuration file
            configuration.load();

            //Read the properties in the configuration file

        }
        catch (Exception e)
        {
            //Log the exception
            Logger.error(e.toString());
        }
        finally
        {
            //Save the configuration file
            if(configuration.hasChanged())
                configuration.save();
        }
    }
}
