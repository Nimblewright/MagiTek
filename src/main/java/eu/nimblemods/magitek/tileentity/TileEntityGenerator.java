package eu.nimblemods.magitek.tileentity;

import eu.nimblemods.magitek.arcana.ArcanaValue;
import eu.nimblemods.magitek.arcana.ArcanaValues;
import eu.nimblemods.magitek.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class TileEntityGenerator extends SimpleInventory
{
    private ArcanaValue energy;

    public TileEntityGenerator()
    {
        super();
        energy = new ArcanaValue(0f);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        //Get item from NBT
        NBTTagCompound tagCompound = nbtTagCompound.getTagList(Names.NBT.ITEMS, 1).getCompoundTagAt(0);
        if(tagCompound.getByte(Names.NBT.SLOT) == 0)
        {
            inventory = ItemStack.loadItemStackFromNBT(tagCompound);
        }
    }

    @Override
    public boolean isViableItem(ItemStack itemStack)
    {
        return ArcanaValues.isArcaneItem(itemStack);
    }
}
