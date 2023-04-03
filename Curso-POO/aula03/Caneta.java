
public class Caneta {
// (Criada classe caneta a partir dela eu crio um objeto que no caso esta na aula03)
    public String modelo; 
    public String cor; 
    private float ponta; 
    protected int carga;
    private boolean tampada;

    // METODOS
 
    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }


    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.print(" ERRO! Não posso rabiscar");
        } else {
            System.out.print(" Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public  void destampar() {
        this.tampada = false;

    }
}
