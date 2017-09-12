import java.math.BigInteger;

public class Algoritmo_C implements Chudnovsky{

	private Long k=(long) 1;
	private Long pi;
	private Long numerador;
	private Long denominador;
	private Long n1=545140134L, n2=13591409L;
	private Long n3= 262537412640768000L;
	
	
	public Long getK() {
		return k;
	}
	public void setK(Long k) {
		this.k = k;
	}
	public Long getPi() {
		return pi;
	}
	public void setPi(Long pi) {
		this.pi = pi;
	}
	public Long getN1() {
		return n1;
	}
	public void setN1(Long n1) {
		this.n1 = n1;
	}
	public Long getN2() {
		return n2;
	}
	public void setN2(Long n2) {
		this.n2 = n2;
	}
	public Long getN3() {
		return n3;
	}
	public void setN3(Long n3) {
		this.n3 = n3;
	}
	
	public long Factorial(long l) {
		if (l==0) {
			return 1;
		}else
		{
			return (int) (l* Factorial(l-1));
		}
	}
	public long calcularPi(int k) {
		pi = (Factorial(6*k))*((n1*k)+n2);
		pi = (long) ((long) ((int)(pi/(Factorial(3*k)))*(Factorial(k)*Math.pow(3, k)))*Math.pow((n3), 3)*(-1));
		//pi= numerador/denominador;
		return pi;
	}

}
