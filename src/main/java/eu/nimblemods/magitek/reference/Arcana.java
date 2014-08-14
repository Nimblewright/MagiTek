package eu.nimblemods.magitek.reference;

import eu.nimblemods.magitek.arcana.ArcanaType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Arcana
{
    private static final float VERY_LOW_TIER = 0.05f;
    private static final float MEDIUM_TIER = 1f;
    
    //Air - Abjuration

    public static final float FEATHER_VALUE = VERY_LOW_TIER;
    public static final ArcanaType FEATHER_TYPE = ArcanaType.ABJURATION;
    public static final Item FEATHER_ITEM = Items.feather;

    public static final float GHAST_TEAR_VALUE = MEDIUM_TIER;
    public static final ArcanaType GHAST_TEAR_TYPE = ArcanaType.ABJURATION;
    public static final Item GHAST_TEAR_ITEM = Items.ghast_tear;

    //Earth - Conjuration

    public static final float STONE_VALUE = VERY_LOW_TIER;
    public static final ArcanaType STONE_TYPE = ArcanaType.CONJURATION;
    public static final Item STONE_ITEM = Item.getItemFromBlock(Blocks.stone);

    public static final float EMERALD_VALUE = MEDIUM_TIER;
    public static final ArcanaType EMERALD_TYPE = ArcanaType.CONJURATION;
    public static final Item EMERALD_ITEM = Items.emerald;

    //Fire - Transmutation

    public static final float COAL_VALUE = VERY_LOW_TIER;
    public static final ArcanaType COAL_TYPE = ArcanaType.TRANSMUTATION;
    public static final Item COAL_ITEM = Items.coal;

    public static final float BLAZE_ROD_VALUE = MEDIUM_TIER;
    public static final ArcanaType BLAZE_ROD_TYPE = ArcanaType.TRANSMUTATION;
    public static final Item BLAZE_ROD_ITEM = Items.blaze_rod;

    //Water - Divination

    public static final float REED_VALUE = VERY_LOW_TIER;
    public static final ArcanaType REED_TYPE = ArcanaType.DIVINATION;
    public static final Item REED_ITEM = Items.reeds;

    public static final float DIAMOND_VALUE = MEDIUM_TIER;
    public static final ArcanaType DIAMOND_TYPE = ArcanaType.DIVINATION;
    public static final Item DIAMOND_ITEM = Items.diamond;
}
