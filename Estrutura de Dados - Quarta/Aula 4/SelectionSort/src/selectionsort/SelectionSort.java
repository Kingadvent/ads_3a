package selectionsort;
public class SelectionSort {
    public static void main(String[] args) {
        new SelectionSort();
    }
    public SelectionSort(){
        double a[] = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        visualizaVetor("Vetor de valores reais",a);
        boolean ok = Calculo(a);
        if(ok){
            visualizaVetor("Vetor de valores reais",a);
        }
    }
    public boolean Calculo(double vet[]){
        if (vet==null) return false;
        for (int i=0; i<vet.length-1;i++){
            int posMenor = i;
            double menor = vet[i];
            for (int j=i+1; j<vet.length;j++){
                if (vet[j] < menor){
                    posMenor = j;
                    menor = vet[j];
                }
            }
            // Troca de valores;
            double temp = vet[i];
            vet[i] = menor;
            vet[posMenor] = temp;
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
