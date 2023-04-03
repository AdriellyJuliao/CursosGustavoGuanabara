public class aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampar();
		// c1.tampada = false; // chamada a atributo
		// c1.status();// chamada a metodo
		c1.rabiscar();

		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}