package ejerciciospracticas;

import javax.swing.JOptionPane;

public class mayoredad {

	public static void main(String[] args) {
		

        int n;		
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la edad de la persona"));
	
		if (n >= 18) {
			
		JOptionPane.showMessageDialog(null, "La persona es mayor de edad");
		
		} else {//Si no, se imprime menor de edad
			
		JOptionPane.showMessageDialog(null, "La persona es menor de edad");

		}
	}
}