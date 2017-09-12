
public class Lista {
	
	private int [] Resultados; 
    private int i;
	
	public Lista() {
		
		Resultados=new int[25];
		i =0;
	}
	
	public int[] getResultados() {
		return Resultados;
	}
	public void setResultados(int[] resultados) {
		Resultados = resultados;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
    public boolean Agregar(int d) {
    	if(i<Resultados.length) {
    		Resultados[i]= d;
    	    return true;
    	}else {
    		return false;
    	}
    }
    public int Sumar() {
    	int suma=0;
    	for(int j = 0; j< i; i++) {
    		suma =+ Resultados[j];
    	}
    	return suma;
    }
}
