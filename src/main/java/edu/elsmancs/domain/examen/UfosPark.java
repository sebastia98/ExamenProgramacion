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
		
		if (this.flotaReservas.containsKey(personaje.number())){
			
		}else {
			if (personaje.credit() > fee){
				personaje.setCredit(fee);
				String idReservada = this.flota.remove(0);
				this.flotaReservas.putIfAbsent(idReservada, personaje.number());
			}
			
		}
		
	}
	/*Metodo ufosOF*/

	public String getUfoOf(String number) {
		return this.flotaReservas.get(number);
	}
	
	

}
