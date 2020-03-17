package uvsq.pglp_3_3.pglp_3_3;

import static org.junit.Assert.*;

public class AppTest {
	
	@Test
	public void tourneTest() {
		Position p=new Position(8,7);
		Orientation d=Orientation.N;
		Robot R=new Robot(p,d);
		Orientation expected=Orientation.E;
		R.tourne();
		
		assertEquals(expected,R.getOrientation());
	}
	
	
	

	@Test
	public void avanceTest()  {
		Position p=new Position(9,2);
		Orientation d=Orientation.N;
		Robot R=new Robot(p,d);
		Position expected=new Position(9,2);
		R.avance();
		
		assertEquals(expected.getY(),R.getPosition().getY());
		assertEquals(expected.getX(),R.getPosition().getX());
		
	}}