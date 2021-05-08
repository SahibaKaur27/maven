/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cal.calc;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author SAHIBA KAUR
 */
 public class calcJUnitTest {
        @Test
    
        public void calTestadd() {
		
		/*assertEquals("error in add()",3,cal.add(1,2));
		assertEquals("error in add()",-1,cal.add(-1,-2));
		assertEquals("error in add()",9,cal.add(9,0));*/
	}
	public void caladdFail() {
		assertEquals("error in add()",0,calc.add(1,2));
	}
	public void calTestsub() {
		
		assertEquals("error in sub()",1,calc.sub(1,2));
		assertEquals("error in sub()",-1,calc.sub(-1,-2));
		assertEquals("error in sub()",9,calc.sub(9,0));
	}
	public void calsubFail() {
		assertEquals("error in sub()",0,calc.sub(1,2));
	}
	public void calTestmul() {
		
		assertEquals("error in mul()",2,calc.mul(1,2));
		assertEquals("error in mul()",2,calc.mul(-1,-2));
		assertEquals("error in mul()",0,calc.mul(9,0));
	}
	public void calmulFail() {
		assertEquals("error in mul()",0,calc.mul(1,2));
	}
	public void calTestdiv() {
		
		assertEquals("error in div()",1,calc.div(2,2));
		assertEquals("error in div()",2,calc.div(-4,-2));
		assertEquals("error in div()",3,calc.div(9,3));
	}
	public void caldivFail() {
	assertEquals("error in div()",0,calc.div(1,2));
}
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

