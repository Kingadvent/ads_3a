package exercicio03;
public class Torneio {
    private String Nome;
    private int Idade;

    public Torneio(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    public String verificaCategoria() {
        return "";
    }
    
    public void imprimeDados(){
        System.out.println("Torneio{" + "Nome=" + Nome + ", Idade=" + Idade + '}');
    }
    
    
}
