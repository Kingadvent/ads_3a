package listaduplaencad;

public class Node {
	private Object value;       // dado a ser armazenado no nó
	private Node prev, next;    // referências para acessar o próximo nó e o nó anterior
    
        public String toString () {
            return value.toString();
        }
        
	//Devolve o conteúdo do nó
	public Object getValue() {
		return value;
	}

	//Atribui um valor ao conteúdo do nó
	public void setValue(Object novovalor) {
		value = novovalor;
	}

	//Devolve a referência do próximo nó
	public Node getNext() {
		return next;
	}

	//Atribui uma referência para o próximo nó
	public void setNext(Node prox) {
		next = prox;
	}

        //Devolve a referência do nó anterior
        public Node getPrev() {
            return prev;
        }

        //Atribui uma referência para o nó anterior
        public void setPrev(Node prev) {
            this.prev = prev;
        }
}