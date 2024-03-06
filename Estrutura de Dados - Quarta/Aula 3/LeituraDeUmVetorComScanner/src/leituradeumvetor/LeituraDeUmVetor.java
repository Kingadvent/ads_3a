package leituradeumvetor;
import java.util.Scanner;

public class LeituraDeUmVetor {

    public static void main(String[] args) {
        new LeituraDeUmVetor();
    }

    public LeituraDeUmVetor() {
        int N;
        double vetor[]; //apenas declaramos o vetor (sem alocar mem�ria)

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que ser�o digitados: ");
        N = sc.nextInt();
        vetor = new double[N];  //alocamos mem�ria para N valores reais

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posi��o " + i + ": ");
            vetor[i] = sc.nextDouble();
        }

        String str = "";
        for (int i = 0; i < N; i++) {
            str += "posi��o " + i + ":  " + vetor[i] + "\n";
        }
        System.out.println("\nValores armazenados no vetor: \n" + str);
    }

}
