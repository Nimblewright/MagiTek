package eu.nimblemods.magitek.proxy;

import eu.nimblemods.magitek.client.util.ClientSoundHelper;

public class ClientProxy extends CommonProxy
{
    @Override
    public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch)
    {
        ClientSoundHelper.playSound(soundName, xCoord, yCoord, zCoord, volume, pitch);
    }
}
