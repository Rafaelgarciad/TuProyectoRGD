package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("5");
        assertEquals("5 = 5", resultado);
    }
	
	@Test
    public void testCifraNegativa() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("-5");
        assertEquals("Negativo. Siempre negativo", resultado);
    }
	
	@Test
    public void testDosCifras() {
        ASumar sumi = new ASumar();
        int resultado = sumi.total("13");
        assertEquals(4, resultado);
    }
}
