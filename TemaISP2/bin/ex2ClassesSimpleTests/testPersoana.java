package ex2ClassesSimpleTests;
		//check if varsta > 15
import static org.junit.Assert.*;
import a.Persoana;

import org.junit.Test;

public class testPersoana {

	@Test
	public void test() {
		Persoana p=new Persoana("A","B","12445",15);
		int x=p.getVarsta();
		assertEquals(15,x);
	}

}
