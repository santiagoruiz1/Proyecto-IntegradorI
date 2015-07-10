/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package co.edu.udea.PI.logica;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prog-labs
 */
public class Reglas {
    private ArrayList<FBF> rfp5;
    private ArrayList<FBF> rfp6;
    private ArrayList<FBF> rfp7;
    ArrayList hijosRegla;
    ArrayList hijosExpresion;
    
    public Reglas(){
        rfp5 = new ArrayList<>();
        rfp6 = new ArrayList<>();
        rfp7 = new ArrayList<>();
    }
    
    public void setupReglas(){
        try {
            rfp5.add(new FBF("r∧s"));
            rfp5.add(new FBF("¬(¬r∨¬s)"));
            rfp6.add(new FBF("r→s"));
            rfp6.add(new FBF("¬r∨s"));
            rfp7.add(new FBF("r↔s"));
            rfp7.add(new FBF("(r→s)∧(s→r)"));
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(Reglas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    private boolean compararArboles(FBF axioma, FBF expresion){
        
        if(axioma == null && expresion == null){
            return true;
        }
        if(axioma.getEsAtomo()==true){
            hijosRegla.add(axioma.toString());
            hijosExpresion.add(expresion.toString());
            return true;
        }
        
        if(Objects.equals(axioma.getOperador(), expresion.getOperador()) &&
                compararArboles(axioma.getFbfD(), expresion.getFbfD()) &&
                compararArboles(axioma.getFbfI(), expresion.getFbfI()) ){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validar(int regla, FBF expresion ,FBF expresion2){
        
        hijosRegla = new ArrayList();
        hijosExpresion = new ArrayList();
        
        switch (regla){
            case 5: if(!compararExpresiones(expresion, expresion2, rfp5))return false;
            case 6: if(!compararExpresiones(expresion, expresion2, rfp6))return false;
            case 7: if(!compararExpresiones(expresion, expresion2, rfp7))return false;
                
        }
        
        
        for(int i=0;i<hijosRegla.size();i++){
            for(int j=i+1;j<hijosRegla.size();j++){
                if(hijosRegla.get(i).equals(hijosRegla.get(j))){
                    if(!(hijosExpresion.get(i).equals(hijosExpresion.get(j)))){
                        return false;
                    }
                }
            }
        }
        
        return true;
        
    }
    
    public boolean  compararExpresiones(FBF expresion1, FBF expresion2, ArrayList<FBF> rfp){
        if(compararArboles(expresion1, rfp.get(0))){
            if(compararArboles(expresion2, rfp.get(1))){
                return true;
            }else {
                return false;
            }
        } else if (compararArboles(expresion1, rfp.get(1))){
            if(compararArboles(expresion2, rfp.get(0))){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    
}
