package eu.nimblemods.magitek.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Comparator;

public class ItemHelper
{
    public static Comparator<ItemStack> comparator = new Comparator<ItemStack>()
    {
        @Override
        public int compare(ItemStack itemStack1, ItemStack itemStack2)
        {
            if(itemStack1 != null && itemStack2 != null)
            {
                //Sort on ItemID
                if(Item.getIdFromItem(itemStack1.getItem()) == Item.getIdFromItem(itemStack2.getItem()))
                {
                    //Then sort on meta
                    if(itemStack1.getItemDamage() == itemStack2.getItemDamage())
                    {
                        //Then sort on NBT
                        if(itemStack1.hasTagCompound() && itemStack2.hasTagCompound())
                        {
                            //Then sort on Stack Size
                            if(itemStack1.getTagCompound().equals(itemStack2.getTagCompound()))
                            {
                                return (itemStack1.stackSize - itemStack2.stackSize);
                            }
                            else
                            {
                                return (itemStack1.getTagCompound().hashCode() - itemStack2.getTagCompound().hashCode());
                            }
                        }
                        else if (!(itemStack1.hasTagCompound()) && itemStack2.hasTagCompound())
                        {
                            return -1;
                        }
                        else if (itemStack1.hasTagCompound() && !(itemStack2.hasTagCompound()))
                        {
                            return 1;
                        }
                        else
                        {
                            return (itemStack1.stackSize - itemStack2.stackSize);
                        }
                    }
                    else
                    {
                        return (itemStack1.getItemDamage() - itemStack2.getItemDamage());
                    }
                }
                else
                {
                    return (Item.getIdFromItem(itemStack1.getItem()) - Item.getIdFromItem(itemStack2.getItem()));
                }
            }
            else if (itemStack1 != null)
            {
                return -1;
            }
            else if (itemStack2 != null)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    };

    public static int compare(ItemStack itemStack1, ItemStack itemStack2)
    {
        return comparator.compare(itemStack1, itemStack2);
    }
}
