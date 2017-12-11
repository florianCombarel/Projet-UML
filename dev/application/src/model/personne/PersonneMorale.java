package model.personne;

public class PersonneMorale extends Personne {
	
	private String formeJuridique;
	private String numSiren;

	public PersonneMorale(String name, String adress, String telephone, String mail, String formeJuridique, String numSiren) {
		super(name, adress, telephone, mail);
		// TODO Auto-generated constructor stub
		this.formeJuridique = formeJuridique;
		this.numSiren = numSiren;
	}

	public String getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getNumSiren() {
		return numSiren;
	}

	public void setNumSiren(String numSiren) {
		this.numSiren = numSiren;
	}

}
