package eu.nimblemods.magitek.arcana;

import net.minecraft.item.Item;

public final class ArcanaValue
{
    private final float arcanaValue;
    private final ArcanaType arcanaType;
    private final Item item;

    public ArcanaValue(int arcanaValue, Item item)
    {
        this(arcanaValue, ArcanaType.DEFAULT, item);
    }

    public ArcanaValue(float arcanaValue, Item item)
    {
        this(arcanaValue, ArcanaType.DEFAULT, item);
    }

    public ArcanaValue(int arcanaValue, ArcanaType arcanaType, Item item)
    {
        this((float) arcanaValue, arcanaType, item);
    }

    public ArcanaValue(float arcanaValue, ArcanaType arcanaType, Item item)
    {
        this.arcanaValue = arcanaValue;
        this.arcanaType = arcanaType;
        this.item = item;
    }

    public ArcanaType getArcanaType()
    {
        return arcanaType;
    }

    public float getArcanaValue()
    {
        return arcanaValue;
    }

    public Item getItem()
    {
        return item;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof ArcanaValue)
        {
            return (((ArcanaValue) o).getArcanaType() == this.arcanaType) && (((ArcanaValue) o).getArcanaValue() ==this.arcanaValue);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("%s@%s", arcanaValue, arcanaType);
    }
}
