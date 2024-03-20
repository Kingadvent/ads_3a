package mergepaises;

public class MergePaises {

    String veta[] = { "Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal",
                      "Rússia", "Suécia" };
    String vetb[] = { "Argentina", "Brasil", "Canadá", "Chile", "Dinamarca", "Espanha", 
                      "França", "Inglaterra", "Turquia", "Uruguai", "Zimbawe" };
    String res[] = new String[veta.length + vetb.length];
    
    public static void main(String[] args) {
       new MergePaises(); // EXECUTANDO O METODO CONSTRUTOR DESTA CLASSE
    }
    
    public MergePaises() { // METODO CONSTRUTOR DESSA CLASSE
       mergePaises(veta, vetb, res); // recebemos em res[] os paises funcionandos
       // agora mostrar o vetor fucionando res[] :
       System.out.println("Vetor Desordenado");
       visualizarVetor(res);
       
       ordenarVetor(res);
       System.out.println("Vetor Ordenado");
       visualizarVetor(res);
    }
    
    public boolean ordenarVetor (String vet[]){
        if (vet == null) return false;
        for (int l=0; l<vet.length; l++){
            int trocas = 0;
            for (int i = 0; i<vet.length-1;i++){
                if (vet[i].compareToIgnoreCase(vet[i+1]) > 0){
                    String temp = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = temp;
                    trocas++;
                }
            }
            if(trocas==0) break;
        }
        return true;
    }
    
    public void mergePaises (String a[], String b[], String res[]) {
        int i=0, k=0, j=0;
        String temp[] = new String[res.length];
        
        while(a.length > k) { //ciclo para decidir se pegar de a[]
            //ou de b[] e adiciona em res[]
            temp[k] = a[k];
            k++; // soma do numero adicional temporario ( A )
        }
        
        while(b.length > i) { //ciclo para copiar os possíveis itens
            //remanescentes que ficaram em a[]       
            temp[k] = b[i];
            k++; // soma do numero adicional temporario ( A + B )
            i++; // soma do numero B
        }
        
        while(temp.length > j) {
            res[j] = temp[j];
            j++; // soma do numero TEMPORARIO
        }
    }
    public void visualizarVetor (String vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
            if (i != vet.length - 1) {
                System.out.print(" || ");
            }
        }
        System.out.println();
    }
    
}
