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
		
		if(a==a1){System.out.printf("���T�I�쬰 %f ����%f\n",a,a1);}
		else{fail("error!");
			//System.out.printf("error�I�쬰%f����%f\n",a,a1);}
		}
	}
	 
	public void assertequal(int a ,  int a1){
		
		if(a==a1){System.out.printf("���T�I�쬰 %d ����%d\n",a,a1);}
		else{	fail("error!");}
	}
		//System.out.printf("error�I�쬰%d����%d\n",a,a1);}
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
