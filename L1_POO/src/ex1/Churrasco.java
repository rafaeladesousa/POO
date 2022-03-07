package ex1;

public class Churrasco {
	double qtdCarne;

	void verificarConsumo(Pessoa p) {
		if (p.idade >= 0 && p.idade <= 3) {
			qtdCarne = 0;
		} else if (p.vegetariana) {
			qtdCarne = 0;
		} else if (p.idade >= 4 && p.idade <= 12) {
			qtdCarne = 1;
		} else if (p.idade >= 13) {
			qtdCarne = 2;
		}
		System.out.println("Quantidade a consumir: " + qtdCarne + " kilo(s)");
		System.out.println("");

	}

}
