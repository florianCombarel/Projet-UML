package model.personne;

import java.util.HashSet;

import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;

public abstract class Personne {
	
	private String name;
	private String address;
	private String telephone;
	private String mail;
	private HashSet<Mandat> setMandat;
	private HashSet<PromesseVente> setPromesseVente;
	private HashSet<RendezVous> setRendezVous;
	private HashSet<Voeu> setVoeu;
	
	public Personne(String name, String address, String telephone, String mail) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.mail = mail;
		this.setMandat = new HashSet<>();
		this.setPromesseVente = new HashSet<>();
		this.setRendezVous = new HashSet<>();
		this.setVoeu = new HashSet<>();
	}

	public HashSet<Mandat> getSetMandat() {
		return setMandat;
	}

	public void setSetMandat(HashSet<Mandat> setMandat) {
		this.setMandat = setMandat;
	}

	public HashSet<PromesseVente> getSetPromesseVente() {
		return setPromesseVente;
	}

	public void setSetPromesseVente(HashSet<PromesseVente> setPromesseVente) {
		this.setPromesseVente = setPromesseVente;
	}

	public HashSet<RendezVous> getSetRendezVous() {
		return setRendezVous;
	}

	public void setSetRendezVous(HashSet<RendezVous> setRendezVous) {
		this.setRendezVous = setRendezVous;
	}

	public HashSet<Voeu> getSetVoeu() {
		return setVoeu;
	}

	public void setSetVoeu(HashSet<Voeu> setVoeu) {
		this.setVoeu = setVoeu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
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
