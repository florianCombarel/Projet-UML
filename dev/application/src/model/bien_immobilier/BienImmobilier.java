package model.bien_immobilier;

import java.util.Date;
import java.util.HashSet;

import model.Mandat;
import model.PromesseVente;
import model.Publicite;
import model.RendezVous;
import model.personne.Personne;

public abstract class BienImmobilier {
	
	private String adresse;
	private String orientation;
	private double prixDemande;
	private Date dateVenteVoulue;
	private Date dateDispo;
	private Mandat mandat;
	private PromesseVente promesseVente;
	private HashSet<RendezVous> rendezVous;
	private HashSet<Publicite> publicites;
	
	public BienImmobilier(String address, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo, Mandat mandat, PromesseVente promesseVente) {
		this.adresse = address;
		this.orientation = exposition;
		this.prixDemande = demandPrice;
		this.dateVenteVoulue = dateSellingDemand;
		this.dateDispo = dateDispo;
		this.mandat = mandat;
		this.promesseVente = promesseVente;
		this.rendezVous = new HashSet<>();
		this.publicites = new HashSet<>();
	}
	
	public void addRendezVous(RendezVous rdv){
		this.rendezVous.add(rdv);
	}
	
	public void removeRendezVous(RendezVous rdv){
		this.rendezVous.remove(rdv);
	}
	
	public void addPublicite(Publicite pub){
		this.publicites.add(pub);
	}
	
	public void removePublicite(Publicite pub){
		this.publicites.remove(pub);
	}

	public Mandat getMandat() {
		return mandat;
	}

	public void setMandat(Mandat mandat) {
		this.mandat = mandat;
	}

	public PromesseVente getPromesseVente() {
		return promesseVente;
	}

	public void setPromesseVente(PromesseVente promesseVente) {
		this.promesseVente = promesseVente;
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
