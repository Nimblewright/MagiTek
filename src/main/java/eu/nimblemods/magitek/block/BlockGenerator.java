package eu.nimblemods.magitek.block;

import eu.nimblemods.magitek.MagiTek;
import eu.nimblemods.magitek.reference.GuiId;
import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.tileentity.TileEntityGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockGenerator extends BlockMTek
{
    public BlockGenerator()
    {
        super();
        this.setBlockName(Names.Blocks.ARCANA_GENERATOR);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if(player.isSneaking())
        {
            return false;
        }
        else
        {
            if (!world.isRemote)
            {
                if (world.getTileEntity(x, y, z) instanceof TileEntityGenerator)
                {
                    player.openGui(MagiTek.instance, GuiId.ARCANA_GENERATOR.ordinal(), world, x, y, z);
                }
            }
            return true;
        }
    }
}
