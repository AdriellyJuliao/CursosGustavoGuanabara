public class aula011 {
    public static void main(String[] args) {
        /*
         * Visitante v1 = new Visitante();
         * v1.setNome("Diego");
         * v1.setIdade(21);
         * v1.setSexo("M");
         * System.out.println(v1.toString());
         */

        Aluno a1 = new Aluno();
        a1.setNome("Adrielly");
        a1.setMatricula(789859);
        a1.setIdade(20);
        a1.setCurso("ADS");
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1111);
        b1.setNome("Rafael");
        b1.setIdade(20);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Professor p1 = new Professor();
        p1.setNome("Carlos");
        p1.setEspecialidade("Algoritmos");
        p1.setSexo("F");
        p1.setSalario(7.000f);
        p1.receberAumento(500);
        p1.setIdade(35);
        System.out.println(p1.toString());

    }
}
