package eu.nimblemods.magitek.reference;

import eu.nimblemods.magitek.arcana.ArcanaValue;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArcanaValues
{
    public static final ArcanaValue FEATHER = new ArcanaValue(Arcana.FEATHER_VALUE, Arcana.FEATHER_TYPE);
    public static final ArcanaValue REED = new ArcanaValue(Arcana.REED_VALUE, Arcana.REED_TYPE);
    public static final ArcanaValue STONE = new ArcanaValue(Arcana.STONE_VALUE, Arcana.STONE_TYPE);
    public static final ArcanaValue COAL = new ArcanaValue(Arcana.COAL_VALUE, Arcana.COAL_TYPE);


    private static final Item FEATHER_ITEM = Items.feather;
    private static final Item REED_ITEM = Items.reeds;
    private static final Item STONE_ITEM = Item.getItemFromBlock(Blocks.stone);
    private static final Item COAL_ITEM = Items.coal;

    private static final Item[] ARCANE_ITEMS = {FEATHER_ITEM, REED_ITEM, STONE_ITEM, COAL_ITEM};
    private static final ArcanaValue[] ARCANA_VALUES = {FEATHER, REED, STONE, COAL};

    public static boolean isArcaneItem(ItemStack itemStack)
    {
        Item item = itemStack.getItem();

        for(int i = 0; i < ARCANE_ITEMS.length; i++)
        {
            if(item.equals(ARCANE_ITEMS[i]))
            {
                return true;
            }
        }

        return false;
    }

    public static ArcanaValue getArcana(ItemStack itemStack)
    {
        Item item = itemStack.getItem();

        for(int i = 0; i < ARCANE_ITEMS.length; i++)
        {
            if(item.equals(ARCANE_ITEMS[i]))
            {
                return ARCANA_VALUES[i];
            }
        }

        return null;
    }
}
