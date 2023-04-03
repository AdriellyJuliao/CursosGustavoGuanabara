public class Pessoa {
    //Atríbutos
    private String nome;
    private int idade;
    private String sexo;


    //métodos publicos

    public void fazerAniv() {
        this.idade++;
    }

    //métodos especiais

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Pessoa{"+" nome=" + getNome() +", idade=" + getIdade() +", sexo=" + getSexo() + " " + "}";
    }


}