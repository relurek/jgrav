package relurek.jgrav.util;

public enum GravityDirection {
	DOWN {
		@Override
		public String string() {
			return "DOWN";
		}
	}, UP {
		@Override
		public String string() {
			return "UP";
		}
	}, NORTH {
		@Override
		public String string() {
			return "NORTH";
		}
	}, SOUTH {
		@Override
		public String string() {
			return "SOUTH";
		}
	}, EAST {
		@Override
		public String string() {
			return "EAST";
		}
	}, WEST {
		@Override
		public String string() {
			return "WEST";
		}
	};
	
	public abstract String string();
}