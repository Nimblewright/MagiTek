package eu.nimblemods.magitek.arcana;

public class ArcanaValue
{
    private float arcanaAmount;
    private ArcanaType arcanaType;
    private int max;

    public ArcanaValue(float arcanaAmount, ArcanaType arcanaType)
    {
        this.arcanaAmount = arcanaAmount;
        this.arcanaType = arcanaType;
        max = 0;
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

    public ArcanaValue(ArcanaType arcanaType)
    {
        this(0, arcanaType);
    }

    public int getMax()
    {
        return max;
    }

    public void setMax(int max)
    {
        this.max = max;
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
        preventOverflow();
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

    private void preventOverflow()
    {
        if(arcanaAmount > max && max != 0)
        {
            arcanaAmount = (float) max;
        }

    }

    @Override
    public String toString()
    {
        return String.format("%s@%s", arcanaAmount, arcanaType);
    }
}
