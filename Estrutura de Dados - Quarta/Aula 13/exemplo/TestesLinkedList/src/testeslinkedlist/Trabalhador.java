package testeslinkedlist;

public class Trabalhador {
    private String nome;
    private float salario;

    public Trabalhador(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "nome=" + nome + ", salario=R$" + salario + '}';
    }
    
    public int compareTo(Trabalhador outro) {
        if(getNome().compareToIgnoreCase(outro.getNome()) < 0) return -1;
        if(getNome().compareToIgnoreCase(outro.getNome()) == 0) return 0;
        else return 1;
    }
    
}
