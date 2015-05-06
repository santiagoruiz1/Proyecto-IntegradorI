
package co.edu.udea.PI.logica;

import javax.swing.JOptionPane;


public class ExcepcionLogica extends Exception{
	
	public ExcepcionLogica(){
		super("Error en la expresion");
                JOptionPane.showMessageDialog(null,
                "Error en la expresion");
	}
}