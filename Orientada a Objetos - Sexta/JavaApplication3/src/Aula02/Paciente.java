package Aula02;
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
    
    Paciente(String n, String r, String e, String t, String d, String p){
        nome = n;
        rg = r;
        endereco = e;
        telefone = t;
        dataNascimento = d;
        profissao = p;
    }
}
