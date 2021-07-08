package relurek.jgrav.util;

import relurek.jgrav.util.GravityDirection;

public enum GravityHelper {
	UP (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {-x, -y, z};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.WEST;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.SOUTH;
		}
	},
	DOWN (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, y, z};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.EAST;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.SOUTH;
		}
	},
	NORTH (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, -z, y};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.EAST;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.UP;
		}
	},
	EAST (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {y, -x, z};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.UP;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.SOUTH;
		}
	},
	SOUTH (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, z, -y};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.EAST;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.DOWN;
		}
	},
	WEST (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {-y, x, z};
		}
		
		@Override
		public GravityDirection relativePosX() {
			return GravityDirection.DOWN;
		}
		
		@Override
		public GravityDirection relativePosZ() {
			return GravityDirection.SOUTH;
		}
	};
	
	public abstract double[] adjust(double x, double y, double z);
	public abstract GravityDirection relativePosX();
	public abstract GravityDirection relativePosZ();
}


