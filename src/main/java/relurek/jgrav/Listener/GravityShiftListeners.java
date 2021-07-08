package relurek.jgrav.listener;

import java.util.*;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

import relurek.jgrav.event.PlayerGravityShiftEvent;
import relurek.jgrav.util.PlayerGravityManager;
import relurek.jgrav.util.GravityDirection;

public class GravityShiftListeners {
	public GravityShiftListeners() {
		GravityShiftCallback.EVENT.register((player, from, to) -> {
			System.out.println(String.format("Gravity on %s has shifted from %s to %s", player.getName().toString(), from.toString(), to.toString()));
			
			PlayerGravityShiftEvent event = new PlayerGravityShiftEvent(player, from, to);
			event.handle();
			
			return ActionResult.PASS;
		});
	}
}