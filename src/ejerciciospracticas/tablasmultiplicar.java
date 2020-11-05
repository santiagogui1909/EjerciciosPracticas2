/**
 * Ejemplo comentario multiples
 * Este ejercicio imprime la tabla de multiplicar del número 2
 * la salida será:
 * 2+2=4
 * asi sucesivamente hasta llegar a 10 o el numero que se le indique
 */

package ejerciciospracticas;

public class tablasmultiplicar {

	public static void main(String[] args) {
		
		int resultado=0;
		int i;
		
		for(i=0;i<=10;i++) {
			resultado=2*i;  // el numero 2 en este caso es la tabla del 2 que es la que se indica
			
			System.out.println("2 * " +i+ "= " + resultado);
		}
		
	}

}
