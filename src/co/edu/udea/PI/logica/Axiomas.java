/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.PI.logica;

/**
 *
 * @author david
 */
public class Axiomas {
    FBF axioma1;
    FBF axioma2;
    FBF axioma3;
    FBF axioma4;
    
    public Axiomas() throws Exception {
        axioma1 = new FBF("p∨p→p");
        axioma2 = new FBF("p→p∨q");
        axioma3 = new FBF("p∨q→q∨p");
        axioma4 = new FBF("(p→q)→(r∨p→r∨q)");
    }
        
}
