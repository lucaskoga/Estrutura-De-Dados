public class Aluno {

    String nomeAluno;
    int matriculoa;
    double nota;
    String nomeDoCurso;

    public Aluno(String nomeAluno, int matriculoa, double nota, String nomeDoCurso) {
        this.nomeAluno = nomeAluno;
        this.matriculoa = matriculoa;
        this.nota = nota;
        this.nomeDoCurso = nomeDoCurso;
    }

    public String toString(){
        return "Nome do Aluno: "+nomeAluno+ " Numero de Matricula: "+matriculoa+" Nota: "+nota+" Nome Do Curso: "+nomeDoCurso;
    }
}
