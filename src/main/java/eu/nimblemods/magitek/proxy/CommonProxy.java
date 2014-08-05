package eu.nimblemods.magitek.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.tileentity.TileEntityGenerator;

public abstract class CommonProxy implements IProxy
{
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityGenerator.class, Names.Blocks.ARCANA_GENERATOR);
    }
}
