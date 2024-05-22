package pilha1;

class Pilha <E> { //usando uma classe genérica: a pilha armazenará elementos do tipo E
        private Node topo = null;
	
        public Pilha() {   
            topo = null;
        }
        
        public Node push(E novo) {
            try {
                if(novo == null) return null; //não permitimos novo objeto nulo
                Node nodo = new Node();
                nodo.setValue(novo);
                nodo.setNext(null);
                if (topo == null) { 
                    topo = nodo;
                }
                else {
                    nodo.setNext(topo);    
                    topo = nodo;
                }
                return nodo;
            } catch(Exception ex) {
                    return null;  // memória insuficiente
            }             
        }

        public E pop() {
            if (topo == null) return null;
            E value = (E) topo.getValue();
            Node temp = topo;
            topo = topo.getNext();
            temp.setNext(null); temp = null;  // para agilizar a liberação de memória
            return value;
        }
        
        public boolean isEmpty() {
            if(topo == null) return true; else return false;
        }
        
        public E top() {
            if(topo == null) return null; else return (E)topo.getValue();
        }
        
        public String toString() { 
        //Este método retorna os itens guardados na pilha, com a convenção p: [ a, b, c, topo ]
            if( !isEmpty() ) {
              String resp = "";
              Node aux = topo;
              while(aux!=null) {            
                resp = aux.getValue().toString() + resp;
                aux = aux.getNext();
                if(aux != null)resp = ", " + resp;
              }
              return ( "p: [ " + resp + " ]"  );
            }
            else return (  "p: [ ]"  );           
        }        
}

