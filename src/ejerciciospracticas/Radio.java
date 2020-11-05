package ejerciciospracticas;

import javax.swing.JOptionPane;                   //use el metodo de leer lo ingresado a el pc de JOptionpane

public class Radio {

	public static void main(String[] args) {
		
		 String texto=JOptionPane.showInputDialog("Introduce un radio");   // forma de leer lo ingresado por teclado por medio de ventana flotante                                                                          
		 
	        double radio=Double.parseDouble(texto);
	                 //Pasamos el String a double
	                                                                   //Formula area circulo, usamos algunos de los metodos de Math.
	        double area=Math.PI*Math.pow(radio, 2);
	                                                                  //Math.PI= es igual a pi(3.1416) y Math.pow es una funcion para elevar un numero 
	        System.out.println("El area del circulo es "+area);       //(x*x*x) es decir x a la 3 o a la 4 etc. 
	                                                                  //ese codigo es como ver esta formula (3.1416*r2=AREA) y para elevar es (variable,numero a elevar)
	}                                                                 //ejemplo:(radio,3)-(valradio,2)(rad,6) etc, como se ve en el ejercicio 
	                                                                   //(radio,2) sera como el numero ingresado 4 y elevado a la 2
}                                                                      //4 a la 2
	                                                               
	


