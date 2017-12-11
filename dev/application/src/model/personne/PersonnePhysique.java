package model.personne;

public class PersonnePhysique extends Personne {
	
	private String first_name;
	
	public PersonnePhysique(String name, String first_name,String adress, String telephone, String mail) {
		super(name, adress, telephone, mail);
		// TODO Auto-generated constructor stub
		this.first_name = first_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
}
