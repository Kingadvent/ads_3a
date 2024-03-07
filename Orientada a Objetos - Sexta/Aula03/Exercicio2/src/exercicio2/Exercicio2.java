/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;
public class Exercicio2 {
    public static void main(String[] args) {
        new Exercicio2();
    }
    public Exercicio2(){
        Produto p2 = new Produto();
        
        Produto p = new Produto("HP","Positivo","00842563142",2300);
        
        System.out.println("Marca: "+ p.marca);
        System.out.println("Fabricante: "+ p.fabricante);
        System.out.println("Codico de Barra: "+ p.cod_barra);
        System.out.println("Preço: $"+ p.preco);
    }
    
}
