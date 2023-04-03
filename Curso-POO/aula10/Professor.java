public class Professor extends Pessoa {
    //atríbutos
    private String especialidade;
    private float salario;

    //métodos publicos
    public void ReceberAum(float aum) {
        this.salario += aum;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
