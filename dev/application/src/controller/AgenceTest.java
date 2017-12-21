package controller;

import java.util.Date;

import model.Agence;
import model.Mandat;
import model.bien_immobilier.Appartement;
import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;
import model.personne.PersonnePhysique;
import view.Application;

public class AgenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agence agence = new Agence("Timmo");
		
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "1477 Route de la Côte-Rouge 31 330 Merville", "07 81 28 56 14", "jozan172@gmail.com");
		Personne p2 = new PersonnePhysique("Combarel", "Florian", "", "", "");
		agence.addClients(p1);
		agence.addClients(p2);
		
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Mandat m = new Mandat(b1,p1, new Date());
		p1.addMandat(m);
		
		//System.out.println(p1.getMandat(b1));
		p1.touMandat(b1);
		
		
		
	}

}
