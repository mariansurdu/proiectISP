package a;
import java.util.ArrayList;

public class PunctReferinta {
	double cx;
	double cy;
	double alt;

	public PunctReferinta(double x,double y,double z) {
		this.cx=x;
		this.cy=y;
		this.alt=z;
	}

	public void SetCoordonate(double x,double y,double z) {
		this.cx=x;
		this.cy=y;
		this.alt=z;
	}

	public PunctReferinta getCoord(PunctReferinta p) {
		return p;	
	}

	public Boolean estePePartie(Turist p,Partie x){
		if (p.locatie.cx>x.pctInceput.cx && p.locatie.cy>x.pctInceput.cy && p.locatie.cx<x.pctSfarsit.cx && p.locatie.cy<x.pctSfarsit.cy) {
			return true;
		}
		else {
			return false;
		}
	}
}