package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("5");
        assertEquals("5 = 5",resultado );
    }

}
