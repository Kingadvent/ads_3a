package testeslinkedlist;

import java.util.Comparator;
import java.util.LinkedList;

public class TestesLinkedList {

    public static void main(String[] args) {
        System.out.println("Fila");
        LinkedList fila1 = new LinkedList();

        //enqueue: adicionemos objetos da classe String
        fila1.addLast("casa");
        fila1.addLast("mesa");
        fila1.addLast("janela");

        System.out.println(fila1.toString());

        //dequeue:
        System.out.println("dequeue:" + fila1.removeFirst());

        //-----------------------
        System.out.println("\nPilha");
        LinkedList pilha = new LinkedList();

        //push: adicionemos objetos da classe String
        pilha.addLast("verde");
        pilha.addLast("azul");
        pilha.addLast("amarelo");

        System.out.println(pilha.toString());

        //pop:
        System.out.println("pop: " + pilha.removeLast());

        //-----------------------
        System.out.println("\nFila2");
        LinkedList fila2 = new LinkedList();
        //adicionemos objetos da classe Integer:
        fila2.addLast(20);
        fila2.addLast(30);
        fila2.addLast(40);
        fila2.addLast(50);
        //um processamento geral qualquer:
        int soma = 0;
        for (Object obj : fila2) {
            int valor = (int) obj;
            soma += valor;
        }
        System.out.println(fila2.toString());
        System.out.println("Média: " + soma / fila2.size());

        //-----------------------
        System.out.println("\nFila3");
        LinkedList fila3 = new LinkedList();
        //adicionemos objetos da classe Trabalhador:
        fila3.addLast(new Trabalhador("Beatriz Lima", 6000.00f));
        fila3.addLast(new Trabalhador("Carlos Souza", 5000.00f));
        fila3.addLast(new Trabalhador("Ana Peres", 3000.00f));
        fila3.addLast(new Trabalhador("Luiz Alves", 3000.00f));
        fila3.addLast(new Trabalhador("Amilton Lopes", 3000.00f));
        //um processamento geral qualquer:
        float somaSalarios = 0;
        for (Object obj : fila3) {
            Trabalhador trab = (Trabalhador) obj;
            System.out.println(trab.toString());
            somaSalarios += trab.getSalario();
            //poderia chamar também trab.getNome() e outros métodos da classe Trabalhador
        }
        //System.out.println(fila3.toString()); //ficariam todos em uma linha
        System.out.println("Média dos salários: R$" + somaSalarios / fila3.size());

        System.out.println("\nTrabalhadores ordenados alfabeticamente:");
        //funciona porque a classe Trabalhador definiu a lógica do compareTo:
        Comparator c = ((obj1, obj2) -> (((Trabalhador) obj1).compareTo(((Trabalhador) obj2))));
        fila3.sort(c);
        //este método de ordenação sort, a classe LinkedList herda de List e segundo a
        //Oracle utilizam um método iterativo MergeSort de O(n log n)
        for (Object obj : fila3) {
            System.out.println(obj.toString());
        }

        //----------------------------------
        LinkedList fila4 = new LinkedList();
        fila4.addLast(new Trabalhador("Daniel Borelli", 6000.00f));
        fila4.addLast(new Trabalhador("Zoe Fernandes", 5000.00f));
        fila4.addLast(new Trabalhador("Ana Linares", 3000.00f));
        fila4.addLast(new Trabalhador("Luiz Alves", 3000.00f));
        fila4.addLast(new Trabalhador("Amilton Gomes", 3000.00f));
        fila4.addLast(new Trabalhador("Ada Hernández", 3000.00f));
        LinkedList filaClonada = (LinkedList) fila4.clone(); 
        filaClonada.sort(c);
        System.out.println("\nFila original sem alterar");
        for (Object obj : fila4)   System.out.println(obj.toString());
        System.out.println("Fila clonada ordenada");
        for (Object obj : filaClonada)  System.out.println(obj.toString());
    }
}
