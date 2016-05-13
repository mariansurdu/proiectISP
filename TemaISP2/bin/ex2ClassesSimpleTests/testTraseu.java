package ex2ClassesSimpleTests;
//verifica daca user-ul a parcurs vreun traseu(numar de partii sa fie mai mare ca 0);
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import a.Traseu;
import a.Partie;
import a.PunctReferinta;

public class testTraseu {

	@Test
	public void test() {
		//need to implement partie!
		//Traseu 1
		String dificultate="Medie";
		PunctReferinta pctInc=new PunctReferinta(2,3,4);
		PunctReferinta pctSfarsit=new PunctReferinta(2,3,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		//Traseu 2
		String dificultate1="Dificil";
		PunctReferinta pctInc1=new PunctReferinta(2,2,4);
		PunctReferinta pctSfarsit1=new PunctReferinta(2,2,5);
		Partie p1=new Partie(dificultate1,pctInc1,pctSfarsit1);
		
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		list.add(p1);
		
		
		Traseu t=new Traseu(list);
		int x=t.getLengthTraseu();
		System.out.println(x);
		assertEquals(2,x);
		
		
		
		
		
		
		
	}

}
