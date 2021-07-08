package relurek.jgrav.event;

import relurek.jgrav.util.GravityDirection;

public abstract class GravityTransitionEvent extends Event{
	private GravityDirection from;
	private GravityDirection to;
	
	public GravityDirection getFrom() { return from; }
	public GravityDirection getTo() { return to; }
	
	public void setFrom(GravityDirection in) { from = in; }
	public void setTo(GravityDirection in) { to = in; }
}
