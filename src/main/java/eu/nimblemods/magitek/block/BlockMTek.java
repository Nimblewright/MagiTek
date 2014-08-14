package eu.nimblemods.magitek.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eu.nimblemods.magitek.creativetab.CreativeTab;
import eu.nimblemods.magitek.reference.Textures;
import eu.nimblemods.magitek.tileentity.SimpleInventory;
import eu.nimblemods.magitek.tileentity.TileEntityMTek;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockMTek extends Block
{
    public BlockMTek(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.MTEK_TAB);
        this.setHardness(2.0f);
    }

    public BlockMTek()
    {
        this(Material.rock);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        if (world.getTileEntity(x, y, z) instanceof TileEntityMTek)
        {
            int orientation;
            int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) % 3;

            switch (facing)
            {
                case 0:
                    orientation = ForgeDirection.NORTH.ordinal();
                    break;
                case 1:
                    orientation = ForgeDirection.EAST.ordinal();
                    break;
                case 2:
                    orientation = ForgeDirection.SOUTH.ordinal();
                    break;
                default:
                    orientation = ForgeDirection.WEST.ordinal();
                    break;
            }

            if (itemStack.hasDisplayName())
            {
                ((TileEntityMTek) world.getTileEntity(x, y, z)).setCustomName(itemStack.getDisplayName());
            }

            ((TileEntityMTek) world.getTileEntity(x, y, z)).setOrientation(orientation);
        }
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
    {
        dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, block, metadata);
    }

    protected void dropInventory(World world, int x, int y, int z)
    {
        if (world.getTileEntity(x, y, z) instanceof SimpleInventory)
        {
            ItemStack itemStack = ((SimpleInventory) world.getTileEntity(x, y, z)).retrieveItem();

            if (itemStack != null)
            {
                Random rand = new Random();

                float factor = 0.8f;
                float offset = 0.1f;

                float dX = rand.nextFloat() * factor + offset;
                float dY = rand.nextFloat() * factor + offset;
                float dZ = rand.nextFloat() * factor + offset;

                EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, itemStack);

                factor = 0.05f;
                offset = 0.2f;

                entityItem.motionX = rand.nextGaussian() * factor;
                entityItem.motionY = rand.nextGaussian() * factor + offset;
                entityItem.motionZ = rand.nextGaussian() * factor;

                world.spawnEntityInWorld(entityItem);
            }
        }
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
