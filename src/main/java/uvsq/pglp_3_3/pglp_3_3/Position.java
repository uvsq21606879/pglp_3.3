package uvsq.pglp_3_3.pglp_3_3;

public class Position {

	int x;
	int y;
	
	public Position (int x, int y){
		this.x=x;
		this.y=y; 
	}

	protected void deplaceX(int x_deplace) {
		this.x=this.x+x_deplace;
	}
	
	protected void deplaceY(int y_deplace) {
		this.y=this.y+y_deplace;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
