package model.bien_immobilier;

import java.util.Date;

import model.personne.Personne;

public abstract class BienImmobilier {
	
	private String address;
	private String exposition;
	private double demandPrice;
	private Date dateSellingDemand;
	private Date dateDispo;
	
	public BienImmobilier(String address, String exposition, double demandPrice, Date dateSellingDemand, Date dateDispo) {
		this.address = address;
		this.exposition = exposition;
		this.demandPrice = demandPrice;
		this.dateSellingDemand = dateSellingDemand;
		this.dateDispo = dateDispo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
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
	

}
