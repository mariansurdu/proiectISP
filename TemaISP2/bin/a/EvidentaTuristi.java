package a;
import java.util.ArrayList;

public class EvidentaTuristi {
ArrayList<Turist> TuristiActivi;
ArrayList<Turist> TuristiInactivi;

public void addTurist(Turist p) {
	if (p.isActive) {
		TuristiActivi.add(p);
	}
	else {
		TuristiInactivi.add(p);
	}
}


public void deleteTurist(Turist p) {
	if (p.isActive) {
		TuristiActivi.remove(p);
	}
	else {
		TuristiInactivi.remove(p);
	}
}
}
