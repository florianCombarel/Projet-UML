package model.personne;

import java.util.HashSet;

import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;

public abstract class Personne {
	
	private String nom;
	private String adresse;
	private String telephone;
	private String mail;
	private HashSet<Mandat> biensEnVente;
	private HashSet<PromesseVente> biensAchetes;
	private HashSet<RendezVous> biensVisites;
	private HashSet<Voeu> setVoeu;
	
	public Personne(String name, String address, String telephone, String mail) {
		this.nom = name;
		this.adresse = address;
		this.telephone = telephone;
		this.mail = mail;
		this.biensEnVente = new HashSet<>();
		this.biensVisites = new HashSet<>();
		this.biensAchetes = new HashSet<>();
		this.setVoeu = new HashSet<>();
	}

	public HashSet<Mandat> getbiensEnVente() {
		return biensEnVente;
	}

	public void setbiensEnVente(HashSet<Mandat> setMandat) {
		this.biensEnVente = setMandat;
	}

	public HashSet<RendezVous> getbiensVisites() {
		return biensVisites;
	}

	public void setbiensVisites(HashSet<RendezVous> setPromesseVente) {
		this.biensVisites = setPromesseVente;
	}

	public HashSet<PromesseVente> getbiensAchetes() {
		return biensAchetes;
	}

	public void setSetRendezVous(HashSet<PromesseVente> setRendezVous) {
		this.biensAchetes = setRendezVous;
	}

	public HashSet<Voeu> getSetVoeu() {
		return setVoeu;
	}

	public void setSetVoeu(HashSet<Voeu> setVoeu) {
		this.setVoeu = setVoeu;
	}

	public String getName() {
		return nom;
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

}
