package ejerciciospracticas;

import javax.swing.JOptionPane;

public class definitivanota {
	
	 public static void main (String [] args) {
	
	 double nota1, nota2, notaPromedio;
	 
	 nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la primera nota del estufiante"));
	 nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la segunda nota del estufiante"));
	                                       
	      notaPromedio = (nota1+nota2)/2;         //Poceso matemático para realizar el cálculo de la definitiva
	 
	                                              //Presentación por pantalla del resultado de la operación
	JOptionPane.showInputDialog(null,"La nota promedio es" + notaPromedio);
	 }
}

