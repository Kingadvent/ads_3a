package projetorevisao;

import java.util.Arrays;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;
    
    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    public void adicionar(Object elemento)throws Exception{
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elementos;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor ja esta cheio. " + "não é possivel adicionar novos elementos");
        }
    }
    
    public int tamanho() {
        return this.tamanho;
    }
    
    public void aumentaCapacidade() {
        
    }
}
