package exercicio01a;
public class Funcionario {
    private int Cracha;
    private float Salario;
    private String Cargo;

    public Funcionario() {
    }

    public Funcionario(int Cracha, float Salario, String Cargo) {
        this.Cracha = Cracha;
        this.Salario = Salario;
        this.Cargo = Cargo;
    }
    
    public void calculaAumento(float porcentagem) {
        Salario = Salario + (Salario * (porcentagem/100));
        System.out.println("Salario aumentado em $" + (Salario * (porcentagem/100)));
    }
    
    public void calculaAumentoTempo(int tempo) {
        Salario = Salario + (tempo*150);
        System.out.println("Salario Aumentado em $"+ (tempo*150));
    }
    
    
}
