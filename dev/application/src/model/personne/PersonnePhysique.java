package model.personne;

public class PersonnePhysique extends Personne {
	
	private String prenom;
	
	public PersonnePhysique(String name, String first_name,String adress, String telephone, String mail) {
		super(name, adress, telephone, mail);
		// TODO Auto-generated constructor stub
		this.prenom = first_name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String first_name) {
		this.prenom = first_name;
	}
	
	@Override
	public String toString(){
		return this.prenom+" "+super.getName();
	}
}
