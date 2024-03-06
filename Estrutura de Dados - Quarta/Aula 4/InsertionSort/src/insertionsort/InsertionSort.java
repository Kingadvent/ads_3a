package insertionsort;
public class InsertionSort {
    public static void main(String[] args) {
        // TODO code application logic here
        new InsertionSort();
    }
    public InsertionSort(){
        double a[] = {9.5,6.3,1.2,5.4,0.5,4.3};
        visualizaVetor("Numero: ",a);
        boolean ok = Calculo(a);
        if(ok){
            visualizaVetor("Numero: ",a);
        }
    }
    public boolean Calculo(double vet[]){
        int i,j;
        double x;
        for (i=1; i<vet.length;i++){
            x = vet[i];
            j = i;
            while(j > 0 && x < vet[j-1]){
                vet[j] = vet[j-1];
                j--;
            }
            vet[j] = x;
        }
        return true;
    }
    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }
}
