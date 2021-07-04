package relurek.jgrav.util;

import relurek.jgrav.util.Direction;

public enum GravityHelper {
	UP (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {-x, -y, z};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.WEST;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.SOUTH;
		}
	},
	DOWN (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, y, z};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.EAST;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.SOUTH;
		}
	},
	NORTH (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, -z, y};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.EAST;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.UP;
		}
	},
	EAST (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {y, -x, z};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.UP;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.SOUTH;
		}
	},
	SOUTH (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {x, z, -y};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.EAST;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.DOWN;
		}
	},
	WEST (){
		@Override
		public double[] adjust(double x, double y, double z) {
			return new double[] {-y, x, z};
		}
		
		@Override
		public Direction relativePosX() {
			return Direction.DOWN;
		}
		
		@Override
		public Direction relativePosZ() {
			return Direction.SOUTH;
		}
	};
	
	public abstract double[] adjust(double x, double y, double z);
	public abstract Direction relativePosX();
	public abstract Direction relativePosZ();
}
