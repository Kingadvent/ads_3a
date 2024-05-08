package projetosexta;

import javax.swing.JOptionPane;

public class Funcionarios extends Pessoa {
    
    private String cargo;
    private float salario;

    public Funcionarios(String c, float s, String n, String f, int i) {
        super(n, f, i);
        this.cargo = c;
        this.salario = s;
    }
    
    @Override
    public String print() {
        return super.print() +"\ncargo: " + cargo + "\nsalario: " + salario + "";
    }
    
    
}
