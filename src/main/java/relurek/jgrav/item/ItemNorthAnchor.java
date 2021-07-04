package relurek.jgrav.item;

import relurek.jgrav.util.Direction;

public class ItemNorthAnchor extends ItemAnchor{
	public ItemNorthAnchor (Settings s) {
		super(s);
		this.setDirection(Direction.NORTH);
		}
}
