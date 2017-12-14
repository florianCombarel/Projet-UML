package model;

import java.util.HashMap;
import java.util.Random;

import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;

public class Agence {
	
	private String nom;
	private HashMap<Integer, Personne> clients;
	private HashMap<Integer, BienImmobilier> biens;
	
	public Agence(String nom) {
		this.nom = nom;
		this.clients = new HashMap<>();
		this.biens = new HashMap<>();
	}
	
	public Agence(String name, HashMap<Integer, Personne> mapPersonne, HashMap<Integer, BienImmobilier> mapBienImmo) {
		this.nom = name;
		this.clients = mapPersonne;
		this.biens = mapBienImmo;
	}
	
	public void addMapPersonne(Personne p) {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		boolean trouve = false;
		for(HashMap.Entry<Integer, Personne> entry : this.clients.entrySet()) {
			if(randomNumber == entry.getKey()) {
				trouve = true;
			}
		}
		if(trouve) {
			addMapPersonne(p);
		} else {
			this.clients.put(randomNumber, p);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
