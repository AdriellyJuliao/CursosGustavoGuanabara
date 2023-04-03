public class aula012{
    public static void main(String[] args) {
    
        Cachorro k = new Cachorro();
       k.reagir("olá");
       k.reagir("Vai apanhar");
       k.reagir(11, 45);
       k.reagir(21, 00);
       k.reagir(true);
       k.reagir(false);
       k.reagir(2, 12.5f);
       k.reagir(17, 4.5f);
       k.emitirSom();
    }
}