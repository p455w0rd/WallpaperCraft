package com.Aarron.WallpaperCraft.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.CreativeTab.Tab;

	public class PressTintedGlass extends Item {
		public PressTintedGlass() {
			setUnlocalizedName("PressTintedGlass");
			setTextureName("wp:presstintedglass");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Changes the patern on blocks");
		
		}

}