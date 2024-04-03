package interfaceclasse;

interface Operacoes { 
    //uma interface como lista de operações, apenas "declaramos" 
    //os métodos (eles serão "definidos" depois, em uma classe)
    public float soma(float a, float b);
    public float media(float a, float b, float c);
}

class OperacoesDefinidas implements Operacoes {
    //esta classe "define" os métodos que foram "declarados" na interface Operacoes
    public float soma(float a, float b){
        return(a+b);
    }
    
    public float media(float a, float b, float c){
      float media;
      media = (a+b+c)/3.0f;
      return media;
    }
}

public class InterfaceClasse {

    public static void main(String[] args) {
        OperacoesDefinidas op = new OperacoesDefinidas();
        System.out.println(op.soma(2.0f, 3.0f));
        System.out.println(op.media(2.0f, 3.0f, 4.0f));
    }
    
}
