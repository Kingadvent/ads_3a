package exercicio02;
public class Exercicio02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo t1 = new Triangulo(10, 3);
        System.out.println("Area: "+ t1.calculaArea());
        t1.imprimeDados();
        
        System.out.println("");
        
        Triangulo t2 = new Triangulo();
        t2.setBase(8);
        t2.setAltura(4);
        System.out.println("Area: "+ t2.calculaArea());
        t2.imprimeDados();
    }
    
}
