package a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Raport {
	Turist t;
	Raport(){}
	
public void assignRaport(Turist t) {
this.t=t;	
salveazaIstoric();
}
void salveazaIstoric(){
	Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("C:/Users/Maryan/Desktop/TemaISP2/TemaISP2/src/Raport.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("Nume turist:"+t.Nume);
        logger.info("Prenume turist:"+t.Prenume);
        logger.info("Varsta turist:"+t.varsta);
        logger.info("CNP:"+t.CNP);
        if (t.haveInstructor){
        	logger.info("Instructor:"+t.Instructor);
        }
        if (t.haveAccess) {
        	logger.info("Access data:"+t.Access);
        }
        logger.info("Traseu turist:"+t.Traseu);
        logger.info("Transport:"+t.Transport);
        

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

}



}
