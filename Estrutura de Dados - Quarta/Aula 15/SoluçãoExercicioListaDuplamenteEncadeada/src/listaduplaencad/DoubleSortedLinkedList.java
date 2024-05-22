package listaduplaencad;

class DoubleSortedLinkedList<E> {

    private Node head, tail; 

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    //Inicializa uma Lista no estado vazia (construtor)
    public DoubleSortedLinkedList() {   // O(1)
        head = null;
        tail = null;
    }

    //Verifica se a lista está vazia
    public boolean isEmpty() {   // O(1)
        return (getHead() == null);
    }

    //Insere um elemento na Lista Ordenada
    public Object add(Comparable x) {    // O(n)
        if (x == null) {
            return null;
        }
        try {
            Node novo = new Node();
            Node aux;
            novo.setValue(x);
            //Se a lista estiver vazia ou o elemento for menor que o primeiro:
            if (isEmpty() || x.compareTo((E) head.getValue()) < 0) {
                if (!isEmpty()) {
                    head.setPrev(novo);
                } else {
                    tail = novo;
                }
                novo.setNext(head);
                novo.setPrev(null);
                head = novo;
            } else {  //casos restantes - inserir no meio ou no final: 
                aux = head;
                while (aux.getNext() != null && x.compareTo(aux.getNext().getValue()) > 0) {
                    aux = aux.getNext();
                }
                novo.setNext(aux.getNext());
                if (aux.getNext() == null) {
                    tail = novo; //caso seja inserido no final
                } else {
                    aux.getNext().setPrev(novo);
                }
                aux.setNext(novo);
                novo.setPrev(aux);
            }
            return x;
        } catch (Exception exMem) {
            return null;
        }
    }

    //Remove um elemento da lista
    public Object remove(Comparable x) {    // O(n)
        Node antes = null, depois = null;
        //Se elemento nulo, lista vazia ou o elemento for menor que o primeiro:
        if (x == null || isEmpty() || x.compareTo(getHead().getValue()) < 0) {
            return null;
        } else {
            if (x.compareTo(getHead().getValue()) == 0) { //se for o primeiro elemento	
                Node temp = getHead();
                head = getHead().getNext();
                if (getHead() == null) {
                    tail = null; //porque foi eliminado o unico
                } else {
                    head.setPrev(null);
                }
                temp.setNext(null);
                temp = null;  //liberamos memória
                return x;
            } else { //Se for maior que o primeiro, entao tentar achar a posicao:
                antes = getHead();
                depois = getHead().getNext();
                //Navega para a posicao onde se encontra o valor buscado:
                while (depois != null && x.compareTo(depois.getValue()) > 0) {
                    antes = antes.getNext(); //avancamos ponteiro
                    depois = depois.getNext();  //avancamos ponteiro
                }
                //Verificamos se encontrou ou chegou no final da lista:
                if (depois != null && x.compareTo(depois.getValue()) == 0) {
                    antes.setNext(depois.getNext());
                    if (antes.getNext() == null) {
                        tail = antes; //porque foi eliminado o ultimo
                    }
                    if (depois.getNext() != null) {
                        depois.getNext().setPrev(antes);
                    }
                    depois.setNext(null);
                    depois = null;  //liberamos memoria
                    return x;
                } else {
                    return null; //Nao encontrou o elemento					
                }
            }
        }
    }

    //Buscar um objeto na lista e retornar a posicao onde encontrou
    public int find(Comparable x) {
        if (x == null) return -1;
        //navegamos para o nodo de interesse:
        Node aux = head;
        int pos = 0;
        while (aux != null && x.compareTo(aux.getValue()) > 0) {
            aux = aux.getNext();
            pos++;
        }
        //se achamos o elemento:
        if (aux != null && x.compareTo(aux.getValue()) == 0) {
            return pos;
        } else {
            return -1; //nao encontramos o objeto x
        }
    }

    //Destruir (limpar) uma lista ordenada
    public void clear() {     // O(n)
        Node aux = getHead();
        while (aux != null) {
            Node temp = aux;
            aux = aux.getNext(); //avancar o ponteiro aux
            temp.setNext(null);
            temp = null; //liberar memoria
        }
        head = null;
    }

    //Retorna os objetos da Lista
    public String toString() {    // O(n)
        if (!isEmpty()) {
            Node aux;
            aux = getHead();
            String saida = "";
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) {
                    saida += ", ";
                }
            }
            return "Lo: [" + saida + "]";
        } else {
            return "Lo: []";
        }
    }

    //Retorna os objetos da Lista
    public String toString2() {    // O(n)
        if (!isEmpty()) {
            Node aux;
            aux = getHead();
            String saida = "";
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) {
                    saida += "\n";
                }
            }
            return "Lo: [\n" + saida + "\n]";
        } else {
            return "Lo: []";
        }
    }

    //Retorna os objetos da lista duplamente ligada, em ordem reversa
    public String toStringReverse() {    // O(n)
        if (!isEmpty()) {
            Node aux = getTail();
            String saida = "";
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getPrev();
                if (aux != null) {
                    saida += ", ";
                }
            }
            return "LoInv: [" + saida + "]";
        } else {
            return "LoInv: []";
        }
    }

    //Retorna os objetos da lista duplamente ligada, em ordem reversa
    public String toStringReverse2() {    // O(n)
        if (!isEmpty()) {
            Node aux = getTail();
            String saida = "";
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getPrev();
                if (aux != null) {
                    saida += "\n";
                }
            }
            return "LoInv: [\n" + saida + "\n]";
        } else {
            return "LoInv: []";
        }
    }

}
