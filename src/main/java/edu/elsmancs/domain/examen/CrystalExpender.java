package edu.elsmancs.domain.examen;

public class CrystalExpender {
	
	private int unidadesTotales = 0;
	private int costeUnidad = 0;
	
	public CrystalExpender(int unidades, int coste) {
		this.unidadesTotales = unidades;
		this.costeUnidad = coste;
	}

	public void dispatch(CreditCard abradolph) {
		if (abradolph.credit() > this.costeUnidad) {
			this.unidadesTotales = this.unidadesTotales - 1;
			abradolph.setCredit(this.costeUnidad);
		}
		
	}

}
