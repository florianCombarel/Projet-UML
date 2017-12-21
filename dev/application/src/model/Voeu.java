package model;

import model.personne.Personne;

public class Voeu {
	
	private String typeBien;
	private double prixSouhaite;
	private String localisation;
	private double surfaceAuSol;
	private int nbPiece;
	private Personne client;
	
	public Voeu(String typeBien, double prixSouhaite, String localisation, double surfaceAuSol, int nbPiece, Personne client){
		this.typeBien = typeBien;
		switch(typeBien){
		case "terrain":
			this.prixSouhaite = Math.abs(prixSouhaite);
			this.localisation = localisation;
			this.surfaceAuSol = Math.abs(surfaceAuSol);
			break;
		case "maison":
			this.prixSouhaite = Math.abs(prixSouhaite);
			this.localisation = localisation;
			this.surfaceAuSol = Math.abs(surfaceAuSol);
			this.nbPiece = nbPiece;
			break;
		case "appartement":
			this.nbPiece = nbPiece;
			break;
		}
		this.client = client;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public double getPrixSouhaite() {
		return prixSouhaite;
	}

	public void setPrixSouhaite(double prixSouhaite) {
		this.prixSouhaite = prixSouhaite;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public double getSurfaceAuSol() {
		return surfaceAuSol;
	}

	public void setSurfaceAuSol(double surfaceAuSol) {
		this.surfaceAuSol = surfaceAuSol;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}
	
	public void setClient(Personne client){
		this.client = client;
	}
	
	public Personne getClient(){
		return this.client;
	}
	
	@Override
	public String toString(){
		return this.typeBien;
	}
}
