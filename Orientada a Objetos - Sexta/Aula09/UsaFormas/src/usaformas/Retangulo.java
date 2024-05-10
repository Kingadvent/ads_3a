package usaformas;
public class Retangulo extends Triangulo {
    //Atributos
    
    //Constructor
    public Retangulo(float b, float a) {
        super(b,a);
    }
    
    //Metodos de acesso
    
    //sobreposição do metodo da classe Forma
    public float perimetro() {
        return (super.getBase() * super.getAltura())*2;
    }
    
    //Implementação dos metodos abstratos de classe Forma
    public float area() {
        return super.getBase() * super.getAltura();
    }
    public void mostra() {
        System.out.println("Base: "+ super.getBase() +"\nAltura: "+ super.getAltura() +"\nPerimetro: "+ perimetro() +"\nArea: "+ area());
    }
    
    
}
