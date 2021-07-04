package relurek.jgrav.item;

import relurek.jgrav.util.Direction;

public class ItemUpAnchor extends ItemAnchor{
	public ItemUpAnchor (Settings s) {
		super(s);
		this.setDirection(Direction.UP);
		}
}
