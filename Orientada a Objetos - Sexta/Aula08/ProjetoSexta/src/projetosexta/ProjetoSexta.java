package projetosexta;

import javax.swing.JOptionPane;

public class ProjetoSexta {
    public static void main(String[] args) {
        Alunos a1 = new Alunos("ads", 3, "Vanderley", "1234-5678", 21);
        JOptionPane.showMessageDialog(null, a1.print());
        
        Funcionarios f1 = new Funcionarios("Manutenção de Computador", 1800, "Joaozinho", "9876-5432", 25);
        JOptionPane.showMessageDialog(null, f1.print());
        
        Professores p1 = new Professores("POO", 2000, "Pedro", "4567-8932", 30);
        JOptionPane.showMessageDialog(null, p1.print());
    }
    
}
