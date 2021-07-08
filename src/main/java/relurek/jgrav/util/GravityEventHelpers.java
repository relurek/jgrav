package relurek.jgrav.util;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import relurek.jgrav.item.GravItem;

public class GravityEventHelpers {
	public boolean gravityDiffers(GravityDirection from, GravityDirection to)
	{
		if (from == to)
			return false;
		return true;
	}
		
		
	public GravityDirection hasGravityItems(List<DefaultedList<ItemStack>> inv) {
		//For all inventories
		if (inv == null)
			return GravityDirection.DOWN;
		for (DefaultedList<ItemStack> set : inv) {
			//For all items per inventory
			if (set == null)
				return GravityDirection.DOWN;
			for (ItemStack itemStack : set) {
				if (itemStack != null) {
					Item item = itemStack.getItem();
					
					// Does item impart gravity change?
					if (item instanceof GravItem) {
						return ((GravItem) item).getDirection();
					} // item instaceof GravItem
				} // null check
			} // iterate through inventory
		} // iterate inventories
		return GravityDirection.DOWN;
	} // helper class
}
