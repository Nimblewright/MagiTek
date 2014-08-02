package eu.nimblemods.magitek.block;

import eu.nimblemods.magitek.MagiTek;
import eu.nimblemods.magitek.arcana.ArcanaValues;
import eu.nimblemods.magitek.reference.GuiId;
import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.tileentity.TileEntityGenerator;
import eu.nimblemods.magitek.util.Logger;
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
        Logger.info("Generator Activated");

        if(ArcanaValues.isArcaneItem(player.getCurrentEquippedItem()))
        {
            Logger.info(ArcanaValues.getArcana(player.getCurrentEquippedItem()));
        }

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
                    Logger.info("Generator Local");
                }
            }
            return true;
        }
    }
}
