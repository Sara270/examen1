
public class Pila {
 
	Monstruo[] a1 = new Monstruo[10];
	public int cima = -1;
	
	public void push(Monstruo monstruo) {
	// cuando lo llamen por primera vez la cima vale 0
		
	if (cima<10) {
		cima++;
		a1[cima]=monstruo;
	}else {
	System.out.println("Ya no caben mostruos");
	}		
	}
	public Monstruo pop() {
		if (cima < 0)
		{
			return null;
		}else {	
			cima --;
			return a1[cima+1];	
		}
		
	}
	}
	
	

