package eu.nimblemods.magitek.arcana;

import eu.nimblemods.magitek.reference.Arcana;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArcanaValues
{
    //Very Low
    public static final ArcaneItemWrapper FEATHER = new ArcaneItemWrapper(Arcana.FEATHER_VALUE, Arcana.FEATHER_TYPE, Arcana.FEATHER_ITEM);
    public static final ArcaneItemWrapper REED = new ArcaneItemWrapper(Arcana.REED_VALUE, Arcana.REED_TYPE, Arcana.REED_ITEM);
    public static final ArcaneItemWrapper STONE = new ArcaneItemWrapper(Arcana.STONE_VALUE, Arcana.STONE_TYPE, Arcana.STONE_ITEM);
    public static final ArcaneItemWrapper COAL = new ArcaneItemWrapper(Arcana.COAL_VALUE, Arcana.COAL_TYPE, Arcana.COAL_ITEM);

    //Medium
    public static final ArcaneItemWrapper GHAST_TEAR = new ArcaneItemWrapper(Arcana.GHAST_TEAR_VALUE, Arcana.GHAST_TEAR_TYPE, Arcana.GHAST_TEAR_ITEM);
    public static final ArcaneItemWrapper DIAMOND = new ArcaneItemWrapper(Arcana.DIAMOND_VALUE, Arcana.DIAMOND_TYPE, Arcana.DIAMOND_ITEM);
    public static final ArcaneItemWrapper EMERALD = new ArcaneItemWrapper(Arcana.EMERALD_VALUE, Arcana.EMERALD_TYPE, Arcana.EMERALD_ITEM);
    public static final ArcaneItemWrapper BLAZE_ROD = new ArcaneItemWrapper(Arcana.BLAZE_ROD_VALUE, Arcana.BLAZE_ROD_TYPE, Arcana.BLAZE_ROD_ITEM);

    private static final ArcaneItemWrapper[] ARCANA_VALUES = {FEATHER, REED, STONE, COAL, GHAST_TEAR, DIAMOND, EMERALD, BLAZE_ROD};

    public static boolean isArcaneItem(ItemStack itemStack)
    {
        return findItemInArcana(itemStack.getItem()) != -1;
    }

    public static ArcaneItemWrapper getArcana(ItemStack itemStack)
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
