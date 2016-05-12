package a;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Traseu {
ArrayList<Partie> traseu;

public Traseu(ArrayList<Partie> traseu) {
	this.traseu=traseu;
}

public void afisareTraseu() {
	for (Partie p:traseu) {
		
		p.afisare();
	}
}

public void Traseu(ArrayList<Partie> traseu) {
	this.traseu=traseu;
}

public void addTraseu(Partie p) {
	this.traseu.add(p);
}

public int getLengthTraseu() {
	System.out.println(traseu.size());
	return traseu.size();
}


}
