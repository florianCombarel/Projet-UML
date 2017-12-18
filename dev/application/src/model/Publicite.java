package model;

import java.util.HashSet;

import model.bien_immobilier.BienImmobilier;

public class Publicite {

	private HashSet<String> documents;
	private BienImmobilier bien;
	
	public Publicite(BienImmobilier bien){
		this.documents = new HashSet<>();
		this.bien = bien;
	}
	
	public void addDocument(String document){
		this.documents.add(document);
	}
	
	public void removeDocument(String document){
		this.documents.remove(documents);
	}
	
	public void setBien(BienImmobilier bien){
		this.bien = bien;
	}
	
	public BienImmobilier getBien(){
		return this.bien;
	}
}
