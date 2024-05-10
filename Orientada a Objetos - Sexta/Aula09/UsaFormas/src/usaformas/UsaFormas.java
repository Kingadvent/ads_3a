package usaformas;

import java.util.Scanner;

public class UsaFormas {
    public static void main(String[] args) {
        float b,a;
        Quadrado q;
        Triangulo t;
        Circunferencia c;
        Retangulo r;
        
        Scanner scan = new Scanner(System.in);
        
        //
        // QUADRADO
        //
        System.out.println("Digite a base do quadrado: ");
        b = scan.nextFloat();
        q = new Quadrado(b);
        
        //na chamada do metodo abaixo e passado um objeto da classe Quadrado
        System.out.println("\n");
        q.mostra();
        System.out.println("\n");
        
        
        
        //
        // TRIANGULO
        //
        System.out.println("Digite a base do triangulo: ");
        b = scan.nextFloat();
        System.out.println("Digite a altura do triangulo: ");
        a = scan.nextFloat();
        t = new Triangulo(b,a);
        
        //na chamada do metodo abaixo e passado um objeto da classe Triangulo
        System.out.println("\n");
        t.mostra();
        System.out.println("\n");
        
        
        
        
        //
        // CIRCUNFERENCIA
        //
        System.out.println("Digite o raio da circunferencia");
        b = scan.nextFloat();
        c = new Circunferencia(b);
        
        //na chamada do metodo abaixo e passado um objeto da classe Triangulo
        System.out.println("\n");
        c.mostra();
        System.out.println("\n");
        
        
        
        //
        // RETANGULO
        //
        System.out.println("Digite a base do retangulo: ");
        b = scan.nextFloat();
        System.out.println("Digite a altura do retangulo: ");
        a = scan.nextFloat();
        r = new Retangulo(b,a);
        
        //na chamada do metodo abaixo e passado um objeto da classe Triangulo
        System.out.println("\n");
        r.mostra();
        System.out.println("\n");
        
        
        //
        // CLOSE
        //
        scan.close();
    }
    
}
