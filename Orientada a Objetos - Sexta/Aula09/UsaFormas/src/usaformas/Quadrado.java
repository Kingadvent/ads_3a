package usaformas;
public class Quadrado extends Forma {
    // Atributos
    private float base;
    
    //Constructor
    public Quadrado(float b){ base = b; }
    
    // Metodos de Acesso
    public float getBase() { return base; }
    public void setBase(float b) { base = b; }
    
    //sobreposição do metodo da classe Forma
    public float perimetro(){
        return base * 4;
    }
    
    //Implementação dos metodos abstratos da classe Forma
    public float area(){
        return base * base;
    }
    public void mostra(){
        System.out.println("Base: "+ base +"\nPerimetro: "+ perimetro() +"\nArea: "+ area());
    }
}
