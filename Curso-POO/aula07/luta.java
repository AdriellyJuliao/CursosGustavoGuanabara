import java.util.Random;

public class luta {

    private Lutador desafiado; 
    //desafiado vai ser um obejto da classe Lutador - Tipo abstrato de dados -
    private Lutador desafiante;
    private float rounds;
    private boolean aprovada;



    //métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
       if (l1 != l2) {
            if (l1.getCategoria() == l2.getCategoria()) {
                     this.aprovada = true;
                     this.desafiado =l1;
                     this.desafiante = l2;
            } else {
                this.aprovada = false;
                System.out.println("Luta não pode ser marcada pois não segue as regras de marcação.");
            }
       } else{
         System.out.println("Luta não pode ser marcada pois não segue as regras de marcação.");
       }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // desafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;    

                case 2: //desafiante vence
                System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            
                default:
                    break;
            }



            
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //métodos especiais

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public float getRounds() {
        return this.rounds;
    }

    public void setRounds(float rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }


}
