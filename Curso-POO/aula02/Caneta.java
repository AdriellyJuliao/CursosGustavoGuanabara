
public class Caneta {
    String modelo; // atributo
    String cor;// atributo
    float ponta;// atributo
    int carga;// atributo
    boolean tampada;// atributo

    // METODOS
    void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println(" ERRO! Não posso rabiscar");
        } else {
            System.out.println(" Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;

    }
}
