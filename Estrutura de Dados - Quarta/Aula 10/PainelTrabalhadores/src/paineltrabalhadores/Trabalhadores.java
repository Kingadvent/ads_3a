package paineltrabalhadores;
public class Trabalhadores {
    private String Nome;
    private float Salario;
    private String Cargo;

    public Trabalhadores() {
    }

    public Trabalhadores(String Nome, float Salario, String Cargo) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.Cargo = Cargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "\n Nome: " + Nome + "\n Salario: " + Salario + "\n Cargo: " + Cargo + "\n";
    }
    
    
    
}
