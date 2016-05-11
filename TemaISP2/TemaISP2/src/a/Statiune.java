package a;
import java.util.ArrayList;

public class Statiune {
String nume;
ArrayList<Partie> partii;

public void afisare() {
	System.out.println("Nume statiune:"+nume);
	for (Partie p:partii) {
		p.afisare();
	}
}

public void Statiune(String nume,ArrayList<Partie> p) {
	this.nume=nume;
	this.partii=p;
}


}
