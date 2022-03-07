package ex6;

public class Eq2Grau {
	
	double a, b, c, d, r1, r2;
	
	public Eq2Grau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double delta(double d){
		d = (b*b) - (4*a*c);
		return d; 
	}
		
	public double raiz1(double r1) {
		r1 = ((-b) - (Math. sqrt(d))/(2*a));
		if (d >= 0) {
			return r1;	
		} else {
			System.out.println("NaN");
		}

	}
	
	public double raiz2(double r2) {
		r2 = ((-b) - (Math. sqrt(d))/(2*a));
		if (d >= 0) {
			return r2;	
		}  else {
			System.out.println("NaN");
		}
	}
			
}

