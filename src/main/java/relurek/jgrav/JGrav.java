package relurek.jgrav;

import java.util.List;

import net.fabricmc.api.ModInitializer;

import relurek.jgrav.asm.*;
import relurek.jgrav.entity.PlayerEntityGravity;
import relurek.jgrav.listener.GravityShiftCallback;
import relurek.jgrav.listener.GravityShiftListeners;
import relurek.jgrav.registrar.ItemRegistry;
import relurek.jgrav.util.PlayerGravityManager;

public class JGrav implements ModInitializer {
	public static final String ID = "jgrav";
	//public GravityShiftListeners gsListen = new GravityShiftListeners();
	
	
	@Override
	public void onInitialize() {
		//gsListen.addListener(new GravityShiftListenerI());
		ItemRegistry.init();
		@SuppressWarnings("unused")
		GravityShiftListeners lstn = new GravityShiftListeners();
	}
}