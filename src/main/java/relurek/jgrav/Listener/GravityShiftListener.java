package relurek.jgrav.Listener;

import java.util.EventListener;

import relurek.jgrav.util.Direction;

public interface GravityShiftListener extends EventListener{
	public void onGravityShift(Direction from, Direction to);
}
