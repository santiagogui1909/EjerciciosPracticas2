package ejerciciospracticas;

import javax.swing.JOptionPane;

public class definitivanota {
	
	 public static void main (String [] args) {
	
	 double nota1, nota2, notaPromedio;
	 
	 nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la primera nota del estufiante"));
	 nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la segunda nota del estufiante"));
	                                       
	      notaPromedio = (nota1+nota2)/2;         //Poceso matem�tico para realizar el c�lculo de la definitiva
	 
	                                              //Presentaci�n por pantalla del resultado de la operaci�n
	JOptionPane.showInputDialog(null,"La nota promedio es" + notaPromedio);
	 }
}

