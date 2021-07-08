package relurek.jgrav.entity;



import net.minecraft.entity.player.PlayerEntity;


import relurek.jgrav.util.GravityDirection;

public class PlayerEntityGravity {
	private GravityDirection gravDirection = GravityDirection.DOWN;
	private PlayerEntity player;
	
	public PlayerEntityGravity(PlayerEntity playerIn) {
		player = playerIn;
		gravDirection = GravityDirection.DOWN;
	}
	
	
	public GravityDirection getGravityDirection() {
		return gravDirection;
	}
	public void setGravityDirection(GravityDirection in) {
		gravDirection = in;
	}
	
	public PlayerEntity getPlayer() {
		return player;
	}
	public void setPlayer(PlayerEntity in) {
		player = in;
	}
}
