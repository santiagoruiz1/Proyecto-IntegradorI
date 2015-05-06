
package co.edu.udea.PI.logica;

public class Axiomas {
    
    private FBF fbf1;
    private FBF fbf2;
    private FBF fbfI;
    private FBF fbfD;
    private Character operador;
    private String tipoAxioma="Ninguno";
    
    public Axiomas(FBF fbf1, FBF fbf2){
        this.fbf1 = fbf1;
        this.fbf2 = fbf2;
        
         
        if(axioma1()){
            tipoAxioma= "Idempotencia";
            System.out.println("adj");
        }
//        if(axioma2()){
//            tipoAxioma= "Adjuncion";
//            System.out.println("Idem");
//        }
//    
    }
    
    public Boolean axioma1(){
        
        if (!fbf2.getEsAtomo()){
            return false;
        }else if(fbf1.getFbfI().getOperador().equals(fbf1.getFbfD().getOperador())){
            System.out.println("entro 1");
            if(fbf1.getOperador().equals('|') && fbf1.getFbfI().getOperador().equals(fbf2.getOperador())){
                return true;
            }
            System.out.println("entro 2");
            return false;
            
        }
        System.out.println("entro 2");
        return false;
    }
    
    public Boolean axioma2(){
        System.out.println("entro");
        if (!fbf1.getEsAtomo()){
            System.out.println("no es atomo");
            return false;
        }else if(fbf2.getFbfI().getOperador().equals(fbf1.getOperador()) ||
                fbf2.getFbfD().getOperador().equals(fbf1.getOperador())){
            System.out.println("true op");
            if(fbf2.getOperador().equals('|')){
                return true;
            }
        }
        return false;
    }
    
    /**
     * @return the tipoAxioma
     */
    public String getTipoAxioma() {
        return tipoAxioma;
    }
    
    /**
     * @param tipoAxioma the tipoAxioma to set
     */
    public void setTipoAxioma(String tipoAxioma) {
        this.tipoAxioma = tipoAxioma;
    }
    
}
