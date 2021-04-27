package sumador;

public class ASumar {
	
	public String sumativo(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else if (numero.substring(0, 0) == "-"){
        	return "Negativo. Siempre negativo";
        }
        return "Negativo. Siempre negativo";
        
	}
}
