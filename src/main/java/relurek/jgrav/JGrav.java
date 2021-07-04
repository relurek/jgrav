package relurek.jgrav;

import net.fabricmc.api.ModInitializer;

import relurek.jgrav.Listener.GravityShiftListenerI;
import relurek.jgrav.Listener.GravityShiftListeners;
import relurek.jgrav.registrar.ItemRegistry;

public class JGrav implements ModInitializer {
	public static final String ID = "jgrav";
	
	public GravityShiftListeners gsListen;
	
	@Override
	public void onInitialize() {
		gsListen.addListener(new GravityShiftListenerI());
		ItemRegistry.init();
	}
}