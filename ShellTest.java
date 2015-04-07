import static org.junit.Assert.*;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsSame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ShellTest extends Applet{

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
	public void Shelltest() {
	 Shell	S = new Shell();
	 assertequal(S.x, 0);assertequal(S.y, 0);assertequal(S.direction, 2);
	 assertequal(S.h, 3); assertequal(S.w, 3); assertequal(S.speed, 20);
	 assertTrue(S.isAlive);
	}
	@Test
	public void ShellTestinput(){
	Shell S=new Shell(1, 0, 0);
	 assertequal(S.x, 0);assertequal(S.y, 0);assertequal(S.direction, 1);
	 assertequal(S.h, 3); assertequal(S.w, 3); assertequal(S.speed, 5);
	}
	@Test
	public void ShellTestinputalot(){
	Shell S= new Shell(1, 0, 0, 3, 3, 20);
	assertequal(S.x, 0);assertequal(S.y, 0);assertequal(S.direction, 1);
	assertequal(S.h, 3); assertequal(S.w, 3); assertequal(S.speed, 20);
	}
	@Test
	public void moveTest(){
	Shell S= new Shell(2, 0, 0, 3, 3, 20);
	S.move();
	assertequal(S.x, 20);
	
	}	

}
