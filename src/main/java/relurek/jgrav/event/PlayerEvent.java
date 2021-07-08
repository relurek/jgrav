package relurek.jgrav.event;

import net.minecraft.entity.player.PlayerEntity;

public interface PlayerEvent {
	public void setPlayer(PlayerEntity in);
	public PlayerEntity getPlayer();
}
