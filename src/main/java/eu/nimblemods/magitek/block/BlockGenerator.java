package eu.nimblemods.magitek.block;

import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.tileentity.TileEntityGenerator;
import eu.nimblemods.magitek.util.Logger;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGenerator extends BlockMTek implements ITileEntityProvider
{
    public BlockGenerator()
    {
        super();
        this.setBlockName(Names.Blocks.ARCANA_GENERATOR);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData)
    {
        return new TileEntityGenerator();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        Logger.info("Block activated");
        if (!world.isRemote)
        {
            Logger.info("World isn't remote");
            if (world.getTileEntity(x, y, z) instanceof TileEntityGenerator)
            {
                return ((TileEntityGenerator) world.getTileEntity(x, y, z)).onRightClick(player);
            }
        }
        return false;
    }
}
