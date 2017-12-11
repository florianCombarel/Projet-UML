package model.personne;

public abstract class Personne {
	
	private String name;
	private String adress;
	private String telephone;
	private String mail;
	
	public Personne(String name, String adress, String telephone, String mail) {
		this.name = name;
		this.adress = adress;
		this.telephone = telephone;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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
