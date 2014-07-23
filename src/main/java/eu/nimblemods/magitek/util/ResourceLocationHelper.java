package eu.nimblemods.magitek.util;

import eu.nimblemods.magitek.reference.Reference;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String path)
    {
        return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }
}
