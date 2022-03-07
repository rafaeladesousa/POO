package ex1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Churrasco churras = new Churrasco();
		Pessoa a = new Pessoa("Rafaela", "Feminino", 26, false);
		a.dadosPessoa();
		churras.verificarConsumo(a);

		Pessoa b = new Pessoa("Gabriella", "Feminino", 19, true);
		b.dadosPessoa();
		churras.verificarConsumo(b);

		Pessoa c = new Pessoa("Franscico", "Masculino", 52, false);
		c.dadosPessoa();
		churras.verificarConsumo(c);

	}

}
