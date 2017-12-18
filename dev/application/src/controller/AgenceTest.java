package controller;

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
		
		/*Agence agence = new Agence("Timmo");
		
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "1477 Route de la Côte-Rouge 31 330 Merville", "07 81 28 56 14", "jozan172@gmail.com");
		Personne p2 = new PersonnePhysique("Combarel", "Florian", "", "", "");
		agence.addClients(p1);
		agence.addClients(p2);
		System.out.println(agence.getPersonne("Lejeune"));
		System.out.println(agence.getPersonne("Combarel"));
		agence.removeClients(p1);
		System.out.println(agence.getPersonne("Lejeune"));
		
		BienImmobilier b1 = new Appartement("Toulouse", "Nord",10000.0, new Date(2018,11,18), new Date(2018,11,18), 3,8,500.2);
		Mandat m1 = new Mandat(b1,p2,new Date(2018,11,18));
		p2.addMandat(m1);
		Mandat m2 = p2.getMandat(b1);
		System.out.println(m2.getVendeur().getName());*/
		
		Application appli = new Application();
		
	}

}
