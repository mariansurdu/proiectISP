package ex2ClassesSimpleTests;
//this test is used to check if user gained his access
import static org.junit.Assert.*;
import a.Turist;

import org.junit.Test;



public class testTurist {

	@Test
	public void test() {
		Turist t=new Turist("ANdrei","Marian","2132ddd",23,true,"2342dd",true,true);
		Boolean x=t.obtineAccess(true,null);
		assertEquals(true,x);
		
		
	}

}
