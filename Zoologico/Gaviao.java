public class Gaviao extends Aves {
    private String tamanhoGarras;
    private String raca;

    public Gaviao(){}
    public Gaviao(String plumagem, String tamanhoGarras, String raca){
        super("Animalia", "Chordata", "Aves", "Falconiformes", "Accipitridae", "Gyps", "Falcao", true, plumagem);
        this.tamanhoGarras= tamanhoGarras;
        this.raca = raca;
    }
    public Gaviao(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean voa, String plumagem, String tamanhoGarras, String raca){
        this.tamanhoGarras= tamanhoGarras;
        this.raca=raca;
    }
    
    public void setTamanhoGarras(String tamanhoGarras) {
        this.tamanhoGarras = tamanhoGarras;
    }
    public String getTamanhoGarras() {
        return tamanhoGarras;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }
}
