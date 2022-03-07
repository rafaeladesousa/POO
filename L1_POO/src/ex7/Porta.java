package ex7;

public class Porta {
	
	boolean isOpen;
	int numAberturas;
	
	void abrir(){
			isOpen = false;
			numAberturas = numAberturas + 1;
			isOpen = true;
            System.out.println("A PORTA ABRIU!");
		
	}
	
	void fechar(){
			isOpen = false;
            System.out.println("A PORTA FECHOU!");
		
	}
	
	void getNumAberturas() {
            System.out.println("A PORTA ABRIU " + numAberturas + " VEZES");
	
	}

}
