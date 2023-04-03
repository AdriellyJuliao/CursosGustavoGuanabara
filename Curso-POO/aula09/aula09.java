public class aula09 {
 public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];


        p[0]= new Pessoa("Diego", 21, "M");
        p[1]= new Pessoa("Adrielly", 20, "F");

        l[0]= new Livro("Aprendendo Java", "José da Silva", 300, 0, false, p[0]);

        l[1]= new Livro("POO para iniciantes", "Pedro Paulo", 500, 0, false, p[1]);

        l[2]= new Livro("Java avançado", "Maria Candido", 800, 0, false, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].toString());

        System.out.println(l[1].toString());
    }
}