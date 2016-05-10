package ex2ClassesSimpleTests;
import java.util.ArrayList;
import a.Persoana;
import a.Traseu;
import a.Turist;
import a.PunctReferinta;
import a.Partie;

import junit.framework.TestCase;

public class testRelatieAsociatieTuristTraseuSM extends TestCase {
	Persoana persoana;
	Traseu traseu;
	Turist turist;
	protected void setUp() throws Exception{
		super.setUp();
		persoana=new Persoana("ion","ionel","22323",22);
		
		String dificultate="Medie";
		PunctReferinta pctInc=new PunctReferinta(2,3,4);
		PunctReferinta pctSfarsit=new PunctReferinta(2,3,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		traseu=new Traseu(list);
		turist=new Turist(persoana,"12344",traseu);
		
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		turist=null;
		traseu=null;
	}
	public void testAsociereTraseu() {
		assertSame(turist.getTraseu(),traseu);
	}
	
	public void testSetTraseu() {
		//assertNotSame(turist.getTraseu(),traseu);
		
		String dificultate="Incepator";
		PunctReferinta pctInc=new PunctReferinta(2,2,4);
		PunctReferinta pctSfarsit=new PunctReferinta(2,2,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		Traseu altTraseu=new Traseu(list);
		//assertSame(turist.getTraseu(),altTraseu);
		turist.setTraseu(altTraseu);
		assertEquals(turist.getTraseu(),altTraseu);
		assertNotSame(turist.getTraseu(),traseu);
		
	}
	
	public void testGetTraseu() {
		Traseu t=turist.getTraseu();
				assertSame(t,traseu);
	}
	
	
}





