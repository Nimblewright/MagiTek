package eu.nimblemods.magitek.arcana;

import eu.nimblemods.magitek.reference.Arcana;
import eu.nimblemods.magitek.util.Logger;

public class ArcanaReservoir
{
    private ArcanaValue[] reservoir;
    private int max;

    public ArcanaReservoir(int max)
    {
        reservoir = new ArcanaValue[Arcana.NUMBER_OF_ARCANAS];
        this.max = max;

        for(int i = 0; i < reservoir.length; i++)
        {
            reservoir[i] = new ArcanaValue(Arcana.ARCANA_TYPES[i]);
            reservoir[i].setMax(this.max);
        }
    }

    public void add(ArcanaValue arcanaValue)
    {
        for (ArcanaValue aReservoir : reservoir)
        {
            aReservoir.addArcana(arcanaValue);
        }

        Logger.info("Added " + arcanaValue);
        Logger.info("Total " + reservoir[3]);
    }

    public int getMax()
    {
        return max;
    }

    public void setMax(int max)
    {
        this.max = max;
        for (ArcanaValue aReservoir : reservoir)
        {
            aReservoir.setMax(this.max);
        }
    }
}
