package ejerciciospracticas;

import javax.swing.JOptionPane;

public class bienvenido {
	
	 public static void main (String [] args) {
	
	String nombre;	                                                         //Presenta por pantalla una caja de diálogo para que se capture
	nombre=JOptionPane.showInputDialog(null, "por favor ingrese su nombre","Bienvenida");
	JOptionPane.showMessageDialog(null, "Bienvenido a JAVA " + nombre);
	
	}

}
