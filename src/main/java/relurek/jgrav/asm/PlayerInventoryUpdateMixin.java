package relurek.jgrav.asm;

import java.util.*;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.*;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;

import relurek.jgrav.JGrav;
import relurek.jgrav.entity.PlayerEntityGravity;
import relurek.jgrav.item.GravItem;
import relurek.jgrav.listener.GravityShiftCallback;
import relurek.jgrav.util.GravityDirection;
import relurek.jgrav.util.PlayerEntityHelpers;
import relurek.jgrav.util.GravityEventHelpers;
import relurek.jgrav.util.PlayerGravityManager;



@Mixin(net.minecraft.entity.player.PlayerInventory.class)
public class PlayerInventoryUpdateMixin {
	public GravityDirection newDirection;
	PlayerEntity eventPlayer;
	List<DefaultedList<ItemStack>> eventInv;
	PlayerEntityHelpers playerHelp = new PlayerEntityHelpers();
	GravityEventHelpers eventHelp = new GravityEventHelpers();
	
	public PlayerInventoryUpdateMixin() {}
	public void init() {}
	
	
	
	
		
	//@Inject(method = "removeStack(II)Lnet/minecraft/item/ItemStack;", at = @At("RETURN"))
	//private void jgravRemoveStackCallback(CallbackInfoReturnable ci) {
	//	System.out.println("RemoveStack");
		//confirmGravityCheck(ci);
	//}
	
	//@Inject(method = "addStack(ILnet/minecraft/item/ItemStack;)I", at = @At("RETURN"))
	//private void jgravAddStackCallback(CallbackInfoReturnable ci) {
	//	System.out.println("AddStack");
	//	//confirmGravityCheck(ci);
	//}
	
	//@Inject(method = "insertStack(ILnet/minecraft/item/ItemStack;)Z", at = @At("RETURN"))
	//private void jgravInsertStackCallback(CallbackInfoReturnable ci) {
	//	System.out.println("InsertStack");
		//confirmGravityCheck(ci);
	//}
	
	//@Inject(method = "addPickBlock(Lnet/minecraft/item/ItemStack;)V", at = @At("RETURN"))
	//private void jgravAddPickCallback(CallbackInfo ci) {
	//	System.out.println("AddPickBlock");
	//}
	
	@Inject(method = "setStack(ILnet/minecraft/item/ItemStack;)V", at = @At("RETURN"))
	private void jgravSetStackCallback(CallbackInfo ci) {
		//System.out.println("SetStack");
		confirmGravityCheck(ci);
	}
	
	
	//@Inject(method = "offer(Lnet/minecraft/item/ItemStack;Z)V", at = @At("RETURN"))
	//private void jgravOfferCallback(CallbackInfo ci) {
	//	System.out.println("Offer");
	//}
	
	
	private void confirmGravityCheck(CallbackInfo ci) {
		eventPlayer = ((PlayerInventory) (Object) this).player;
		PlayerGravityManager manager = PlayerGravityManager.getInstance();
		PlayerEntityGravity player = manager.getGravityTracker(eventPlayer);
		
		eventInv = playerHelp.getCombinedInventory(eventPlayer);
				
		// Find current/previous gravity direction
		GravityDirection to = eventHelp.hasGravityItems(eventInv);
		if (to != null) {
			// Now we check for gravity shift
			GravityDirection from = player.getGravityDirection();
			if (from != to) {
				// Gravity shift has occurred, call the event
				ActionResult result = GravityShiftCallback.EVENT.invoker().onGravityShift(eventPlayer, from, to);

			if (result == ActionResult.FAIL)
				ci.cancel();
			}
		}
	}
	private void confirmGravityCheck(CallbackInfoReturnable ci) {
		eventPlayer = ((PlayerInventory) (Object) this).player;
		PlayerGravityManager manager = PlayerGravityManager.getInstance();
		PlayerEntityGravity player = manager.getGravityTracker(eventPlayer);
		
		eventInv = playerHelp.getCombinedInventory(eventPlayer);
				
		// Find current/previous gravity direction
		GravityDirection to = eventHelp.hasGravityItems(eventInv);
		if (to != null) {
			// Now we check for gravity shift
			GravityDirection from = player.getGravityDirection();
			if (from != to) {
				// Gravity shift has occurred, call the event
				ActionResult result = GravityShiftCallback.EVENT.invoker().onGravityShift(eventPlayer, from, to);

			if (result == ActionResult.FAIL)
				ci.cancel();
			}
		}
	}
	
}