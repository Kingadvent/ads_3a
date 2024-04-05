/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio00;
public class Exercicio00 {
    public static void main(String[] args) {
        Curso c1 = new Curso("ADS", 90, "3a", 380);
        
        c1.cadastraCurso();
        c1.imprimeDados();
        System.out.println("TOTAL MENSALIDADE: "+ c1.calculaTotalMensalidade());
        
        System.out.println("");
        
        Curso c2 = new Curso("Ciencia da Computação", 40, "1a", 480);
        
        c2.cadastraCurso();
        c2.imprimeDados();
        System.out.println("TOTAL MENSALIDADE: "+ c2.calculaTotalMensalidade());
    }
    
}
