package relurek.jgrav.item;

import net.fabricmc.api.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

//import relurek.jgrav.item.GravItem;
import relurek.jgrav.util.Direction;
import relurek.jgrav.util.Strength;

public class ItemAnchor extends Item implements GravItem{
	//private//
	private Direction direction;
	private Strength strength = Strength.NORMAL;
	
	
	//public//
	public ItemAnchor(Settings settings) {
		super(settings);
	}
	
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction in) {
		direction = in;
	}
	
	public Strength getStrength() {
		return strength;
	}
	public void setStrength(Strength in) {
		strength = in;
	}
	
	
	
	
}