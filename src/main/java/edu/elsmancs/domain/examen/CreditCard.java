package edu.elsmancs.domain.examen;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private Integer credit = 3000;
	private final String symbol = "EZIS";
	
	public CreditCard(String nombreInvitado, String tarjetaCredito) {
		this.owner = nombreInvitado;
		this.number = tarjetaCredito;
	}
	
	public String toString() {
		return "Owner: " + this.owner +
				"\nnumber: " + this.number + 
				"\ncredit: " + this.credit + " " + this.symbol;
	}
	
	/*Getters para los casos test*/
	public String getOwner() {
		return this.owner;
	}
	public String number() {
		return this.number;
	}
	
	public Integer credit() {
		return credit;
	}
	
	public void setCredit(Integer dinero) {
		this.credit = this.credit - dinero;
	}
	public void pay(int dinero) {
		this.credit = this.credit() - dinero;
		
	}

}
