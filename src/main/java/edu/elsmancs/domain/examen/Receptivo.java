package edu.elsmancs.domain.examen;

public class Receptivo {
	
	private CrystalExpender packExpender = null; 
	private UfosPark nave = null; 
	
	public Receptivo() {
		
	}
	
	public void registra(CrystalExpender packExpender) {
		this.packExpender = packExpender;
	}
	public void registra(UfosPark nave) {
		this.nave = nave;
	}

	public void dispatch(CreditCard personaje) {
		this.packExpender.dispatch(personaje);
		this.nave.dispatch(personaje);
	}
	


}
