//Declara un String que contenga tu nombre, despu�s muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco �Fernando�, me aparezca �Bienvenido Fernando�.

package ejerciciospracticas;

import javax.swing.JOptionPane; //necesario siempre para que JOption o scanner funcione

public class bienvendio {

	public static void main(String[] args) {
				  
		  String name=JOptionPane.showInputDialog("Introduce tu nombre"); //con este codigo nos aparecera un ventana con la que podremos interactuar.
			  
			        System.out.println("bienvenido " + name);
		}
	}	  
		 
