package a;

public class Partie {
String dificultate;
PunctReferinta pctInceput;
PunctReferinta pctSfarsit;
public Partie(String dificultate, PunctReferinta pctInc, PunctReferinta pctSfarsit) {
	this.dificultate=dificultate;
	this.pctInceput=pctInc;
	this.pctSfarsit=pctSfarsit;
}

public void afisare() {
	System.out.println("Dificultate:"+dificultate);
	System.out.println("Coordonate Partie:");
	System.out.println("Punct Inceput:"+pctInceput);
	System.out.println("Punct Sfarsit:"+pctSfarsit);
	
	
}
}
