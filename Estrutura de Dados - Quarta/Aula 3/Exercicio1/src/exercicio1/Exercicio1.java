package exercicio1;
public class Exercicio1 {

    public static void main(String args[]) {
        new Exercicio1();
    }

    public Exercicio1() {
        double a[] = {10, 20, 30, 40, -10, -20}; //vetor de valores reais
        
        visualizaVetor("Vetor de valores reais", a);
        
        double res = calcularSomaDosElementos(a);
        System.out.println("A soma dos valores do vetor é "+ res);
        
        double res_positivo = calcularSomaDosElementosPositivos(a);
        System.out.println("A soma dos valores do vetor positivo é "+ res_positivo);
    }


    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }
    public double calcularSomaDosElementos(double vet[]) {
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }
    public double calcularSomaDosElementosPositivos(double vet[]) {
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 0){
                soma += vet[i];
            }
        }
        return soma;
    }
}
