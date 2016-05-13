package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.Test;

import a.Acces;

import a.Turist;

import junit.framework.TestCase;

public class testAccess extends TestCase {

	@Test
	public void testGet() {
		//fail("Not yet implemented");
		Acces a = new Acces("cartela003",60,"client003");
		
		// test if code starts with "cartela":				
		String s = a.getCodCartela();
		s = s.substring(0,7);
		assertEquals("cartela", s);   

	}
	
}
