import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TankTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	public void assertequal(double a ,  double a1){
		
		if(a==a1){System.out.printf("正確！原為 %f 應為%f\n",a,a1);}
		else{System.out.printf("error！原為%f應為%f\n",a,a1);fail("error!");
			//System.out.printf("error！原為%f應為%f\n",a,a1);}
		}
	}
	 
	public void assertequal(int a ,  int a1){
		
		if(a==a1){System.out.printf("正確！原為 %d 應為%d\n",a,a1);}
		else{	System.out.printf("error！原為%d應為%d\n",a,a1);fail("error!");}
	}
		//System.out.printf("error！原為%d應為%d\n",a,a1);}
	@Test
	public void Tank(){
	Tank T=new Tank(0, 0, null, 20, 1, 5);
	 assertequal(T.x, 0);assertequal(T.y, 0);assertequal(T.direction, 1);
	 assertequal(T.moveBy, 20); assertequal(T.maxFire, 5); assertequal(T.maxShells, 1000);
	 assertTrue(T.isMoving);
	 assertFalse(T.isAlive);
	 assertFalse(T.exploded);
	}
	@Test
	public void TurnTest(){
		Tank T=new Tank();
		T.turn(0);
		assertequal(T.direction, 0);
	}
	@Test
	public void TurnAroundTest(){
		Tank T=new Tank(0, 0, null, 20, 1, 5);
		
		T.turnAround();
		assertequal(T.direction, 3);
	}
	@Test
	public void moveTest(){
		Tank T=new Tank(0, 0, null, 20, 1, 5);
		T.move();
		assertFalse(T.isMoving);
	}
	@Test
	public void explodeTest(){
		Tank T=new Tank();
		T.explode();
		assertTrue(T.exploded);
	}
	@Test 
	public void tankWidthTest(){
		Tank T=new Tank(0, 0, null, 20, 1, 5);
		int x=T.tankWidth();
		assertequal(x, 35);	
	}
	@Test 
	public void tankHeightTest(){
		Tank T=new Tank(0, 0, null, 20, 2, 5);
		int x=T.tankHeight();
		assertequal(x, 40);	
	}

}
