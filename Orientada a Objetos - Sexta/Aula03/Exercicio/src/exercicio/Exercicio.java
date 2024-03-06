
package exercicio;
public class Exercicio {
    public static void main(String[] args) {
        Paciente p2 = new Paciente();
        
        Paciente p = new Paciente("Vanderley");
        
        System.out.println("Nome: "+ p.nome);
        System.out.println("RG: "+ p.rg);
        System.out.println("Endereco: "+ p.endereco);
        System.out.println("Telefone: "+ p.telefone);
        System.out.println("Data de Nascimento: "+ p.dataNascimento);
        System.out.println("Profissao: "+ p.profissao);
      
        
    }  
}

// PESSOA nome,rg,endereco,telefone,datanascimento,profissao
