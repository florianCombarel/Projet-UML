package model.personne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;
import model.bien_immobilier.BienImmobilier;

public abstract class Personne {
	
	private String nom;
	private String adresse;
	private String telephone;
	private String mail;
	private HashMap<Integer,Mandat> biensEnVente;
	private HashMap<Integer, PromesseVente> biensAchetes;
	private HashMap<Integer, RendezVous> biensVisites;
	private HashMap<Integer, Voeu> setVoeu;
	
	public Personne(String name, String address, String telephone, String mail) {
		this.nom = name;
		this.adresse = address;
		this.telephone = telephone;
		this.mail = mail;
		this.biensEnVente = new HashMap<>();
		this.biensVisites = new HashMap<>();
		this.biensAchetes = new HashMap<>();
		this.setVoeu = new HashMap<>();
	}
	
	public void addMandat(Mandat m) {
		this.biensEnVente.put(randomNumber(), m);
	}
	
	public void addPromesseVente(PromesseVente pv) {
		this.biensAchetes.put(randomNumber(), pv);
	}
	
	public void addRendezVous(RendezVous rv) {
		this.biensVisites.put(randomNumber(), rv);
	}
	
	public void addVoeu(Voeu v) {
		this.setVoeu.put(randomNumber(), v);
	}
	
	public void removeMandat(int codeMandat) {
		this.biensEnVente.remove(codeMandat);
	}
	
	public void removePromesseVente(int codePromesseVente) {
		this.biensAchetes.remove(codePromesseVente);
	}
	
	public void removeRendezVous(int codeRDV) {
		this.biensVisites.remove(codeRDV);
	}
	
	public void removeVoeu(int codeVoeu) {
		this.setVoeu.remove(codeVoeu);
	}
	
	public Mandat getMandat(int codeMandat) {
		return this.biensEnVente.get(codeMandat);
	}
	
	public PromesseVente getPromesseVente(int codePromesseVente) {
		return this.biensAchetes.get(codePromesseVente);
	}
	
	public RendezVous getRendezVous(int codeRDV) {
		return this.biensVisites.get(codeRDV);
	}
	
	public Voeu getVoeu(int codeVoeu) {
		return this.setVoeu.get(codeVoeu);
	}
	
	private Integer randomNumber() {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		return randomNumber;
	}
	
	/*Getters and Setters*/

	public String getName() {
		return nom;
	}

	public HashMap<Integer, Mandat> getBiensEnVente() {
		return biensEnVente;
	}

	public void setBiensEnVente(HashMap<Integer, Mandat> biensEnVente) {
		this.biensEnVente = biensEnVente;
	}

	public HashMap<Integer, PromesseVente> getBiensAchetes() {
		return biensAchetes;
	}

	public void setBiensAchetes(HashMap<Integer, PromesseVente> biensAchetes) {
		this.biensAchetes = biensAchetes;
	}

	public HashMap<Integer, RendezVous> getBiensVisites() {
		return biensVisites;
	}

	public void setBiensVisites(HashMap<Integer, RendezVous> biensVisites) {
		this.biensVisites = biensVisites;
	}

	public HashMap<Integer, Voeu> getSetVoeu() {
		return setVoeu;
	}

	public void setSetVoeu(HashMap<Integer, Voeu> setVoeu) {
		this.setVoeu = setVoeu;
	}

	public void setName(String name) {
		this.nom = name;
	}

	public String getAddress() {
		return adresse;
	}

	public void setAddress(String adress) {
		this.adresse = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return this.nom;
	}
	
	
	

}
