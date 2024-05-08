/*  @author Ledón   */

package pcklinkedlist;

public class Principal {

    public static void main(String[] args) {
        new Principal();
    }
    
    public Principal() {
        LinkedList lista = new LinkedList();
        
        /* 
        // diferentes testes para verificar que todos os métodos funcionam corretamente...
     	if( lista.isEmpty() ) {
    		System.out.println("Inicialmente: a lista está vazia");
    	}
    	
    	lista.addFirst(5);
    	lista.addFirst(12);
    	lista.addFirst(6);
   	lista.addFirst(4);
    	if( !lista.isEmpty() ) {
    	   System.out.println("Inseridos na cabeça 5, 12, 6, 4. A lista não está vazia: " + lista.toString());
    	}
    	lista.addLast(98);
   	lista.addLast(34);
    	if( !lista.isEmpty() ) {
    	   System.out.println("Inseridos na cauda 98,34. A lista não está vazia: " + lista.toString());
    	}

        System.out.println("\nTestes com o método    public Object remove(int idx)  ");
        System.out.println("O valor na cabeça da lista, chamando peekFirst(), é " + lista.peekFirst() + " e no final, chamando peekLast() é " + lista.peekLast());        
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Elimina (tenta) o item na posição 54:  " + lista.remove(54) + " e fica " + lista.toString());
        System.out.println("Elimina (tenta) o item na posição -3:  " + lista.remove(-3) + " e fica " + lista.toString());
        System.out.println("Elimina (tenta) o item na posição 5:  " + lista.remove(5) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 4:  " + lista.remove(4) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Adiciona na cauda com addLast(71) o valor " + lista.addLast(71) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Elimina o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());

    	System.out.println("\nTestes com o método   public Object addFirst(Object x) ");
        lista.addFirst(23);
    	lista.addFirst(16);
    	lista.addFirst(62);
   	lista.addFirst(49);
        System.out.println("Depois de inserir na cabeça 23, 16, 62, 49 ficou " + lista.toString());
        
        lista.clear(); System.out.println("Lista limpa com clear() ficou: " + lista.toString());
        System.out.println("\nTestes com o método   public Object addLast(Object x) ");
        lista.addLast(44);
    	lista.addLast(99);
    	lista.addLast(77);
   	lista.addLast(66);
        System.out.println("Depois de inserir na cauda 44, 99, 77, 66 ficou " + lista.toString());
        
        
    	while( !lista.isEmpty() ) {
    	  int valor = (Integer)lista.removeFirst();
    	  System.out.println("Retirando da cabeça da lista o valor " + valor);	
    	}
        System.out.println("Elimina (tenta) o item na posição 0:  " + lista.remove(0) + " e fica " + lista.toString());
        System.out.println("Finalmente: " + lista.toString());

        System.out.println("\nTestes com o método   public Object add(int idx, Object x) ");
        System.out.println("Inserindo na pos 2: " + lista.add(2, 101) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 0: " + lista.add(0, 888) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 1: " + lista.add(1, 222) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 5: " + lista.add(5, 111) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 2: " + lista.add(2, 333) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 11 (impossível): " + lista.add(11, 444) + " a lista fica " + lista.toString());
        lista.clear(); System.out.println("Lista limpa com clear() ficou: " + lista.toString());
        System.out.println("Inserindo na pos 11 (impossível): " + lista.add(11, 444) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 1 (impossível): " + lista.add(1, 444) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 0: " + lista.add(0, 444) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 1: " + lista.add(1, 555) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 2: " + lista.add(2, 666) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 0: " + lista.add(0, 333) + " a lista fica " + lista.toString());
        System.out.println("Inserindo na pos 5 (impossível): " + lista.add(5, 777) + " a lista fica " + lista.toString());
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
