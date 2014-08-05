package eu.nimblemods.magitek.arcana;

import net.minecraft.item.Item;

public final class ArcaneItemWrapper
{
    private final ArcanaValue arcanaValue;
    private final Item item;

    public ArcaneItemWrapper(int arcanaAmount, Item item)
    {
        this.arcanaValue = new ArcanaValue(arcanaAmount);
        this.item = item;
    }

    public ArcaneItemWrapper(float arcanaAmount, Item item)
    {
        this.arcanaValue = new ArcanaValue(arcanaAmount);
        this.item = item;
    }

    public ArcaneItemWrapper(int arcanaAmount, ArcanaType arcanaType, Item item)
    {
        this.arcanaValue = new ArcanaValue(arcanaAmount, arcanaType);
        this.item = item;
    }

    public ArcaneItemWrapper(float arcanaValue, ArcanaType arcanaType, Item item)
    {
        this.arcanaValue = new ArcanaValue(arcanaValue, arcanaType);
        this.item = item;
    }

    public ArcanaType getArcanaType()
    {
        return arcanaValue.getArcanaType();
    }

    public float getArcanaAmount()
    {
        return arcanaValue.getArcanaAmount();
    }

    public ArcanaValue getArcanaValue()
    {
        return arcanaValue;
    }

    public Item getItem()
    {
        return item;
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s", item.getUnlocalizedName(), arcanaValue);
    }
}
