package eu.nimblemods.magitek.tileentity;

import eu.nimblemods.magitek.util.Logger;
import net.minecraft.item.ItemStack;

public abstract class SimpleInventory extends TileEntityMTek
{
    protected ItemStack inventory;

    protected SimpleInventory()
    {
        super();
        inventory = null;
    }

    public abstract boolean isViableItem(ItemStack itemStack);

    public ItemStack insertItem(ItemStack itemStack)
    {
        if(isViableItem(itemStack))
        {
            if(inventory == null)
            {
                Logger.info("Case 1");
                inventory = itemStack.copy();
                return null;
            }
            else
            {
                if(inventory.getItem().equals(itemStack.getItem()))
                {
                    if(inventory.getMaxStackSize() > inventory.stackSize + itemStack.stackSize)
                    {
                        Logger.info("Case 2.1.1");
                        inventory.stackSize += itemStack.stackSize;
                        return null;
                    }
                    else
                    {
                        Logger.info("Case 2.1.2");
                        itemStack.stackSize -= inventory.getMaxStackSize() - inventory.stackSize;
                        inventory.stackSize = inventory.getMaxStackSize();
                        return itemStack;
                    }
                }
                else
                {
                    Logger.info("Case 2.2");
                    return itemStack;
                }
            }
        }
        else
        {
            return itemStack;
        }
    }

    public ItemStack retrieveItem()
    {
        ItemStack itemStack = inventory;
        inventory = null;
        return itemStack;
    }
}
