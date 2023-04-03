public class Lutador {
    public static final String Status = null;
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float peso;

    //Métodos publicos
    public void apresentar(){
        System.out.println("--------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.nome);
        System.out.println("Diretamente de " + this.nacionalidade);
        System.out.println("com " + this.idade + " anos e " + this.altura + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println( this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates!" );
    }

    public void Status() { 
        System.out.println("-----------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Emaptou " + this.getEmpates() + " vezes"); 
    }

    public void ganharLuta() {
        this.setVitorias((int) (this.getVitorias() + 1));
    }

    public void perderLuta() {
        this.setDerrotas( this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates((int) (this.getEmpates() + 1));
    }

    //métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
         
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {

        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int f) {
        this.vitorias = f;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int f) {
        this.derrotas = f;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int f) {
        this.empates = f;
    }
    


}
