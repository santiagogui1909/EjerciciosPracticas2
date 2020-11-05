// Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
//resta, multiplicación, división y módulo (resto de la división).

package ejerciciospracticas;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num1,num2;  //definir variables.        (int num1=10 o algun valor seria una variable con valor fijo o asigando)
			
			          System.out.println("ingrese un valor: ");
			          num1=sc.nextInt();
			          System.out.println("ingrese un valor: ");
			          num2=sc.nextInt();
			          
			System.out.println("el resultado de la suma es: " + (num1+num2)); //para hacer operacion e imprimir 
			
			System.out.println("el resultado de la multiplicacion es: " + (num1*num2));
			
			System.out.println("el resultado de la division es: " + (num1/num2));
			
			System.out.println("el resultado de la resta es: " + (num1-num2));
		}
	}
}
