package controller;

import model.Agence;
import model.personne.Personne;
import model.personne.PersonnePhysique;

public class AgenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agence agence = new Agence("Timmo");
		
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "1477 Route de la Côte-Rouge 31 330 Merville", "07 81 28 56 14", "jozan172@gmail.com");
		Personne p2 = new PersonnePhysique("Combarel", "Florian", "", "", "");
		agence.addClients(p1);
		agence.addClients(p2);
		System.out.println(agence.getPersonne("Lejeune"));
		System.out.println(agence.getPersonne("Combarel"));
		agence.removeClients(p1);
		System.out.println(agence.getPersonne("Lejeune"));
		
	}

}
