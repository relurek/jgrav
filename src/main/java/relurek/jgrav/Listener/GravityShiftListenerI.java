package relurek.jgrav.Listener;

import relurek.jgrav.Listener.GravityShiftListener;
import relurek.jgrav.util.Direction;

public class GravityShiftListenerI implements GravityShiftListener {
	public GravityShiftListenerI() {}
	
	@Override
	public void onGravityShift(Direction from, Direction to) {
		System.out.println(String.format("Gravity has shifted from %s to %s", from.string(), to.string()));
	}
}
