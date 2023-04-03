public class Aluno extends Pessoa {
    //atríbutos
    private int matricula;
    private String curso;

    //métodos publicos
    
    public void cancelaMatr() {
        System.out.println("Matrícula será cancelada");
    }

    //métodos especiais

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
