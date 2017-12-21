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
	
	public void addClients(Personne p) {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		boolean trouve = false;
		for(HashMap.Entry<Integer, Personne> entry : this.clients.entrySet()) {
			if(randomNumber == entry.getKey()) {
				trouve = true;
			}
		}
		if(trouve) {
			addClients(p);
		} else {
			this.clients.put(randomNumber, p);
		}
	}
	
	public void addBiens(BienImmobilier b) {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		boolean trouve = false;
		for(HashMap.Entry<Integer, BienImmobilier> entry : this.biens.entrySet()) {
			if(randomNumber == entry.getKey()) {
				trouve = true;
			}
		}
		if(trouve) {
			addBiens(b);
		} else {
			this.biens.put(randomNumber, b);
		}
	}
	
	public void removeClients(int codeClient) {
		this.clients.remove(codeClient);
	}
	
	public void removeBiens(int codeBien) {
		this.biens.remove(codeBien);
	}
	
	public Personne getPersonne(int codeClient) {
		return this.clients.get(codeClient);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<Integer, Personne> getClients() {
		return clients;
	}

	public void setClients(HashMap<Integer, Personne> clients) {
		this.clients = clients;
	}

	public HashMap<Integer, BienImmobilier> getBiens() {
		return biens;
	}

	public void setBiens(HashMap<Integer, BienImmobilier> biens) {
		this.biens = biens;
	}
	

}
