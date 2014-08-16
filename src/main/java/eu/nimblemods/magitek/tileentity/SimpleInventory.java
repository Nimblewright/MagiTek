package eu.nimblemods.magitek.tileentity;

import eu.nimblemods.magitek.util.Logger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class SimpleInventory extends TileEntityMTek
{
    protected Item inventory;

    protected SimpleInventory()
    {
        super();
        inventory = null;
    }

    public abstract boolean isValidItem(ItemStack itemStack);

    public boolean onRightClick(EntityPlayer player)
    {
        Logger.info("Right Click");

        if(!player.isSneaking())
        {
            if(player.getCurrentEquippedItem() != null)
            {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, insertItem(player.getCurrentEquippedItem()));
            }
            else
            {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, retrieveItem());
            }
            return true;
        }
        else
        {
            return false;
        }

    }

    public ItemStack insertItem(ItemStack itemStack)
    {
        if(isValidItem(itemStack) && inventory == null)
        {
            inventory = itemStack.getItem();
            itemStack.stackSize--;
            if(itemStack.stackSize == 0)
            {
                itemStack = null;
            }
        }

        return itemStack;
    }

    public ItemStack retrieveItem()
    {
        ItemStack itemStack = new ItemStack(inventory);
        inventory = null;
        return itemStack;
    }
}
