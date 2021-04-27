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

	public int total(String valor_inicial) {
        int suma = 0;

        int digito1 = Integer.parseInt(valor_inicial.substring(0, 1));
        int digito2 = Integer.parseInt(valor_inicial.substring(1));
        
        suma = digito1+digito2;
        
        return suma;

    }
}
