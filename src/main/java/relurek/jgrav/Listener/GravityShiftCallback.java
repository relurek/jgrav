package relurek.jgrav.listener;

import java.util.EventListener;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

import net.fabricmc.fabric.api.event.*;

import relurek.jgrav.entity.PlayerEntityGravity;
import relurek.jgrav.util.GravityDirection;

public interface GravityShiftCallback extends EventListener{
	
	public Event<GravityShiftCallback> EVENT = EventFactory.createArrayBacked(GravityShiftCallback.class, (listeners) -> (player, from, to) -> {
		for (GravityShiftCallback listener: listeners) {
			ActionResult result = listener.onGravityShift(player, from, to);
			
			if(result != ActionResult.PASS)
				return result;
		}
		return ActionResult.PASS;
	});
	
	public ActionResult onGravityShift(PlayerEntity player, GravityDirection from, GravityDirection to);
}
