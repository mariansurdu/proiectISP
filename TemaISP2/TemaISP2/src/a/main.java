package a;

public class main {

	public static void main(String[] args) {
	Persoana persoana=new Persoana("Andrei","Marian","134212212",21);
	//PunctReferinta punct=new Punct(44,26,8);
	String codTurist="1234567";
	Boolean haveInstructor=true;
	Boolean haveAccess=true;
	Boolean facturaPlatita=true;
	Transport t=new Transport("masina");
	Turist tt=new Turist("Andrei","Marian","134212212",21,true,"123dsd",true,true);
	Instructor p=new Instructor("Andrssssei","Marisssssan","134212212",21,"asdaw221",123);
	tt.assignInstructor(p);
	tt.assignTransport(t);
	Acces a=new Acces("1221d",12,"sadasd2");
	tt.addAccess(a);
	Raport raport=new Raport();
	raport.assignRaport(tt);
	
	tt.afisareTurist();
	
	
	
	}
}
	
	
	
