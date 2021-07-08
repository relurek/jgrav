package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemWestAnchor extends ItemAnchor{
	public ItemWestAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.WEST);
		}
}
