package eu.nimblemods.magitek.proxy;

public interface IProxy
{
    public abstract void registerTileEntities();
    public abstract void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch);
}
