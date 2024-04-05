package exercicio01;
public class Paciente {
    public String Nome;
    public String Rg;
    public String Endereco;
    public String Telefone;
    public int Nascimento;
    public String Profissao;

    public Paciente() {
    }

    public Paciente(String Nome) {
        this.Nome = Nome;
    }

    public Paciente(String Nome, String Rg, String Endereco, String Telefone, int Nascimento, String Profissao) {
        this.Nome = Nome;
        this.Rg = Rg;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Nascimento = Nascimento;
        this.Profissao = Profissao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getNascimento() {
        return Nascimento;
    }

    public void setNascimento(int Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissao) {
        this.Profissao = Profissao;
    }
    
    
    
    public void cadastrarDados() {
        
    }

    public void imprimeDados() {
        System.out.println("Paciente{" + "Nome=" + Nome + ", Rg=" + Rg + ", Endereco=" + Endereco + ", Telefone=" + Telefone + ", Nascimento=" + Nascimento + ", Profissao=" + Profissao + '}');
    }
    
    public int calculaIdade(int anoatual) {
        return anoatual-Nascimento;
    } 
    
    
}
