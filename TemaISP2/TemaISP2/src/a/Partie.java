package a;

public class Partie {
String dificultate;
PunctReferinta pctInceput;
PunctReferinta pctSfarsit;
public Partie(String dificultate2, PunctReferinta pctInc, PunctReferinta pctSfarsit2) {
	this.dificultate=dificultate2;
	this.pctInceput=pctInc;
	this.pctSfarsit=pctSfarsit2;
}

public void afisare() {
	System.out.println("Dificultate:"+dificultate);
	System.out.println("Coordonate Partie:");
	System.out.println("Punct Inceput:"+pctInceput);
	System.out.println("Punct Sfarsit:"+pctSfarsit);
	
	
}
}
