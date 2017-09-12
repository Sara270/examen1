import java.util.Scanner;

public class MAIN{

	public static void main(String [ ] args)
	{
		String nom;
		String tip;
		int ed;
		String col;
		Monstruo monstruo1;
		
		Scanner tecla = new Scanner(System.in);
		
		Algoritmo_C al = new Algoritmo_C();
		System.out.println(al.calcularPi(1));
		
		Monstruo m2= new Monstruo();
		Pila p1 = new Pila();
		Cola c1 = new Cola();
		
		System.out.println("Como se llama: ");
		nom = tecla.nextLine();
		m2.setNombre(nom);
		
		System.out.println("Que tipo: ");
		tip =  tecla.nextLine();
		m2.setElemento(tip);
		
		System.out.println("Edad");
		ed = tecla.nextInt();
		m2.setEdad(ed);
		
		System.out.println("Color");
		col =  tecla.nextLine();
		m2.setColor(col);
		
		
		
		System.out.println("Soy " + (String) nom + "y soy de: " + (String) tip);
		
		
       
	}


}
