package relurek.jgrav.util;

import java.util.List;

import java.util.Vector;

import net.minecraft.entity.player.PlayerEntity;

import relurek.jgrav.JGrav;
import relurek.jgrav.entity.PlayerEntityGravity;

public class PlayerGravityManager {
	private static PlayerGravityManager instance;
	private List<PlayerEntityGravity> playerGravSet = new Vector<PlayerEntityGravity>();
	
	public static PlayerGravityManager getInstance() {
		if (instance == null)
			instance = new PlayerGravityManager();
		return instance;
	}
	
	
	private PlayerEntityGravity addNewGravityTracker(PlayerEntity player) {
		PlayerEntityGravity ngrav = new PlayerEntityGravity(player);
		playerGravSet.add(ngrav);
		return ngrav;
	}
	private PlayerEntityGravity getGravTracker(PlayerEntity player) {
		if (getList() == null)
			return null;
		for (PlayerEntityGravity id : getList()) {
			if (id.getPlayer() == player)
				return id;
		}
		return null;
	}
	
	public List<PlayerEntityGravity> getList() {
		return playerGravSet;
	}
	
	public PlayerEntityGravity getGravityTracker(PlayerEntity player) {
		PlayerEntityGravity out = getGravTracker(player);
		if (out == null)
			return addNewGravityTracker(player);
		
		return out;
	}
}
