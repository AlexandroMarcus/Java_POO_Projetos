package nota;

public class Nota {
	float n1;
	float n2;
	float n3;
	
	public float aritmetica() {
		return (n1+n2+n3)/3;
	}
	
	public float ponderada() {
		return (n1*2 + n2*3 + n3*4) / (2+3+4);
	}
	
}
