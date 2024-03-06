package leituradeumvetor;

import javax.swing.*;

public class LeituraDeUmVetor {

    public static void main(String[] args) {
       new LeituraDeUmVetor();        
    }
    
    public LeituraDeUmVetor() {
        int N;
        float vetor [];  //aqui s� declaramos o vetor
        
        //mas, poder�amos declarar o vetor e tamb�m alocar mem�ria fixa, por exemplo: 
        //    float vetor [] = new float[15];
       
        N = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Quantos valores vc vai digitar?", 
                "Quantidade", JOptionPane.INFORMATION_MESSAGE));
        vetor = new float[N];  //alocamos mem�ria para N valores reais
        
        for(int i=0; i<N; i++) {
            vetor[i] = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite o valor da posi��o " + i, 
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
