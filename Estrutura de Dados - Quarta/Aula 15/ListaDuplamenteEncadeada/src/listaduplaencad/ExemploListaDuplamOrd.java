package listaduplaencad;

public class ExemploListaDuplamOrd {

    public static void main(String[] args) {
        DoubleSortedLinkedList<Integer> list = new DoubleSortedLinkedList<Integer>();
        System.out.println("Adicionamos " + list.add(10) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(9) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(7) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(2) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(5) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(1) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(14) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(7) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(15) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(8) + " e a lista fica: " + list.toString());
        System.out.println("Adicionamos " + list.add(3) + " e a lista fica: " + list.toString());
        //System.out.println(list.add(333.0f));   provocaria erro dentro do método add, que retornará null

        System.out.println("Eliminamos o " + list.remove(14) + ":");
        System.out.println(list.toString());
        System.out.println("Eliminamos o " + list.remove(1) + ":");
        System.out.println(list.toString());
        System.out.println("Eliminamos o " + list.remove(15) + ":");
        System.out.println(list.toString());
        System.out.println("Adicionamos " + list.add(0) + ":");
        System.out.println(list.toString());
        System.out.println("Adicionamos " + list.add(35) + ":");
        System.out.println(list.toString());

        if (list.find(9) != -1) {
            System.out.println("Encontramos o 9; a lista continua sendo:");
        }
        System.out.println(list.toString());

        System.out.println("Eliminamos o " + list.remove(10) + ":");
        System.out.println(list.toString());
        System.out.println("Eliminamos o " + list.remove(2) + ":");
        System.out.println(list.toString());
        System.out.println("Tentamos eliminar o 1, retorna " + list.remove(1) + " e fica:");
        System.out.println(list.toString());
        System.out.println("Percorrendo em ordem inversa:");
        System.out.println(list.toStringReverse());
        list.clear();
        System.out.println("Esvaziamos a lista (clear) e ficou: \n" + list.toString());

        System.out.println("\nAgora vamos criar uma lista ordenada, duplamente ligada, com strings");
        DoubleSortedLinkedList listnomes = new DoubleSortedLinkedList();
        listnomes.add("Julio");
        listnomes.add("Ana");
        listnomes.add("Lucas");
        listnomes.add("Betty");
        listnomes.add("Jenildo");
        listnomes.add("Amilton");
        System.out.println(listnomes.toString());
        System.out.println("A lista em ordem reversa:\n" + listnomes.toStringReverse());
        listnomes.clear();
        System.out.println(listnomes.toString());

        System.out.println("\nAgora vamos criar uma lista ordenada, duplamente ligada, ordenada pelos nomes, com objetos da classe Aluno");
        DoubleSortedLinkedList listaAlunos = new DoubleSortedLinkedList();
        listaAlunos.add(new Aluno("999-9", "Mary", 'F', 9.5f));
        listaAlunos.add(new Aluno("111-1", "Luiz", 'M', 6.5f));
        listaAlunos.add(new Aluno("666-6", "Ana", 'F', 9.2f));
        listaAlunos.add(new Aluno("444-4", "Betty", 'F', 9.0f));
        listaAlunos.add(new Aluno("888-8", "Caio", 'M', 5.5f));
        Aluno ada = new Aluno("222-2", "Ada", 'F', 7.5f);
        listaAlunos.add(ada);
        listaAlunos.add(new Aluno("333-3", "Lara", 'F', 7.8f));
        listaAlunos.remove(ada);
        System.out.println(listaAlunos.toString2());
        System.out.println("A lista em ordem reversa:\n" + listaAlunos.toStringReverse2());
        listaAlunos.clear();
        System.out.println(listaAlunos.toString2());
    }

}
