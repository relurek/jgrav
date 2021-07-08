package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemNorthAnchor extends ItemAnchor{
	public ItemNorthAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.NORTH);
		}
}
