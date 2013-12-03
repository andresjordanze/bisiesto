package Bisiesto;
import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Before;
import org.junit.Test;
public class BisiestoTest {
	private Bisiesto bs;
	
	@Before
    public void setup() {
        bs = new Bisiesto();
    }

	@Test
    public void imprimirNumero(){
   		assertEquals("6", bs.imprimir(6));
    }

    @Test
    public void esBisiesto() {
        assertEquals(true,bs.esBisiesto(4));//es bisiesto
        assertEquals(false,bs.esBisiesto(100));//no es bisiesto
    }
}