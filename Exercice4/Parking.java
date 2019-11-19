package Exercice4;

import java.util.ArrayList;

public class Parking  {

	ArrayList<Voiture> v = new ArrayList<Voiture>();
	public Parking() {
		
	}
	public boolean enter() {
		if(v.size()<=6) return true;
		else return false;
	}
	
	public void quitter(Voiture k)
	{
		v.remove(k);
	}
	
	
}
