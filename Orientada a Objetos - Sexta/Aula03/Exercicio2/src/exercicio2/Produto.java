
package exercicio2;
public class Produto {
    String marca;
    String fabricante;
    String cod_barra;
    float preco;
    
    Produto(){
        System.out.println("Construtor adicional");
    }
    
    Produto(String m, String f, String c, float p){
        marca = m;
        fabricante = f;
        cod_barra = c;
        preco = p;
    }
    
}
