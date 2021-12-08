public class Endereco {
    private String cidade;
    private String uf;
    private int numero;
    private String rua;

    public Endereco(){}
    public Endereco(String uf, String cidade, String rua, int numero){
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;              
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public int getNumero() {
        return numero;
    }
    public String getRua() {
        return rua;
    }
    public String getUf() {
        return uf;
    }
    public String getCidade() {
        return cidade;
    }

}
