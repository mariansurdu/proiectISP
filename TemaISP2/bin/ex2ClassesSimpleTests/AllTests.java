package ex2ClassesSimpleTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAccess.class, testEvidenta.class, testFactura.class, testInstructor.class, testPartie.class,
		testPersoana.class, testPunctReferinta.class, testRelatieAsociatieTuristTraseuSM.class, testStatiune.class,
		testTransport.class, testTraseu.class, testTurist.class })
public class AllTests {

}
