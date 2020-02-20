package edu.elsmancs.domain.examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
	
	private ArrayList<String> flota = new ArrayList<String>();
	private final Integer fee = 500;
	private Map<String, String> flotaReservas = new HashMap<>();
	
	public UfosPark() {
		
	}

	public void add(String ovni) {
		this.flota.add(ovni);
		
	}
	public ArrayList<String> getFlota() {
		return this.flota;
	}

	public void dispatch(CreditCard personaje) {
		
		if (personaje.credit() > fee || this.flotaReservas.containsValue(personaje.number())){
			personaje.setCredit(fee);
			this.flotaReservas.putIfAbsent(personaje.number(), this.flota.remove(0));
		}
	}
	/*Metodo ufosOF*/

	public String getUfoOf(String number) {
		return this.flotaReservas.get(number);
	}
	
	

}
