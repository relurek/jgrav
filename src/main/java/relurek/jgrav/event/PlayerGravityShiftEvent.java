package relurek.jgrav.event;

import net.minecraft.entity.player.PlayerEntity;

import relurek.jgrav.util.GravityDirection;
import relurek.jgrav.util.PlayerGravityManager;

public class PlayerGravityShiftEvent extends GravityTransitionEvent {
	private PlayerEvent p;
	public PlayerGravityShiftEvent(PlayerEntity in, GravityDirection from, GravityDirection to) {
		p = PlayerEventFactory.make(in);
		setFrom(from);
		setTo(to);
	}
	
	public void handle() {
		PlayerGravityManager manager = PlayerGravityManager.getInstance();
		
		manager.getGravityTracker(p.getPlayer()).setGravityDirection(getTo());
	}
}
