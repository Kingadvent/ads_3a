package exercicio01;
public class Exercicio01 {
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente p = new Paciente("Vanderley", "321456874", "Rua G 12", "1234-5678", 2001, "Programador");
        
        p.imprimeDados();
        
        System.out.println("IDADE: "+ p.calculaIdade(2024));
        
        System.out.println("");
        
        Paciente p2 = new Paciente("Joaquim", "848632145", "Rua Y 12", "4568-1234", 2006, "Cozinheiro");
        
        p2.imprimeDados();
        
        System.out.println("IDADE: "+ p2.calculaIdade(2024));
    }
    
}
