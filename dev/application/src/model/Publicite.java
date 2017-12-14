package model;

import java.util.HashSet;

public class Publicite {

	private HashSet<String> documents;
	
	public Publicite(){
		this.documents = new HashSet<>();
		
	}
	
	public void addDocument(String document){
		this.documents.add(document);
	}
	
	public void removeDocument(String document){
		this.documents.remove(documents);
	}
}
