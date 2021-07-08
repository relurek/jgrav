package relurek.jgrav.asm;

import java.util.List;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;

import relurek.jgrav.JGrav;
import relurek.jgrav.entity.PlayerEntityGravity;
import relurek.jgrav.item.GravItem;
import relurek.jgrav.listener.GravityShiftCallback;
import relurek.jgrav.util.GravityDirection;
import relurek.jgrav.util.GravityEventHelpers;
import relurek.jgrav.util.PlayerGravityManager;

@Mixin(net.minecraft.entity.player.PlayerInventory.class)
public interface PlayerInventoryMixin {
	@Accessor ("combinedInventory")
	List<DefaultedList<ItemStack>> getCombinedInventory();
}
