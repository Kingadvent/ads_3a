package leituradeumvetor;
import java.util.Scanner;

public class LeituraDeUmVetor {

    public static void main(String[] args) {
        new LeituraDeUmVetor();
    }

    public LeituraDeUmVetor() {
        int N;
        double vetor[]; //apenas declaramos o vetor (sem alocar memória)

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que serão digitados: ");
        N = sc.nextInt();
        vetor = new double[N];  //alocamos memória para N valores reais

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextDouble();
        }

        String str = "";
        for (int i = 0; i < N; i++) {
            str += "posição " + i + ":  " + vetor[i] + "\n";
        }
        System.out.println("\nValores armazenados no vetor: \n" + str);
    }

}
