package eu.nimblemods.magitek.arcana;

import eu.nimblemods.magitek.reference.Arcana;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArcanaValues
{
    //Very Low
    public static final ArcanaValue FEATHER = new ArcanaValue(Arcana.FEATHER_VALUE, Arcana.FEATHER_TYPE, Arcana.FEATHER_ITEM);
    public static final ArcanaValue REED = new ArcanaValue(Arcana.REED_VALUE, Arcana.REED_TYPE, Arcana.REED_ITEM);
    public static final ArcanaValue STONE = new ArcanaValue(Arcana.STONE_VALUE, Arcana.STONE_TYPE, Arcana.STONE_ITEM);
    public static final ArcanaValue COAL = new ArcanaValue(Arcana.COAL_VALUE, Arcana.COAL_TYPE, Arcana.COAL_ITEM);

    //Medium
    public static final ArcanaValue GHAST_TEAR = new ArcanaValue(Arcana.GHAST_TEAR_VALUE, Arcana.GHAST_TEAR_TYPE, Arcana.GHAST_TEAR_ITEM);
    public static final ArcanaValue EMERALD = new ArcanaValue(Arcana.EMERALD_VALUE, Arcana.EMERALD_TYPE, Arcana.EMERALD_ITEM);
    public static final ArcanaValue ENDER_PEARL = new ArcanaValue(Arcana.ENDER_PEARL_VALUE, Arcana.ENDER_PEARL_TYPE, Arcana.ENDER_PEARL_ITEM);
    public static final ArcanaValue BLAZE_ROD = new ArcanaValue(Arcana.BLAZE_ROD_VALUE, Arcana.BLAZE_ROD_TYPE, Arcana.BLAZE_ROD_ITEM);

    private static final ArcanaValue[] ARCANA_VALUES = {FEATHER, REED, STONE, COAL, GHAST_TEAR, EMERALD, ENDER_PEARL, BLAZE_ROD};

    public static boolean isArcaneItem(ItemStack itemStack)
    {
        return findItemInArcana(itemStack.getItem()) != -1;
    }

    public static ArcanaValue getArcana(ItemStack itemStack)
    {
        int i = findItemInArcana(itemStack.getItem());

        if (i != -1)
        {
            return ARCANA_VALUES[i];
        } else
        {
            return null;
        }
    }

    private static int findItemInArcana(Item item)
    {
        for (int i = 0; i < ARCANA_VALUES.length; i++)
        {
            if (item.equals(ARCANA_VALUES[i].getItem()))
            {
                return i;
            }
        }

        return -1;
    }
}
