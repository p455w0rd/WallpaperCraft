package Aarron.WallpaperCraft.Blocks.Striped;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.BlockStates.BlockStates;
import Aarron.WallpaperCraft.BlockStates.BlockTypes;
import Aarron.WallpaperCraft.Blocks.IMetaBlock;


public class StripedGray extends IMetaBlock<BlockTypes> {

	public StripedGray() {
		super(Material.WOOD, "StripedGray");
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	protected BlockTypes getDefaultStateVariant() {
		return BlockTypes.Zero;
	}

	@Override
	protected BlockTypes fromMeta(int meta) {
		return BlockTypes.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes> getVariantEnum() {
		return BlockStates.WPblocks;
	}
}