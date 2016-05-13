package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import a.Traseu;
import a.Turist;
import a.Partie;

import org.junit.Test;
import a.PunctReferinta;
public class testPunctReferinta {

	@Test
	public void test() {
		PunctReferinta pct1=new PunctReferinta(2.3,5,7);
		PunctReferinta pct2=new PunctReferinta(1,6,3);
		Partie p1=new Partie ("Mediu",pct1,pct2);
		
		PunctReferinta pct4=new PunctReferinta(2.6,5.7,7.9);
		PunctReferinta pct3=new PunctReferinta(6,5.8,7.9);
		Partie p2=new Partie ("Mediu",pct4,pct3);
		
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p2);
		list.add(p1);
		Traseu traseu=new Traseu(list); 
		//Constructorul din turist,cu codul si traseul
		//Vrem sa vedem daca turistul se afla pe partia p3
		//Turist t=new Turist("11111",traseu);
		
		PunctReferinta pct5=new PunctReferinta(6.5,7,9);
		PunctReferinta pct6=new PunctReferinta(5,7,9);
		Partie p3=new Partie ("Mediu",pct5,pct6);
		
		//estePePartie(t,p3); - nu stiu cum sa o apelez
		
		
		
		
	}

}
