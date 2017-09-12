
public class Monstruo implements FabricaRanger{

	private String nombre;
	private String elemento1;
	private int edad;
	private String color;
	Pila p1 = new Pila();
	Cola c1 = new Cola();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElemento() {
		return elemento1;
	}

	public void setElemento(String elemento1) {
		this.elemento1 = elemento1;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public boolean apilar(Monstruo monstruo) {
		
		p1.push(monstruo);
		return false;
	}

	public boolean desapilar(Monstruo monstruo) {
		p1.pop();
		return false;
	}

	public boolean encolar(Monstruo monstruo) {
		c1.push(monstruo);
		return false;
	}

	public boolean desencolar(Monstruo monstruo) {
		c1.pop();
		return false;
		
	}

	public Monstruo fabricar(String elemento) {
		elemento1 = elemento;
		return null;
	}
    public String ToStringAgitar() {
    	return "Soy " + nombre + "Me estoy Agitando";
    }
    public String ToStringCaminar() {
    	return "Soy " + nombre + "y Camino lento";
    }
    public String ToStringGolpear() {
    	return "Soy " + nombre + " y estoy golpeando";
    }
}
