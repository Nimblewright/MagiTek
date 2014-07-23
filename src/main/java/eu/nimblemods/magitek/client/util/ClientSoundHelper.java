package eu.nimblemods.magitek.client.util;

import cpw.mods.fml.client.FMLClientHandler;
import eu.nimblemods.magitek.util.ResourceLocationHelper;
import net.minecraft.client.audio.PositionedSoundRecord;

public class ClientSoundHelper
{
    public static void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch)
    {
        FMLClientHandler.instance().getClient().getSoundHandler().playSound(new PositionedSoundRecord(ResourceLocationHelper.getResourceLocation(soundName), volume, pitch, xCoord, yCoord, zCoord));
    }
}
