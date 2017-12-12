package co.simplon.maison.resa;

import java.util.ArrayList;

public class ListeResa {
	
	private final static ListeResa INSTANCE = new ListeResa();
	private final ArrayList<MaisonResa> liste = new ArrayList<>();
	
	private ListeResa(){
		
	}

	public static ListeResa getInstance() {
		return INSTANCE;
	}

	public ArrayList<MaisonResa> getListe() {
		return liste;
	}
	

}
