package relurek.jgrav.item;

import relurek.jgrav.util.Direction;

public class ItemSouthAnchor extends ItemAnchor{
	public ItemSouthAnchor (Settings s) {
		super(s);
		this.setDirection(Direction.SOUTH);
		}
}