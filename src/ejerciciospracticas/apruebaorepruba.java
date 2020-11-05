package ejerciciospracticas;

import javax.swing.JOptionPane;

public class apruebaorepruba {

	public static void main(String[] args) {
		
		 String nombre, mensaje = null;
		 double nota1, nota2, nota3, notaFinal;
		                                                      //Lectura de los Datos de
	 nombre = JOptionPane.showInputDialog(null,"Por favor ingrese el nombre del estufiante");
	 nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la primera nota del estufiante"));
	 nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la segunda nota del estufiante"));
	 nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor ingrese la tercera nota del estufiante"));
		                                                  
		            //Proceso matemático para realizar el cálculo de la definitiva
	notaFinal = (nota1+nota2+nota3)/3;
	
		  //Estructuras condicionales
	
	if (notaFinal < 30) {
		 mensaje= "REPROBADO";
		
	}else{
		 mensaje= "APROBADO";
		 }
		 //Presentacion por pantalla del resultado de la operacion
		 JOptionPane.showInputDialog(null, nombre + " La nota promedio es " + notaFinal + " y se considera " + mensaje);
		
	   }
	}

