package exercicio2;
public class Exercicio2 {
    public static void main(String[] args) {
        new Exercicio2();
    }
    public Exercicio2(){
        double a[] = {1.0,2.0,3.0,4.0,5.0};
        visualizaVetor("Vetor de valores reais",a);
        inverter(a,a.length);
    }
    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }
    public void inverter(double vet[], int N){
        int Inicio = 1;
        for (int i = N; i >= 1; i--){
            if (i > Inicio) {
                double I1 = vet[Inicio-1];
                double F1 = vet[i-1];
                vet[Inicio-1] = F1;
                vet[i-1] = I1;
                Inicio += 1;
            }
        }
        visualizaVetor("Vetor de valores reais",vet);
    } 
}
