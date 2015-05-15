package co.edu.udea.PI.logica;

import java.util.ArrayList;
import java.util.Set;

public class Componentes {
    private ArrayList<Character> alfabeto = new ArrayList<Character>();
	private ArrayList<Character> operadores = new ArrayList<Character>();
	
	public Componentes() {
		
		Character []alf = {'p','q','r','s','t'};  			//Operadores permitidos
		Character []ops = {'∨','∧','⊢','→','↔'};     //Atomos permitidos 
		
		for (int i=0;i<ops.length;i++) {
			operadores.add(ops[i]);
		}
		for (int i=0;i<alf.length;i++) {
			alfabeto.add(alf[i]);
		}		
	}

	public ArrayList<Character> getAlfabeto() {
		return alfabeto;
	}

	

	public ArrayList<Character> getOperadores() {
		return operadores;
	}

	
    
}
