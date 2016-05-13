package ex2ClassesSimpleTests;
//check if transport is telegondola
import static org.junit.Assert.*;


import org.junit.Test;
import a.Transport;
public class testTransport {

	@Test
	public void test() {
		String value="telegondola";
		Transport t=new Transport("telegondola");
		assertEquals(value,t.getTransport());
	}

}
