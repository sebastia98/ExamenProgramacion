package edu.elsmancs.domain.examen;

import java.util.ArrayList;

public class UfosPark {
	
	private ArrayList<String> flota = new ArrayList<String>();
	private final Double fee = 500d;
	
	public UfosPark() {
		
	}

	public void add(String ovni) {
		this.flota.add(ovni);
		
	}
	public ArrayList<String> getFlota() {
		return this.flota;
	}

	public void dispatch(CreditCard personaje) {
		
		if (personaje.credit() > fee) {
			personaje.setCredit(fee);
			flota.remove(0);
		}
		
		
		
	}
	
	

}
