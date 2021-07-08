package relurek.jgrav.util;

import java.util.List;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.collection.DefaultedList;

import relurek.jgrav.asm.PlayerInventoryMixin;

public class PlayerEntityHelpers {

	public List<DefaultedList<ItemStack>> getCombinedInventory(PlayerEntity player) {
		return ((PlayerInventoryMixin) player.getInventory()).getCombinedInventory();
	}
	
}
