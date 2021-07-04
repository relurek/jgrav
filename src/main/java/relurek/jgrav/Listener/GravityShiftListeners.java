package relurek.jgrav.Listener;

import java.util.*;

import relurek.jgrav.util.Direction;

public class GravityShiftListeners {
	GravityShiftListeners() {}
	
	private Collection<GravityShiftListener> listeners = new HashSet<>();
	
	public void addListener(GravityShiftListener list) {
		listeners.add(list);
	}
	
	public void GravityShiftEventHappens(Direction from, Direction to) {
		for (GravityShiftListener listener : listeners) {
			listener.onGravityShift(from, to);
		}
	}
}