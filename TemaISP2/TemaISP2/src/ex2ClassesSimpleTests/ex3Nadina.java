package ex2ClassesSimpleTests;

import static org.junit.Assert.*;
import a.Persoana;
import a.Instructor;
import a.Partie;
import a.Turist;
import a.PunctReferinta;

import org.junit.Test;

public class ex3Nadina {

	@Test
	public void test() {
		
			Turist t=new Turist("Preda","Dan","111",26,true,"444",true,true);
			String dificultate1="Mediu";
			PunctReferinta pct1=new PunctReferinta(2.3,5,7);
			PunctReferinta pct2=new PunctReferinta(1,6,3);
			Partie p=new Partie(dificultate1,pct1,pct2);
			if (t.Access.setAcces()!=null)
			{
				System.out.println("Turistul are access");
			}
	}
}
	


