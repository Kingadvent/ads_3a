package exercicio00;
public class Curso {
    private String nome;
    private int qntAluno;
    private String turma;
    private float mensalidade;

    public Curso() {
    }

    public Curso(String nome, int qntAluno, String turma, float mensalidade) {
        this.nome = nome;
        this.qntAluno = qntAluno;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }
    
    public void cadastraCurso() {
        
    }

    public void imprimeDados() {
        System.out.println("Curso{" + "nome=" + nome + ", qntAluno=" + qntAluno + ", turma=" + turma + ", mensalidade=" + mensalidade + '}');
    }
    
    public float calculaTotalMensalidade() {
        return mensalidade*qntAluno;
    }
    
    
}
