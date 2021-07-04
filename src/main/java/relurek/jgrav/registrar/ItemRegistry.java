package relurek.jgrav.registrar;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import relurek.jgrav.*;
import relurek.jgrav.config.*;
import relurek.jgrav.item.*;
import relurek.jgrav.tab.*;
import relurek.jgrav.util.*;

public class ItemRegistry {
	private static final List<String> ITEMS = new ArrayList<String>();
	public static final ArrayList<Item> MOD_BLOCKS = new ArrayList<Item>();
	public static final ArrayList<Item> MOD_ITEMS = new ArrayList<Item>();
	
	public static final Item GRAV_ANCHOR_DOWN = register("grav_anchor_down", 
			new ItemDownAnchor(defaultSettings()));
	public static final Item GRAV_ANCHOR_UP = register("grav_anchor_up",
			new ItemUpAnchor(defaultSettings()));
	public static final Item GRAV_ANCHOR_NORTH = register("grav_anchor_north",
			new ItemNorthAnchor(defaultSettings()));
	public static final Item GRAV_ANCHOR_EAST = register("grav_anchor_east",
			new ItemEastAnchor(defaultSettings()));
	public static final Item GRAV_ANCHOR_SOUTH = register("grav_anchor_south",
			new ItemSouthAnchor(defaultSettings()));
	public static final Item GRAV_ANCHOR_WEST = register("grav_anchor_west",
			new ItemWestAnchor(defaultSettings()));
	
	public static void init() {}
	
	private static Item register(String name, Item item) {
		if ((item instanceof BlockItem || Configs.ITEMS.getBoolean("items", name, true)) && item != Items.AIR) {
			//register only if an item
			Registry.register(Registry.ITEM, new Identifier(JGrav.ID, name), item);
			
			//item lists for tab
			if (item instanceof BlockItem)
				MOD_BLOCKS.add(item);
			else
				MOD_ITEMS.add(item);
		}
		if (!(item instanceof BlockItem))
			ITEMS.add(name);
		return item;
	}
	
	
	private static Settings defaultSettings() {
		return new Item.Settings().group(CreativeTab.JGRAV_TAB);
	}
}