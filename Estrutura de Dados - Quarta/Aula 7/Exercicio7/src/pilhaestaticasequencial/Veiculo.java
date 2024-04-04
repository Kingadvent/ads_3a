package pilhaestaticasequencial;
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    
    public Veiculo(){
      placa = "000-AAAA";
      marca = "-";
      modelo = "-";
      ano = 0;
   }
    
    public Veiculo(String pPlaca, String pMarca, String pModelo, int pAno) {
      setPlaca(pPlaca);
      setMarca(pMarca);
      setModelo(pModelo);
      setAno(pAno);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + '}';
    }
    
    
    
    
}
