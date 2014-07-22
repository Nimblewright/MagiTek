package eu.nimblemods.magitek.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.nimblemods.magitek.item.ItemMTek;
import eu.nimblemods.magitek.item.ItemTest;
import eu.nimblemods.magitek.reference.Names;
import eu.nimblemods.magitek.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemMTek testItem = new ItemTest();

    public static void init()
    {
        GameRegistry.registerItem(testItem, Names.Items.TEST_ITEM);
    }
}
