package exercicio02;
public class Triangulo {
    private double Base;
    private double Altura;
    private double Area;

    public Triangulo() {
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public double calculaArea() {
        this.Area = this.Base*this.Altura/2;
        return this.Area;
    }

    public void imprimeDados() {
        System.out.println("Triangulo{" + "Base=" + Base + ", Altura=" + Altura + ", Area=" + Area + '}');
    }

    
    
    
}
