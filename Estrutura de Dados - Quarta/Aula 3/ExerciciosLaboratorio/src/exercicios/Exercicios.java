package exercicios;
public class Exercicios {

    public static void main(String args[]) {
        new Exercicios();
    }

    public Exercicios() {
        double a[] = {10, 20, 30, 40, -10, -20}; //vetor de valores reais
        /*
        //A forma compacta anterior: 1) declara um vetor, 2) aloca memória  
        //para o vetor e, também, c) coloca valores no vetor.
        //Poderíamos fazer em etapas:
            double a[]; //declarar o vetor
            a = new double[6]; //alocar memória para guardar 6 elementos
            a[0] = 10; //colocamos um valor na posição 0 do vetor
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = -10;
            a[5] = -20; //colocamos um valor na posição 5 do vetor
        //Ou poderíamos ler dados digitados pelo usuários (veja outros
        //exemplos desta aula).
        */
        visualizaVetor("Vetor de valores reais", a);
        //calcularSomaDosElementos(a);
        //calcularSomaDosElementosPositivos(a);
    }


    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }

}
