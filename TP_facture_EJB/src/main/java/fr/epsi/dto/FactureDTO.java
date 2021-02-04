package fr.epsi.dto;

public class FactureDTO {
	
	private String numeroFacture;
	
	private String dateFacture;
	
	private String prixtotalFacture;

	
	public String getNumeroFacture() {
		return numeroFacture;
	}

	public String getPrixtotalFacture() {
		return prixtotalFacture;
	}

	public void setPrixtotalFacture(String prixtotalFacture) {
		this.prixtotalFacture = prixtotalFacture;
	}

	public void setNumeroFacture(String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}
	
	public String getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(String dateFacture) {
		this.dateFacture = dateFacture;
	}
	
	

}
