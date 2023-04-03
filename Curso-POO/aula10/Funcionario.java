public class Funcionario extends Pessoa {
    //Atríbutos
    private String setor;
    private boolean trabalhando;

    //métodos publicos
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
