import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BattleCityTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void assertequal(double a ,  double a1){
		
		if(a==a1){System.out.printf("正確！原為 %f 應為%f\n",a,a1);}
		else{fail("error!");
			//System.out.printf("error！原為%f應為%f\n",a,a1);}
		}
	}
	 
	public void assertequal(int a ,  int a1){
		
		if(a==a1){System.out.printf("正確！原為 %d 應為%d\n",a,a1);}
		else{	fail("error!");}
	}
		//System.out.printf("error！原為%d應為%d\n",a,a1);}
	@Test
	public void CollideTest(){
		boolean iscollide;
		BattleCity B=new BattleCity();
		Tank t1=new Tank(0, 0, null, 20, 1, 5);
		Tank t2=new Tank(0, 0, null, 20, 1, 5);
		iscollide=B.collide(t1, t2);
		 assertTrue(iscollide);
	}
	
}
