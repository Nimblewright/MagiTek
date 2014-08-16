package eu.nimblemods.magitek.tileentity;

import eu.nimblemods.magitek.arcana.ArcanaReservoir;
import eu.nimblemods.magitek.arcana.ArcanaValues;
import eu.nimblemods.magitek.reference.Machines;
import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.util.Logger;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TileEntityGenerator extends SimpleInventory
{
    private ArcanaReservoir reservoir;
    private int tickCounter, tickCounterMax;

    public TileEntityGenerator()
    {
        super();
        reservoir = new ArcanaReservoir(Machines.GENERATOR_MAX_ARCANA);

        tickCounter = 1;
        tickCounterMax = Machines.GENERATOR_TICK_MAX;
    }

    private void resetCounter()
    {
        tickCounter = 1;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        //Get item from NBT
        NBTTagCompound tagCompound = nbtTagCompound.getTagList(Names.NBT.ITEMS, 1).getCompoundTagAt(0);
        if(tagCompound.getByte(Names.NBT.SLOT) == 0)
        {

        }
    }

    @Override
    public boolean isValidItem(ItemStack itemStack)
    {
        return ArcanaValues.isArcaneItem(itemStack);
    }

    @Override
    public void updateEntity()
    {
        if(tickCounter >= tickCounterMax)
        {
            if(inventory != null)
            {
                reservoir.add(ArcanaValues.getArcana(inventory).getArcanaValue());

                Logger.info("Tick");
            }

            resetCounter();
        }
        else
        {
            tickCounter++;
        }
    }
}
