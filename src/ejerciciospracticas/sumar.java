package ejerciciospracticas;

import javax.swing.JOptionPane;

public class sumar {
	
		public static void main(String[] args) {
	
		int num1;
		int num2;
		int suma;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número que desea sumar"));
		
		num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo número que desea sumar"));
		
		suma = num1 + num2;
		
		JOptionPane.showInputDialog(null, "El resultado de la suma es: " + suma);
		}
	}