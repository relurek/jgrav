package relurek.jgrav.tab;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import relurek.jgrav.JGrav;
import relurek.jgrav.registrar.ItemRegistry;

public class CreativeTab {
	public static final ItemGroup JGRAV_TAB = FabricItemGroupBuilder.create(
			new Identifier(JGrav.ID, "items")).icon(() -> new ItemStack(ItemRegistry.GRAV_ANCHOR_DOWN))
			.appendItems(stacks -> {
				for (Item i : ItemRegistry.MOD_ITEMS) {
					stacks.add(new ItemStack(i));
				}
			})
			.build();
}