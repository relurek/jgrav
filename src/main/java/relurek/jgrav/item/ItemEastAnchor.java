package relurek.jgrav.item;

import relurek.jgrav.util.GravityDirection;

public class ItemEastAnchor extends ItemAnchor{
	public ItemEastAnchor (Settings s) {
		super(s);
		this.setDirection(GravityDirection.EAST);
		}
}
