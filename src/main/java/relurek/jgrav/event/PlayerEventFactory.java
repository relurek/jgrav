package relurek.jgrav.event;

import net.minecraft.entity.player.PlayerEntity;

import relurek.jgrav.event.PlayerEvent;

public class PlayerEventFactory {
	public static PlayerEvent make(PlayerEntity in) {
		return new PlayerEvent() {
				private PlayerEntity player = in;
				
				public PlayerEntity getPlayer() { return player; }
				public void setPlayer(PlayerEntity in) { player = in; }
		};
	}
}
