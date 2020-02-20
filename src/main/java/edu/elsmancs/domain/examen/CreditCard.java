package edu.elsmancs.domain.examen;

public class CreditCard {
	
	private String nombre = null;
	private String numeroTarjeta = null;

	public CreditCard(String nombreInvitado, String tarjetaCredito) {
		this.nombre = nombreInvitado;
		this.numeroTarjeta = tarjetaCredito;
	}
	
	/*Getters para los casos test*/
	public String getNombre() {
		return this.nombre;
	}
	public String getNumero() {
		return this.numeroTarjeta;
	}

}
