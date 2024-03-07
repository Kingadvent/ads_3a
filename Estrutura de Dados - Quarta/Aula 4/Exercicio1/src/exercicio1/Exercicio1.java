
package exercicio1;
public class Exercicio1 {
    public static void main(String[] args) {
        new Exercicio1();
    }
    public Exercicio1(){
        String paises[] = {"México", "Paraguia", "Israel", "Equador", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        visualizaVetor("Vetores em paises em ordem aleatoria",paises);
        calculo(paises);
        visualizaVetor("Vetores em paises em ordem alfabetica",paises);
    }
    public void visualizaVetor(String mensagem, String vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }
    public boolean calculo(String vet[]){
        if (vet == null) return false;
        for (int l=0; l<vet.length-1;l++){
            int trocas = 0;
            for (int i=0; i<vet.length-1;i++){
                if (vet[i].compareToIgnoreCase(vet[i+1]) > 0){
                    String temp = vet[i];
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
