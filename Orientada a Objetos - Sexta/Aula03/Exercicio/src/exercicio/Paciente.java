
package exercicio;
public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;
    
    Paciente(){
        System.out.println("Construtor adicional");
    }
    
    Paciente(String n){
        nome = n;
    }
}
