package a;

public class Persoana {
String Nume;
String Prenume;
String CNP;
 int varsta;

public Persoana(String string, String string2, String string3, int i) {
	this.Nume=string;
	this.Prenume=string2;
	this.CNP=string3;
	this.varsta=i;
}

public int getVarsta() {
	int v=varsta;
	return v;
}

public void afisareP() {
System.out.println("Nume:"+Nume);
System.out.println("Prenume:"+Prenume);
System.out.println("CNP:"+CNP);
System.out.println("Varsta:"+varsta);
}
}

