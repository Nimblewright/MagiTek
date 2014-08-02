package eu.nimblemods.magitek.tileentity;

import net.minecraft.item.ItemStack;

public class TileEntityGenerator extends TileEntityMTek
{
    public static final int INVENTORY_SIZE = 1;

    private ItemStack inventory;

    public TileEntityGenerator()
    {
        inventory = null;
    }

    public void setItem(ItemStack itemStack)
    {
        inventory = new ItemStack(itemStack.getItem());
    }

    public ItemStack getItem()
    {
        return inventory;
    }
}
