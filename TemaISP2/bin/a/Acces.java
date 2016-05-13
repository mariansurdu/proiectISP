/*
Marian: Turist, Transport, Persoana, Traseu
Andrei: PunctReferinta, Partie, Factura, Access
Nadina: Statiune, Raport, Instructor, EvidentaTuristi

Sistem de calcul al nr de Km parcursi la ski, pe baza unei harti 
configurabile a statiunii, in care apar instalatii de cablu si Km 
parcursi intre acestea. Sistemul permite generarea de rapoarte.

 Asociatie: obiectul e creat in exteriorul clasei, gen Client - Comanda
 Agregare: has a, tip Sistem - Componenta
 Compozitie : obiectul e creat in interiorul clasei (Traseu - Partie)
*/

package a;

public class Acces {
	String codCartela;
	int pret;
	String codTurist;

	public  Acces(String a,int b,String c) {
		this.codCartela=a;
		this.pret=b;
		this.codTurist=c;
	}

	public void setAcces(Turist p) {
		if (codCartela!=null){
			p.haveAccess=true;			
		}
		else {
			p.haveAccess=false;
		}
	}
	
	public String getCodCartela() {
		return codCartela;
	}

	public void deleteAccess(Turist p) {
		p.haveAccess=false;
	}
	public void afisare() {
		System.out.println("codCartela:"+codCartela);
		System.out.println("Pret:"+pret);
		System.out.println("codTurist:"+codTurist);	
	}
}	
