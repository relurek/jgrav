package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemDownAnchor extends ItemAnchor{
	public ItemDownAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.DOWN);
		}
}
