package edu.elsmancs.domain.examen;
import org.junit.Test;
import static org.junit.Assert.*;

public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    
    public void addUfoTest() {
    	
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de crédito.
     * El crédito de la tarjeta varía.
     */
    @Test
    public void dispatchTest() {
    	UfosPark ufosPark = new UfosPark();
		for (String ovni : ovnis) {
			ufosPark.add(ovni);
        }
		CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
		ufosPark.dispatch(abradolph);
    	assertEquals(abradolph.credit(), 2500d, 0d);
    	String lista[] = {"dox", "trex"};
    	assertArrayEquals(ufosPark.getFlota().toArray(), lista);
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {
    	CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    	abradolph.setCredit(abradolph.credit());
    	UfosPark ufosPark = new UfosPark();
    	for (String ovni : ovnis) {
			ufosPark.add(ovni);
    	}
    	ufosPark.dispatch(abradolph);
    	assertArrayEquals(ufosPark.getFlota().toArray(), ovnis);
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    }
}