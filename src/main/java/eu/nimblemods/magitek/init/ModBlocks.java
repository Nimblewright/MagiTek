package eu.nimblemods.magitek.init;

import cpw.mods.fml.common.registry.GameRegistry;
import eu.nimblemods.magitek.block.BlockGenerator;
import eu.nimblemods.magitek.block.BlockMTek;
import eu.nimblemods.magitek.reference.Names;

public class ModBlocks
{
    public static final BlockMTek arcanaGenerator = new BlockGenerator();

    public static void init()
    {
        GameRegistry.registerBlock(arcanaGenerator, Names.Blocks.ARCANA_GENERATOR);
    }
}
