package model.personne;

import java.util.HashSet;

import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;
import model.bien_immobilier.BienImmobilier;

public abstract class Personne {
	
	private String nom;
	private String adresse;
	private String telephone;
	private String mail;
	private HashSet<Mandat> biensEnVente;
	private HashSet<PromesseVente> biensAchetes;
	private HashSet<RendezVous> biensVisites;
	private HashSet<Voeu> setVoeu;
	
	public Personne(String name, String address, String telephone, String mail) {
		this.nom = name;
		this.adresse = address;
		this.telephone = telephone;
		this.mail = mail;
		this.biensEnVente = new HashSet<>();
		this.biensVisites = new HashSet<>();
		this.biensAchetes = new HashSet<>();
		this.setVoeu = new HashSet<>();
	}
	
	public void addMandat(Mandat m) {
		this.biensEnVente.add(m);
	}
	
	public void addPromesseVente(PromesseVente pv) {
		this.biensAchetes.add(pv);
	}
	
	public void addRendezVous(RendezVous rv) {
		this.biensVisites.add(rv);
	}
	
	public void addVoeu(Voeu v) {
		this.setVoeu.add(v);
	}
	
	public void removeMandat(Mandat m) {
		this.biensEnVente.remove(m);
	}
	
	public void removePromesseVente(PromesseVente pv) {
		this.biensAchetes.remove(pv);
	}
	
	public void removeRendezVous(RendezVous rv) {
		this.biensVisites.remove(rv);
	}
	
	public void removeVoeu(Voeu v) {
		this.setVoeu.remove(v);
	}
	
	public Mandat getMandat(BienImmobilier b) {
		Mandat m = null;
		for(Mandat mandat : this.biensEnVente) {
			if(mandat.getBienEnVente() == b) {
				m = mandat;
			}
		}
		return m;
	}
	
	public void touMandat(BienImmobilier b) {
		Mandat m = null;
		for(Mandat mandat : this.biensEnVente) {
			if(mandat.getBienEnVente() == b) {
				System.out.println(mandat+" coucou");
			}
		}
	}
	
	public PromesseVente getPromesseVente(BienImmobilier b) {
		PromesseVente pv = null;
		for(PromesseVente promessevente : this.biensAchetes) {
			if(promessevente.getBienAchete().equals(b)) {
				pv = promessevente;
			}
		}
		return pv;
	}
	
	public RendezVous getRendezVous(BienImmobilier b) {
		RendezVous pv = null;
		for(RendezVous rdv : this.biensVisites) {
			if(rdv.getBienVisite().equals(b)) {
				pv = rdv;
			}
		}
		return pv;
	}
	
	/*Getters and Setters*/

	public HashSet<Mandat> getbiensEnVente() {
		return biensEnVente;
	}

	public void setbiensEnVente(HashSet<Mandat> setMandat) {
		this.biensEnVente = setMandat;
	}

	public HashSet<RendezVous> getbiensVisites() {
		return biensVisites;
	}

	public void setbiensVisites(HashSet<RendezVous> setPromesseVente) {
		this.biensVisites = setPromesseVente;
	}

	public HashSet<PromesseVente> getbiensAchetes() {
		return biensAchetes;
	}

	public void setSetRendezVous(HashSet<PromesseVente> setRendezVous) {
		this.biensAchetes = setRendezVous;
	}

	public HashSet<Voeu> getSetVoeu() {
		return setVoeu;
	}

	public void setSetVoeu(HashSet<Voeu> setVoeu) {
		this.setVoeu = setVoeu;
	}

	public String getName() {
		return nom;
	}

	public void setName(String name) {
		this.nom = name;
	}

	public String getAddress() {
		return adresse;
	}

	public void setAddress(String adress) {
		this.adresse = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
