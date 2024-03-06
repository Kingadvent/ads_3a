public class aula {
    public static void main(String[] args) {
        pessoa p = new pessoa();
        
        p.nome = "Vanderley";
        p.endereco = "Rua Nada a ver";
        p.telefone = "912345678";
        p.email = "vanderley.junior@cruzeirodosul.edu.br";
        
        System.out.println("Nome: "+ p.nome);
        System.out.println("Endereço: "+ p.endereco);
        System.out.println("Telefone: "+ p.telefone);
        System.out.println("E-mail: "+ p.email);
    }
}
