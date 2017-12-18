package model.bien_immobilier;

import java.util.Date;

import model.Mandat;
import model.personne.Personne;

public class Maison extends BienImmobilier {
	
	private double surfaceHabitable;
	private int nbPiece;
	private int nbEtage;
	private String systemeChauffage;

	public Maison(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo, Mandat mandat, double livingSurface, int nbRoom, int nbFloor, String heatingSystem) {
		super(adress, exposition, demandPrice, dateSellingDemand, dateDispo, mandat);
		// TODO Auto-generated constructor stub
		this.surfaceHabitable = livingSurface;
		this.nbPiece = nbRoom;
		this.nbEtage = nbFloor;
		this.systemeChauffage = heatingSystem;
	}

	public double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public String getSystemeChauffage() {
		return systemeChauffage;
	}

	public void setSystemeChauffage(String systemeChauffage) {
		this.systemeChauffage = systemeChauffage;
	}
}
