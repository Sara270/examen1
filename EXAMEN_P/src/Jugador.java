import java.util.ArrayList;

public class Jugador implements Reportero{

	private String nombre;
	private int identificador;
	private boolean ganar;
	
	Lista jugadora = new Lista();
	Lista jugadorb = new Lista();
	public boolean isGanar() {
		return ganar;
	}


	public void setGanar(boolean ganar) {
		this.ganar = ganar;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public String calcularGanador(int a, int b) {
		if (a>6 || b>6) {
			if(a == b + 2) {
				jugadora.Agregar(a);
				return "gano: a";
				
			}
			if (b== a + 2) {
				jugadorb.Agregar(b);
				return "gano: b";
			}
			if (a==5 && b==5) {
				return "Sigue el juego";
			}
			if (a==6 && b==6) {
				return "ultimo set; ganador";
			}
			if (verificar(a,b) == false) {
				return "no hay ganador";
			}
			if (b==7 && a==6) {
				jugadorb.Agregar(b);
				return "gano b";
			}
			if(a==7&& b==6) {
				jugadora.Agregar(a);
				return "gano a";
			}
		}
		
		return null;
	}

	
	public String calcularCampeon() {
		int ja= jugadora.Sumar();
		int jb= jugadorb.Sumar();
		if(ja > jb)
		{
			return "El jugador a es el campeon";
		}
		else {
		     return "El jugador b es el campeon";
		}
	}

	public String recordarGanador(int juego) {
		
		return "El ganador es: " + calcularCampeon();
	}
	
	private boolean verificar(int a, int b) {
		if(a>7 || b>7) {
			return false;
		}
		
		if ((a-b)>2||(b-a)>2) {
			return false;
		}
		return true;
		}
	}


