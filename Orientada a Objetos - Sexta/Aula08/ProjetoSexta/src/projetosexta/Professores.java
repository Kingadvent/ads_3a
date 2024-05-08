package projetosexta;
public class Professores extends Pessoa{
    private String materia;
    private int salario;

    public Professores(String m, int s, String n, String f, int i) {
        super(m, f, i);
        this.materia = m;
        this.salario = s;
    }


    @Override
    public String print() {
        return  super.print() +"\nmateria: " + materia + "\nsalario: " + salario + "";
    }
    
    
}
