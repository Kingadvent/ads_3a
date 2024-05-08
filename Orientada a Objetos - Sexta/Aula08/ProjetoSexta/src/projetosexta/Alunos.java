package projetosexta;
public class Alunos extends Pessoa {
    private String curso;
    private int semestre;

    public Alunos(String c, int s, String n, String f, int i) {
        super(n, f, i);
        this.curso = c;
        this.semestre = s;
    }

    @Override
    public String print() {
        return super.print() +"\ncurso: " + curso + "\nsemestre: " + semestre + "";
    }
    
    
}
