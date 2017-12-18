package model;

import java.util.Date;

import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;

public class PromesseVente {

	private double prixVerseVendeur;
	private String adresseNotaire;
	private Date dateVente;
	private double commissionAgence;
	private double fraisVente;
	private BienImmobilier bienAchete;
	private Personne acheteur;

	public PromesseVente(double prixVerseVendeur, String adresseNotaire, Date dateVente, double commissionAgence, double fraisVente, BienImmobilier bienAchete, Personne acheteur){
		if(dateVente.after(new Date())){
			this.prixVerseVendeur = Math.abs(prixVerseVendeur);
			this.adresseNotaire = adresseNotaire;
			this.dateVente = dateVente;
			this.commissionAgence = Math.abs(commissionAgence);
			this.fraisVente = Math.abs(fraisVente);
			this.bienAchete = bienAchete;
			this.acheteur = acheteur;
		}
	}
	
	public double getPrixVerseVendeur() {
		return prixVerseVendeur;
	}

	public void setPrixVerseVendeur(double prixVerseVendeur) {
		this.prixVerseVendeur = Math.abs(prixVerseVendeur);
	}

	public String getAdresseNotaire() {
		return adresseNotaire;
	}

	public void setAdresseNotaire(String adresseNotaire) {
		this.adresseNotaire = adresseNotaire;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		if(dateVente.after(new Date())){
			this.dateVente = dateVente;
		}
	}

	public double getCommissionAgence() {
		return commissionAgence;
	}

	public void setCommissionAgence(double commissionAgence) {
		this.commissionAgence = Math.abs(commissionAgence);
	}

	public double getFraisVente() {
		return fraisVente;
	}

	public void setFraisVente(double fraisVente) {
		this.fraisVente = Math.abs(fraisVente);
	}

	public BienImmobilier getBienAchete() {
		return bienAchete;
	}

	public void setBienAchete(BienImmobilier bienAchete) {
		this.bienAchete = bienAchete;
	}

	public Personne getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Personne acheteur) {
		this.acheteur = acheteur;
	}
}
