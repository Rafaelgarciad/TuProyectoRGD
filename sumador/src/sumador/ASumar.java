package sumador;

public class ASumar {
	
	public String sumativo(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else {
        	return "-1";
        }
        
	}
}
