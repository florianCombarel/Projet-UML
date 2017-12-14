package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public abstract class BienImmobilier {
	
	private String adresse;
	private String orientation;
	private double prixDemande;
	private Date dateVenteVoulue;
	private Date dateDispo;
	
	public BienImmobilier(String address, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo) {
		this.adresse = address;
		this.orientation = exposition;
		this.prixDemande = demandPrice;
		this.dateVenteVoulue = dateSellingDemand;
		this.dateDispo = dateDispo;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public double getPrixDemande() {
		return prixDemande;
	}

	public void setPrixDemande(double prixDemande) {
		this.prixDemande = prixDemande;
	}

	public Date getDateVenteVoulue() {
		return dateVenteVoulue;
	}

	public void setDateVenteVoulue(Date dateVenteVoulue) {
		this.dateVenteVoulue = dateVenteVoulue;
	}

	public Date getDateDispo() {
		return dateDispo;
	}

	public void setDateDispo(Date dateDispo) {
		this.dateDispo = dateDispo;
	}
	

}
