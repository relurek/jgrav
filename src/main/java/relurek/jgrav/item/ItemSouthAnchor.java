package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemSouthAnchor extends ItemAnchor{
	public ItemSouthAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.SOUTH);
		}
}