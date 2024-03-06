package buble;
public final class Buble {
    public static void main(String[] args) {
        // TODO code application logic here
        new Buble();
    }
    public Buble(){
        double a[] = {85.0,15.0,50.0,42.0,39.0,7.0};
        visualizaVetor("Vetor de valores reais",a);
        boolean ok = bubblesis(a);
        if (ok) {
            visualizaVetor("Vetor de valores reais",a);
        }
    }
    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }
    public boolean bubblesis(double vet[]){
        if (vet == null) return false;
        for (int l=0; l<vet.length-1;l++){
            int trocas = 0;
            for (int i=0; i<vet.length-1;i++){
                if (vet[i] > vet[i+1]){
                    double temp = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = temp;
                    trocas++;
                }
            }
            if(trocas==0)break;
        }
        return true;
    }
}
