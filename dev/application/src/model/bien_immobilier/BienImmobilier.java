package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public abstract class BienImmobilier {
	
	private String adress;
	private String exposition;
	private double demandPrice;
	private Date dateSellingDemand;
	private Date dateDispo;
	private Personne seller;
	private Personne buyer;
	
	public BienImmobilier(String adress, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo, Personne seller) {
		this.adress = adress;
		this.exposition = exposition;
		this.demandPrice = demandPrice;
		this.dateSellingDemand = dateSellingDemand;
		this.dateDispo = dateDispo;
		this.seller = seller;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getExposition() {
		return exposition;
	}

	public void setExposition(String exposition) {
		this.exposition = exposition;
	}

	public double getDemandPrice() {
		return demandPrice;
	}

	public void setDemandPrice(double demandPrice) {
		this.demandPrice = demandPrice;
	}

	public Date getDateSellingDemand() {
		return dateSellingDemand;
	}

	public void setDateSellingDemand(Date dateSellingDemand) {
		this.dateSellingDemand = dateSellingDemand;
	}

	public Date getDateDispo() {
		return dateDispo;
	}

	public void setDateDispo(Date dateDispo) {
		this.dateDispo = dateDispo;
	}

	public Personne getSeller() {
		return seller;
	}

	public void setSeller(Personne seller) {
		this.seller = seller;
	}

	public Personne getBuyer() {
		return buyer;
	}

	public void setBuyer(Personne buyer) {
		this.buyer = buyer;
	}
	

}
