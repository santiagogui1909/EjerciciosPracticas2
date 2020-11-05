package ejerciciospracticas;

import java.util.Scanner;

public class mayorigual {

	public static void main(String[] args) {
	                                      	//Declara 2 variables numéricas (con el valor que desees),
		                                    //he indica cual es mayor de los dos. Si son iguales indicarlo también.4// Ves cambiando los valores para comprobar que funciona.
			
			try (Scanner sc = new Scanner(System.in)) {
				{ //siempre cerrar el scanner
					
					int num1;
					int num2;
					
					System.out.println("ingrese un valor:");
					num1=sc.nextInt();
					
					System.out.println("ingrese un valor:");
					num2=sc.nextInt();
					
					if (num1>=num2) {
						
						if (num1==num2) {
							System.out.println("el numero " + num1 + " y el numero " + num2 + " son iguales");
							  	
							} else {
								System.out.println("el numero " + num1 + " es mayor que el numero " + num2 );
						       }
				     } else {
							           System.out.println("el numero " + num2 + " es mayor que el numero " + num1);
					}
			   }
					
		  }
     }
}

