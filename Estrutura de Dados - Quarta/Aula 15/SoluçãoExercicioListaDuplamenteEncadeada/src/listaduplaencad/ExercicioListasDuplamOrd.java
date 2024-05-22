package listaduplaencad;

public class ExercicioListasDuplamOrd {

    public static void main(String[] args) {

        System.out.println("\nPrimeira turma, em lista ordenada, duplamente ligada, ordenada pelos nomes, com objetos da classe Aluno");
        DoubleSortedLinkedList listaAlunos1 = new DoubleSortedLinkedList();
        listaAlunos1.add(new Aluno("999-9", "Mary", 'F', 9.5f));
        listaAlunos1.add(new Aluno("111-1", "Luiz", 'M', 4.5f));
        listaAlunos1.add(new Aluno("666-6", "Ana", 'F', 9.2f));
        listaAlunos1.add(new Aluno("444-4", "Betty", 'F', 9.0f));
        listaAlunos1.add(new Aluno("888-8", "Carlos", 'M', 5.5f));
        listaAlunos1.add(new Aluno("333-3", "Lara", 'F', 7.8f));
        System.out.println(listaAlunos1.toString2());
        System.out.println("\nSegunda turma, em lista ordenada, duplamente ligada, ordenada pelos nomes, com objetos da classe Aluno:");
        DoubleSortedLinkedList listaAlunos2 = new DoubleSortedLinkedList();
        listaAlunos2.add(new Aluno("900-0", "Renata", 'F', 2.5f));
        listaAlunos2.add(new Aluno("100-0", "Caio", 'M', 5.3f));
        listaAlunos2.add(new Aluno("200-0", "Luana", 'F', 8.3f));
        listaAlunos2.add(new Aluno("300-0", "Alcides", 'M', 1.0f));
        listaAlunos2.add(new Aluno("400-0", "Amilton", 'M', 9.5f));
        listaAlunos2.add(new Aluno("001-0", "Ernestina", 'F', 7.8f));
        listaAlunos2.add(new Aluno("002-0", "Giselle", 'F', 3.8f));
        System.out.println(listaAlunos2.toString2());

        System.out.println("\nTerceira lista ordenada, duplamente ligada, ordenada pelos nomes, com os alunos reprovados das duas turmas:");
        DoubleSortedLinkedList listaAlunos3 = new DoubleSortedLinkedList();
        Node aux = listaAlunos1.getHead();
        while (aux != null) {
            Aluno alun = (Aluno) aux.getValue();
            if (alun.getMedia() < 6.0f) {
                listaAlunos3.add(alun);
            }
            aux = aux.getNext();
        }
        aux = listaAlunos2.getHead();
        while (aux != null) {
            Aluno alun = (Aluno) aux.getValue();
            if (alun.getMedia() < 6.0f) {
                listaAlunos3.add(alun);
            }
            aux = aux.getNext();
        }
        System.out.println(listaAlunos3.toString2());
        System.out.println("Agora em ordem inversa:");
        System.out.println(listaAlunos3.toStringReverse2());
    }

}
