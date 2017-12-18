package model;

import java.util.Date;

import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;

public class Mandat {
	
	private BienImmobilier bienEnVente;
	private Personne vendeur;
	private Date date;
	
	public Mandat(BienImmobilier bienEnVente, Personne vendeur, Date date) {
		if(date.after(new Date())){
			this.bienEnVente = bienEnVente;
			this.vendeur = vendeur;
			this.date = date;
		}
	}

	public BienImmobilier getBienEnVente() {
		return bienEnVente;
	}

	public void setBienEnVente(BienImmobilier bienEnVente) {
		this.bienEnVente = bienEnVente;
	}

	public Personne getVendeur() {
		return vendeur;
	}

	public void setVendeur(Personne vendeur) {
		this.vendeur = vendeur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		if(date.after(new Date())){
			this.date = date;
		}
	}

}
