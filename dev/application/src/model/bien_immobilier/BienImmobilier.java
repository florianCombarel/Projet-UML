package model.bien_immobilier;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

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
	private HashMap<Integer, RendezVous> rendezVous;
	private HashMap<Integer, Publicite> publicites;
	
	public BienImmobilier(String address, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo) {
		this.adresse = address;
		this.orientation = exposition;
		this.prixDemande = demandPrice;
		this.dateVenteVoulue = dateSellingDemand;
		this.dateDispo = dateDispo;
		this.rendezVous = new HashMap<>();
		this.publicites = new HashMap<>();
	}
	
	public void addRendezVous(RendezVous rdv){
		this.rendezVous.put(randomNumber(),rdv);
	}
	
	public void removeRendezVous(int codeRDV){
		this.rendezVous.remove(codeRDV);
	}
	
	public RendezVous getRendezVous(int codeRDV) {
		return this.rendezVous.get(codeRDV);
	}
	
	public void addPublicite(Publicite pub){
		this.publicites.put(randomNumber(), pub);
	}
	
	public void removePublicite(int codePub){
		this.publicites.remove(codePub);
	}
	
	public Publicite getPublicite(int codePub) {
		return this.publicites.get(codePub);
	}
	
	private Integer randomNumber() {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
		return randomNumber;
	}
	
	

	public HashMap<Integer, RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(HashMap<Integer, RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	public HashMap<Integer, Publicite> getPublicites() {
		return publicites;
	}

	public void setPublicites(HashMap<Integer, Publicite> publicites) {
		this.publicites = publicites;
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

	@Override
	public String toString() {
		return this.adresse;
	}
	
	
	

}
