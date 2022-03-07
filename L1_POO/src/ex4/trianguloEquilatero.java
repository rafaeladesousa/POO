package ex4;

public class trianguloEquilatero {
	double lado, perimetro, area;
	
	public trianguloEquilatero (double lado) {
		this.lado = lado;
	}
	
	void calcArea() {		
		this.area = lado * (Math.sqrt(3)/2);
	}
	
    void calcPerimeto() {
        this.perimetro = 3 * lado;
    }
    
    void getLado() {
        System.out.println("Valor do lado: " + lado);

    }
    
    void getCalc () {
        System.out.println("Resultado do calculo da Área: " + area);
        System.out.println("Resultado do calculo do Perímeto: " + perimetro);
    }

}
