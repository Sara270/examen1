
public class Cola {
   public int cima=-1;
   public int inicio;
   
   public Monstruo mon;
   Monstruo[] a1 = new Monstruo[10];
   
  public void push (Monstruo monstruo) {
	  if (cima<10) {
			cima++;
			a1[cima]=monstruo;
		}else {
		System.out.println("Ya no caben mostruos");
		}		
  }
  public Monstruo pop()
  {
	  //retorna el primero que entro
	  if(a1[inicio]==null) {
		  return null;
	  }else {
		  mon=a1[inicio];
		  for (int i=0; i<cima; i++) {
			// se van corriendo hacia abajo
			  a1[i]=a1[i+1];  
		  } 
		  cima--;
		  return mon;
	  }
  }
}
