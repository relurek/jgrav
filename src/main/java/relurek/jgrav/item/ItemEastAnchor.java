package relurek.jgrav.item;

import relurek.jgrav.util.Direction;

public class ItemEastAnchor extends ItemAnchor{
	public ItemEastAnchor (Settings s) {
		super(s);
		this.setDirection(Direction.EAST);
		}
}
