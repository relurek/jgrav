package relurek.jgrav.item;

import relurek.jgrav.util.Direction;

public class ItemDownAnchor extends ItemAnchor{
	public ItemDownAnchor (Settings s) {
		super(s);
		this.setDirection(Direction.DOWN);
		}
}
