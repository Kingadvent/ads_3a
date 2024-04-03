package filaestaticasequencial;

import java.util.Stack;

public class FilaEstaticaSequencial {

    public static void main(String[] args) {
        Queue f = new Queue(); // uma fila
        Stack p = new Stack(); // uma pilha
        
        // estado iniciais:
        //p: [a,b,c]   e   f: [d,e,h]
        p.push("a");
        p.push("b");
        p.push("c");
        
        f.enqueue("d");
        f.enqueue("e");
        f.enqueue("h");
        
        // comandos:
        p.push("w");
        f.enqueue("t");
        f.enqueue(p.pop());
        p.push(f.dequeue());
        p.push(f.peek());
        
        System.out.println(f.toString());
        System.out.println("P:  "+ p.toString());
    }

    
}
