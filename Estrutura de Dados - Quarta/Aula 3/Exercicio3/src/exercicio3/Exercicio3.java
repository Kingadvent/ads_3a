
package exercicio3;

import java.util.ArrayList;

public final class Exercicio3 {
    public static void main(String[] args) {
        new Exercicio3();
    }
    public Exercicio3(){
        ArrayList lista = new ArrayList();
        lista.add(1.0f); lista.add(2.0f); lista.add(3.0f);
        
        lista = inverter(lista);
        visualizarArrayList(lista);
    }
    public void visualizarArrayList(ArrayList lista){
        for (int i=0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " || ");
        }
        System.out.println("");
    }
    public ArrayList inverter(ArrayList lista){
        int N = lista.size();
        ArrayList listaTemp = new ArrayList();
        
        int Inicio = 1;
        for (int i = N; i > 1; i--){
            listaTemp.add(lista.get(i-1));
            lista.remove(i-1);
            Inicio += 1;
        }
        listaTemp.add(lista.get(0));
        lista.clear();
        
        for (int i=0; i < listaTemp.size(); i++){
            lista.add(listaTemp.get(i));
        }
        
        return lista;
    } 
    
}
