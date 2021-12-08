public class Endereco {
    private String pais;
    private String cidade;
    private String uf;
    private String bairro;
    private String rua;

    public Endereco(){}
    public Endereco(String pais, String uf, String bairro, String rua, String cidade){
        this.pais = pais;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getBairro() {
        return bairro;
    }
    public String getPais() {
        return pais;
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
