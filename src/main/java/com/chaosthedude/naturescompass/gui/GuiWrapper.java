package com.chaosthedude.naturescompass.gui;

import com.chaosthedude.naturescompass.NaturesCompass;
import com.chaosthedude.naturescompass.items.NaturesCompassItem;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GuiWrapper {
	
	public static void openGUI(World world, PlayerEntity player, ItemStack stack) {
		Minecraft.getInstance().displayGuiScreen(new NaturesCompassScreen(world, player, stack, (NaturesCompassItem) stack.getItem(), NaturesCompass.allowedBiomes));
	}

}
