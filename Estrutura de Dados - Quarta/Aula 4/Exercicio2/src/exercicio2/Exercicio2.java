package exercicio2;
public class Exercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        new Exercicio2();
    }
    public Exercicio2(){
        double a[] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61 };
        visualizaVetor("Valores: ",a);
        
        CalculoMaior(a);
        visualizaVetor("Maior ao Menor: ",a);
        
        CalculoMenor(a);
        visualizaVetor("Menor ao Maior: ",a);
    }
    public void CalculoMenor(double vet[]){
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
    }
    public void CalculoMaior(double vet[]){
        int i,j;
        double x;
        for (i=1; i<vet.length;i++){
            x = vet[i];
            j = i;
            while(j > 0 && x > vet[j-1]){
                vet[j] = vet[j-1];
                j--;
            }
            vet[j] = x;
        }
    }
    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
        System.out.println();
    }
}
