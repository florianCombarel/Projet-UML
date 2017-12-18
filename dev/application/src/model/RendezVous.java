package model;

import java.util.Date;

import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;

public class RendezVous {

	private Date dateVisite;
	private Personne visiteur;
	private BienImmobilier bienVisite;
	
	public RendezVous(Date dateVisite, Personne visiteur, BienImmobilier bienVisite){
		if(dateVisite.after(new Date())){
			this.dateVisite = dateVisite;
			this.visiteur = visiteur;
			this.bienVisite = bienVisite;
		}
	}
	
	public void setDateVisite(Date dateVisite){
		if(dateVisite.after(new Date())){
			this.dateVisite = dateVisite;
		}
	}
	
	public Date getDateVisite(Date dateVisite){
		return this.dateVisite = dateVisite;
	}
	
	public void setVisiteur(Personne visiteur){
		this.visiteur = visiteur;
	}
	
	public Personne getVisiteur(){
		return this.visiteur;
	}
	
	public void setBienVisite(BienImmobilier bienVisite){
		this.bienVisite = bienVisite;
	}
	
	public BienImmobilier getBienVisite(){
		return this.bienVisite;
	}
}
