package eu.nimblemods.magitek.arcana;

public class ArcanaValue
{
    private float arcanaAmount;
    private ArcanaType arcanaType;

    public ArcanaValue(float arcanaAmount, ArcanaType arcanaType)
    {
        this.arcanaAmount = arcanaAmount;
        this.arcanaType = arcanaType;
    }

    public ArcanaValue(int arcanaAmount, ArcanaType arcanaType)
    {
        this((float) arcanaAmount, arcanaType);
    }

    public ArcanaValue(float arcanaAmount)
    {
        this(arcanaAmount, ArcanaType.DEFAULT);
    }

    public ArcanaValue(int arcanaAmount)
    {
        this((float)arcanaAmount);
    }

    public float getArcanaAmount()
    {
        return arcanaAmount;
    }

    public ArcanaType getArcanaType()
    {
        return arcanaType;
    }

    public boolean addArcana(float amount)
    {
        this.arcanaAmount += amount;
        return true;
    }

    public boolean addArcana(int amount)
    {
        return addArcana((float) amount);
    }

    public boolean addArcana(ArcanaValue arcanaValue)
    {
        if(this.arcanaType == arcanaValue.getArcanaType())
        {
            addArcana(arcanaValue.getArcanaAmount());
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s@%s", arcanaAmount, arcanaType);
    }
}
