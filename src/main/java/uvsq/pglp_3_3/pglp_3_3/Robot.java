package uvsq.pglp_3_3.pglp_3_3;

public class Robot extends RobotStatique {
	
	public Robot(Position p, Orientation d) 
	{
		super(p, d);
	}

	public void tourne() {
		if(orientation.equals(Orientation.N)) {
			this.orientation=Orientation.E;
		}
		else if(orientation.equals(Orientation.E)) {
			this.orientation=Orientation.S;
		}
		else if(orientation.equals(Orientation.S)) {
			this.orientation=Orientation.O;
		}
		else {
			this.orientation=Orientation.N;
		}
	}
	
	
	public void avance(){
		if(orientation.equals(Orientation.N)) {
			this.position.deplaceY(1);
		}
		else if(orientation.equals(Orientation.E)) {
			this.position.deplaceX(1);
		}
		else if(orientation.equals(Orientation.S)) {
			this.position.deplaceY(-1);
		}
		else {
			this.position.deplaceX(-1);
		}
	}
}
