package ex2;

public class Lampada {
	boolean estado;
	int qntClicks;

	void OnOff() {

		if (qntClicks >= 3) {
			estado = false;
		}
		if (estado == false) {
			estado = true;
			qntClicks = qntClicks + 1;
		} else if (estado == true) {
			estado = false;
			qntClicks = qntClicks + 1;
		}
	}

	void getEstadoLampada() {

		if (qntClicks >= 3) {
			System.out.println("LAMPADA QUEIMOU!");
		} else

		if (estado == false) {
			System.out.println("A LAMPADA ESTÁ DESLIGADA!");

		} else if (estado = true) {
			System.out.println("A LAMPADA ESTÁ LIGADA!");

		}

	}

}
