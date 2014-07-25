package eu.nimblemods.magitek.reference;

import eu.nimblemods.magitek.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ':';

    public static final class Model
    {
        public static final String MODEL_TEXTURE_LOCATION = "textures/models/";

        public static final ResourceLocation ARCANA_GENERATOR_IDLE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "generator_idle.png");
        public static final ResourceLocation ARCANA_GENERATOR_ACTIVE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "generator_active.png");
    }
}
