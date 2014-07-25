package eu.nimblemods.magitek.arcana;

public final class ArcanaValue
{
    private final float arcanaValue;
    private final ArcanaType arcanaType;

    public ArcanaValue(int arcanaValue, ArcanaType arcanaType)
    {
        this((float) arcanaValue, arcanaType);
    }

    public ArcanaValue(float arcanaValue, ArcanaType arcanaType)
    {
        this.arcanaValue = arcanaValue;
        this.arcanaType = arcanaType;
    }

    public ArcanaType getArcanaType()
    {
        return arcanaType;
    }

    public float getArcanaValue()
    {
        return arcanaValue;
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
