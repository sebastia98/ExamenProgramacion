package edu.elsmancs.domain.examen;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private Double credit = 3000d;
	private String symbol = "EZIS";
	
	
	public CreditCard(String nombreInvitado, String tarjetaCredito) {
		this.owner = nombreInvitado;
		this.number = tarjetaCredito;
	}
	
	/*Getters para los casos test*/
	public String getOwner() {
		return this.owner;
	}
	public String number() {
		return this.number;
	}

}
