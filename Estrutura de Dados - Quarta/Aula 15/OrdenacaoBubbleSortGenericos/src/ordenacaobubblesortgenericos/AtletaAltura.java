package ordenacaobubblesortgenericos;

public class AtletaAltura extends Atleta {
    
    private float salto1;
    private float salto2;
    private float salto3;

    /**
     * @return the salto1
     */
    public float getSalto1() {
        return salto1;
    }

    /**
     * @param salto1 the salto1 to set
     */
    public void setSalto1(float salto1) {
        this.salto1 = salto1;
    }

    /**
     * @return the salto2
     */
    public float getSalto2() {
        return salto2;
    }

    /**
     * @param salto2 the salto2 to set
     */
    public void setSalto2(float salto2) {
        this.salto2 = salto2;
    }

    /**
     * @return the salto3
     */
    public float getSalto3() {
        return salto3;
    }

    /**
     * @param salto3 the salto3 to set
     */
    public void setSalto3(float salto3) {
        this.salto3 = salto3;
    }

    public AtletaAltura() {
        
        this.nome = "";
        this.pais = "";
        this.sexo = "".charAt(0);
        this.salto1 = 0.0f;
        this.salto2 = 0.0f;
        this.salto3 = 0.0f;
        
    }
    
    public AtletaAltura(String nome, String pais, String sexo, float salto1, float salto2, float salto3) {
        this.nome = nome;
        this.pais = pais;
        this.sexo = sexo.charAt(0);
        this.salto1 = salto1;
        this.salto2 = salto2;
        this.salto3 = salto3;
    }

    public String toString() {
        return "Atleta de salto em altura " + " - nome: " + nome + ", país: " + pais + ", sexo: " + sexo + ", salto1: " + salto1 
                + ", salto2: " + salto2 + ", salto3: " + salto3;
    }
    
    
    
}
