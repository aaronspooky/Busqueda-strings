package paquete;

public class Busqueda {

	public static void main(String[] args) {
		
		//Metodo indexOf()
		String pat = "Java, lenguaje de alto nivel";
		int k;
		k = pat.indexOf((int)'v'); //Encontrado en ubicacion 2
		
		//Metodo lastIndexOf()
		String cd = "----x----";
		int j;
		j = cd.lastIndexOf((int) 'x',6); // devuelve -1 porque busca desde la posicion 6
	}

}
