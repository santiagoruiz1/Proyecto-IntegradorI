package co.edu.udea.PI.logica;

public class FBF {
	
	private Character operador; 	//operador de la fbf
	private FBF fbfI;				//operandos de la fbf
	private FBF fbfD;
	private Boolean esAtomo;	
	
	//componentes que pueden ser utilizados para la formacion de una expresion logica
	private Componentes comp = new Componentes();	
		
	//Constructor de un atomo
	public FBF(Character atomo) throws Exception{
		
		if(comp.getAlfabeto().contains(atomo)== false){
			throw new ExcepcionLogica();
		}
		operador = atomo;
		fbfI = null;
		fbfD = null;
		esAtomo = true;		
	}
	
	
	
	//Constructor para expresion compuesta
	public FBF(String expresion) throws Exception{
            				
		int parentAbierto = 0;
		int posicionOR = -1;
		int posicionAND = -1;
		int posicionNOT = -1;
                int posicionFlecha = -1;
                int posicionFlechaBi = -1;
                
		if(expresion.length()==1 ){
			FBF aux = new FBF(expresion.charAt(0));
                        operador = aux.getOperador();
                        fbfI = aux.getFbfI();
                        fbfD = aux.getFbfD();
                        esAtomo = aux.getEsAtomo();
                        return;
		}
				
		for (int i = 0; i < expresion.length(); i++) {
			
			Character c = expresion.charAt(i);	
			if(c=='('){
				parentAbierto++;				
			}
			else if(c==')'){
				parentAbierto--;				
			}
                        else if(c=='↔'){
				posicionFlechaBi = i;				
			}
                        else if(c=='→'){
				posicionFlecha = i;				
			}
			else if(c=='∨' && parentAbierto == 0){
				posicionOR = i;
			}
			else if(c=='∧' && parentAbierto == 0){
				posicionAND = i;
			}
			else if(c=='⊢' && parentAbierto == 0){
				posicionNOT = i;
			}
                        
                            
                }
		if(parentAbierto != 0){
			throw new ExcepcionLogica();			
		}
                else if(posicionFlechaBi != -1){
			operador = expresion.charAt(posicionFlechaBi);
			String eI = expresion.substring(0, posicionFlechaBi );
			String eD = expresion.substring(posicionFlechaBi +1, expresion.length());
			if(eI.length()==1){
				fbfI = new FBF(eI.charAt(0)); 
			}else{
				fbfI = new FBF(eI);
			}
			
			if(eD.length()==1){
				fbfD = new FBF(eD.charAt(0)); 
			}else{
				fbfD = new FBF(eD);
			}
			return;
			
		}
                
                else if(posicionFlecha != -1){
			operador = expresion.charAt(posicionFlecha);
			String eI = expresion.substring(0, posicionFlecha );
			String eD = expresion.substring(posicionFlecha +1, expresion.length());
			if(eI.length()==1){
				fbfI = new FBF(eI.charAt(0)); 
			}else{
				fbfI = new FBF(eI);
			}
			
			if(eD.length()==1){
				fbfD = new FBF(eD.charAt(0)); 
			}else{
				fbfD = new FBF(eD);
			}
			return;
			
		}
                
		else if(posicionOR != -1){
			operador = expresion.charAt(posicionOR);
			String eI = expresion.substring(0, posicionOR );
			String eD = expresion.substring(posicionOR +1, expresion.length());
			if(eI.length()==1){
				fbfI = new FBF(eI.charAt(0)); 
			}else{
				fbfI = new FBF(eI);
			}
			
			if(eD.length()==1){
				fbfD = new FBF(eD.charAt(0)); 
			}else{
				fbfD = new FBF(eD);
			}
			return;
			
		}
		else if(posicionAND != -1){
			operador = expresion.charAt(posicionAND);
			String eI = expresion.substring(0, posicionAND );
			String eD = expresion.substring(posicionAND +1, expresion.length());
			if(eI.length()==1){
				fbfI = new FBF(eI.charAt(0)); 
			}else{
				fbfI = new FBF(eI);
			}
			
			if(eD.length()==1){
				fbfD = new FBF(eD.charAt(0)); 
			}else{
				fbfD = new FBF(eD);
			}
			return;
			
		}
		else if(posicionNOT == 0 ){
			operador = expresion.charAt(posicionNOT);
			fbfI = null; 
			String eD = expresion.substring(posicionNOT +1, expresion.length());
			if(eD.length()==1){
				fbfD = new FBF(eD.charAt(0)); 
			}else{
				fbfD = new FBF(eD);
			}
			return;		
		}
                else if(posicionNOT ==-1 &&posicionAND ==-1 &&posicionOR == -1 
                        && expresion.charAt(0)=='(' && expresion.charAt(expresion.length()-1)==')' ){
			FBF aux = new FBF(expresion.substring(1, expresion.length()-1));
                        operador = aux.getOperador();
                        fbfI = aux.getFbfI();
                        fbfD = aux.getFbfD();
                        esAtomo = aux.getEsAtomo();
                        return;
		}else{
                    throw new ExcepcionLogica(); 
                }
		
	}
	
	
	public Character getOperador() {
		return operador;
	}
	public void setOperador(Character operador) {
		this.operador = operador;
	}
	public FBF getFbfI() {
		return fbfI;
	}
	public void setFbfI(FBF fbfI) {
		this.fbfI = fbfI;
	}
	public FBF getFbfD() {
		return fbfD;
	}
	public void setFbfD(FBF fbfD) {
		this.fbfD = fbfD;
	}
	public Boolean getEsAtomo() {
		return esAtomo;
	}
	public void setEsAtomo(Boolean esAtomo) {
		this.esAtomo = esAtomo;
	}
	
}

