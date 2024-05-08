
package projetosexta;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String fone;
    private int idade;

    public Pessoa(String n, String f, int i) {
        this.nome = n;
        this.fone = f;
        this.idade = i;
    }


    public String print() {
        return "nome: " + nome + "\nfone: " + fone + "\nidade: " + idade + "";
    }

    

    
    
    
}
