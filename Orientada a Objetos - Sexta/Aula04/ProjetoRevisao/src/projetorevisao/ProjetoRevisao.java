package projetorevisao;
public class ProjetoRevisao {
    public static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(5);
        
        Contato c1 = new Contato("Vanderley","1234-5678","vanderley@gmail.com");
        Contato c2 = new Contato("Vanderley","1234-5678","vanderley@gmail.com");
        Contato c3 = new Contato("Vanderley","1234-5678","vanderley@gmail.com");
        
        
        try{
            vetor.adicionar(c1);
            vetor.adicionar(c2);
            vetor.adicionar(c3);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Tamanho do Vetor: "+ vetor.tamanho());
        System.out.println(vetor);
    }
    
}
