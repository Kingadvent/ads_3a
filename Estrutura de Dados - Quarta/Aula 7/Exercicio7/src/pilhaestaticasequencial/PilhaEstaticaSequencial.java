package pilhaestaticasequencial;

import javax.swing.JOptionPane;

public class PilhaEstaticaSequencial {
    private Pilha p = null;  //atributo da classe
    
    public static void main(String[] args) {
        new PilhaEstaticaSequencial();
    }
    
    public PilhaEstaticaSequencial() {
       simulacaoLeituraDeDados();      
       System.out.println("Pilha inicial:");
       System.out.println( p.toString() );     
       System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           System.out.println(p.pop());
       }
       if ( p.isEmpty() ) System.out.println("Impossível retirar da pilha. Pilha vazia.");     
       //ou:  if ( p.pop()==null ) System.out.println("Impossível retirar da pilha. Pilha vazia.");  
    }
    
    public void simulacaoLeituraDeDados() {
        //para efetuar teste rápidos, criamos uma pilha com dados fixos:
        p = new Pilha(120);
        
        p.push( new Veiculo("012-ABCD","Hyundai","HB20",2018) );
    }

    public void leituraDeDados () {
        String umPlaca; String umModelo;  String umaMarca; int umAno;
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de veiculos:"));
        p = new Pilha(N);   //aloca memória para a pilha
        for (int i=0; i<N; i++){
            umPlaca = JOptionPane.showInputDialog("Digite a placa do carro: ");
            umModelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
            umaMarca = JOptionPane.showInputDialog("Digite a marca do carro: ");
            umAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
            p.push( new Veiculo(umPlaca, umModelo, umaMarca, umAno) ); //aloca memória para o objeto (e executa o método construtor com parâmetros)
        }
    }
    
}
