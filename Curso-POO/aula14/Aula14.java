public class Aula14 {
     public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Diego", 21, "M", "infraporamor");
        g[1] = new Gafanhoto("Adrielly", 20, "F", "driihjuliao");

        System.out.println(g[0].toString());

        System.out.println(v[1].toString());
        System.out.println(v[0].toString());
    }
}