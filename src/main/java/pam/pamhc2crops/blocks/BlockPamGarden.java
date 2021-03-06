package pam.pamhc2crops.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockPamGarden extends BushBlock{
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
	@SuppressWarnings("unused")
	private String name;
	
	public BlockPamGarden(Block.Properties p_i49971_1_, String name) {
		super(Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.0F));
		this.name = name;
		
	}
	
	@Override
	public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
			return net.minecraftforge.common.PlantType.Plains;
		
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
	}
	

}
