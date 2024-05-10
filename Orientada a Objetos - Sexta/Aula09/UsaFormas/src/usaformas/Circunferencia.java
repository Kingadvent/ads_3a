package usaformas;
public class Circunferencia extends Forma {
    // Atributos
    private float raio;
    
    //Constructor
    public Circunferencia(float r) { raio = r; }
    
    // Metodos de Acesso
    public float getCircunferencia() { return raio; }
    public void setCircunferencia(float r) { raio = r; }
    
    //sobreposição do metodo da classe Forma
    public float perimetro(){
        return (float) (2*Math.PI*raio);
    }
    
    //Implementação dos metodos abstratos da classe Forma
    public float area(){
        return (float) (Math.PI*(raio*raio));
    }
    public void mostra(){
        System.out.println("Raio: "+ raio +"\nPerimetro: "+ perimetro() +"\nArea: "+ area());
    }
    
}
