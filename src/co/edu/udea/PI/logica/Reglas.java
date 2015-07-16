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
        setupReglas();
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
    
    public String modusPonems(String fbf1, String fbf2){
        String[] fbf;
        System.out.println("fbf1 : " + fbf1 + " fbf2: " + fbf2);
        if(fbf1.contains("→")){
            fbf= fbf1.split("→",2);
            System.out.println("err:" + fbf[0]);
            if(fbf2.equals(fbf[0])) return fbf[1];
        }else if(fbf2.contains("→")){
            fbf= fbf2.split("→",2);
            System.out.println("err:" + fbf[0]);
            if(fbf1.equals(fbf[0])) return fbf[1];
        }
         return null;
    }
    
    
    
    private boolean compararArboles(FBF regla, FBF expresion){
        
        if(regla == null && expresion == null){
            return true;
        }
        if(regla.getEsAtomo()==true){
            hijosRegla.add(regla.toString());
            hijosExpresion.add(expresion.toString());
            return true;
        }
        
        if(Objects.equals(regla.getOperador(), expresion.getOperador()) &&
                compararArboles(regla.getFbfD(), expresion.getFbfD()) &&
                compararArboles(regla.getFbfI(), expresion.getFbfI()) ){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean  compararExpresiones(FBF expresion1, FBF expresion2, ArrayList<FBF> rfp){
        if(compararArboles( rfp.get(0),expresion1)){
            if(compararArboles( rfp.get(1),expresion2)){
                return true;
            }else {
                return false;
            }
        } else if (compararArboles( rfp.get(1),expresion1)){
            if(compararArboles( rfp.get(0),expresion2)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    
    public boolean validar(int regla, FBF expresion ,FBF expresion2){
        
        hijosRegla = new ArrayList();
        hijosExpresion = new ArrayList();
        
        switch (regla){
            case 5: if(!compararExpresiones(expresion, expresion2, rfp5))return false;
                break;
            case 6: if(!compararExpresiones(expresion, expresion2, rfp6))return false;
                break;
            case 7: if(!compararExpresiones(expresion, expresion2, rfp7))return false;
                break;
                
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
      
}
