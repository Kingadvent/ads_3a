package leituradeumvetor;

import javax.swing.*;

public class LeituraDeUmVetor {

    public static void main(String[] args) {
       new LeituraDeUmVetor();        
    }
    
    public LeituraDeUmVetor() {
        int N;
        float vetor [];  //aqui só declaramos o vetor
        
        //mas, poderíamos declarar o vetor e também alocar memória fixa, por exemplo: 
        //    float vetor [] = new float[15];
       
        N = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Quantos valores vc vai digitar?", 
                "Quantidade", JOptionPane.INFORMATION_MESSAGE));
        vetor = new float[N];  //alocamos memória para N valores reais
        
        for(int i=0; i<N; i++) {
            vetor[i] = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite o valor da posição " + i, 
                "Quantidade", JOptionPane.INFORMATION_MESSAGE));
        }
        
        String str = "";
         for(int i=0; i<N; i++) {
             str += "pos. " + i + ":   " + vetor[i] + "\n";
         }
         JOptionPane.showMessageDialog(null, str, "Valores do vetor", 
                 JOptionPane.INFORMATION_MESSAGE);
    }
    
}
