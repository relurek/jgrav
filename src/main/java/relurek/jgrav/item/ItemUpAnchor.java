package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemUpAnchor extends ItemAnchor{
	public ItemUpAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.UP);
		}
}
