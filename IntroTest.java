import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class IntroTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	public void assertequal(double a ,  double a1){
		
		if(a==a1){System.out.printf("���T�I�쬰 %f ����%f\n",a,a1);}
		else{System.out.printf("error�I�쬰%f����%f\n",a,a1);fail("error!");
			//System.out.printf("error�I�쬰%f����%f\n",a,a1);}
		}
	}
	 
	public void assertequal(int a ,  int a1){
		
		if(a==a1){System.out.printf("���T�I�쬰 %d ����%d\n",a,a1);}
		else{	System.out.printf("error�I�쬰%d����%d\n",a,a1);fail("error!");}
	}
	@Test
	public void IntroTest(){
		Intro I=new Intro();
		 assertequal(I.x1, 0);assertequal(I.x2, 0);assertequal(I.speed, 10);
		 assertFalse(I.opened);
		 assertFalse(I.opening);
	}
	@Test
	public void moveTest(){
		Intro I=new Intro();
		I.move();
		assertequal(I.x1, -10);assertequal(I.x2, 11);assertequal(I.y1, 2);
		 assertFalse(I.opened);
		 assertFalse(I.opening);
		}
	
}
