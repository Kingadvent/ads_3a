package Aula02;
public class Aula02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.nome = "Vanderley";
        p.endereco = "Rua Vanderley";
        p.telefone = "912345678";
        p.email = "vanderley@cruzeirodosul.edu.br";
        
        System.out.println("Nome: "+ p.nome);
        System.out.println("Endereço: "+ p.endereco);
        System.out.println("Telefone: "+ p.telefone);
        System.out.println("E-mail: "+ p.email);
    }
}
