/*  @author Ledón   */

package pcklinkedlistgenericos;

public class Principal {

    public static void main(String[] args) {
        new Principal();
    }
    
    public Principal() {
        LinkedList <Aluno> lista = new LinkedList <Aluno>();
        /*
            // Com a criação desta lista ligada com a especificação acima,
            // não será possível adicionar na lista objetos de outras classes
            // que não sejam da classe Aluno. Os comandos a seguir provocarão 
            // então erros de compilação:
            lista.addLast(new Pessoa("Luiz Carlos Pinheiro", "M", 37));
            lista.addLast(new Pessoa("Karla Fernandes", "F", 22));        
        */
        Aluno a1 = new Aluno("66666-6", "Renata Pires", 23, 'F');
        Aluno a2 = new Aluno("77777-7", "Pedro Pires", 24, 'M');
        lista.addFirst(a1);
        lista.addLast(new Aluno("11111-1", "Luiz Silva", 31, 'M'));
        lista.addLast(new Aluno("22222-2", "Ana Lopes", 22, 'F'));
        lista.addLast(new Aluno("33333-3", "Lilia Peres", 33, 'F'));
        lista.addLast(new Aluno("44444-4", "Caio Sanches", 19, 'M'));
        lista.addLast(new Aluno("55555-5", "Miguel Pereira", 20, 'M')); 
        lista.addLast(a2); 
        
        System.out.println(lista.toString());
        System.out.println("\nEncontrou " + a1.toString() + "?  " + lista.contains(a1) );
        System.out.println("\nEncontrou " + a2.toString() + "?  " + lista.contains(a2) );
        System.out.println("\nElimina " + a1.toString() + "  " + lista.remove(a1) + " e fica: \n"+ lista.toString());
        System.out.println("\nElimina " + a2.toString() + "  " + lista.remove(a2) + " e fica: \n" + lista.toString() );
        System.out.println("\nEncontrou " + a1.toString() + "?  " + lista.contains(a1) );
        System.out.println("\nEncontrou " + a2.toString() + "?  " + lista.contains(a2) );
        
        lista.clear();
        System.out.println("\nZeramos a lista: " + lista.toString());
        lista.addFirst(a1);
        System.out.println("\nAdicionamos apenas um aluno: \n" + lista.toString());
        System.out.println("\nEliminamos " + a1.toString() + "  " + lista.remove(a1) + " e fica: \n" + lista.toString() );
        
        System.out.println("\n");
    }
    
}
