package ex3;

public class Complexo {
	private double a1, a2, b1, b2;

	public Complexo(double a1, double b1, double a2, double b2) {
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
	}

	void soma(Complexo c) {
		if (c != null) {
			this.a1 += c.b1;
			this.a2 += c.b2;
		}
	}
	
	void multiplica(Complexo c) {
		if (c != null) {
			this.a1 *= c.b1;
			this.a2 *= c.b2;
		}		
	}
	
	void toString(Complexo c) {
		System.out.println("Notação Complexa: " + this.a1 + "+" + this.b1 + "i");
		System.out.println("Notação Complexa: " + this.a2 + "+" + this.b2 + "i");				
	}

}
