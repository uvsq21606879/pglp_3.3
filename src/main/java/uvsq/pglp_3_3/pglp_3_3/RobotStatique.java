package uvsq.pglp_3_3.pglp_3_3;

public class RobotStatique {

	 Position position;
	 Orientation orientation;
	
	public RobotStatique(Position P, Orientation dir) {
		
		this.position=P;
		
		this.orientation=dir;
	}
	
	public Orientation getOrientation(){
		return this.orientation;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
}
