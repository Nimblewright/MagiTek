package eu.nimblemods.magitek.creativetab;

import eu.nimblemods.magitek.init.ModItems;
import eu.nimblemods.magitek.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs MTEK_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.testItem;
        }
    };
}
