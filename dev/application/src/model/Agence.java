package model;

import java.util.HashMap;
import java.util.Random;

import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;

public class Agence {
	
	private String name;
	private HashMap<Integer, Personne> mapPersonne;
	private HashMap<Integer, BienImmobilier> mapBienImmo;
	
	public Agence(String name) {
		this.name = name;
		this.mapPersonne = new HashMap<>();
		this.mapBienImmo = new HashMap<>();
	}
	
	public Agence(String name, HashMap<Integer, Personne> mapPersonne, HashMap<Integer, BienImmobilier> mapBienImmo) {
		this.name = name;
		this.mapPersonne = mapPersonne;
		this.mapBienImmo = mapBienImmo;
	}
	
	public void addMapPersonne(Personne p) {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		boolean trouve = false;
		for(HashMap.Entry<Integer, Personne> entry : this.mapPersonne.entrySet()) {
			if(randomNumber == entry.getKey()) {
				trouve = true;
			}
		}
		if(trouve) {
			addMapPersonne(p);
		} else {
			this.mapPersonne.put(randomNumber, p);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<Integer, Personne> getMapPersonne() {
		return mapPersonne;
	}

	public void setMapPersonne(HashMap<Integer, Personne> mapPersonne) {
		this.mapPersonne = mapPersonne;
	}

	public HashMap<Integer, BienImmobilier> getMapBienImmo() {
		return mapBienImmo;
	}

	public void setMapBienImmo(HashMap<Integer, BienImmobilier> mapBienImmo) {
		this.mapBienImmo = mapBienImmo;
	}

}
