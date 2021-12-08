public class Gato extends Felinos {
    private String raca;

    public Gato(){}

    public Gato(String raca){
        super("Animalia","Chordata","Mammalia","Carnivora","Felidae","Felis","Felis Catus", true, "Miado", 67 , 4, 3);
        this.raca = raca;
    }
    public Gato(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean temPelos, String somEmitido, double mesesGestacao, int quantidadeMamas, int metrosMaximoEscala, String raca){
        super(reino, filo, classe, ordem, familia, genero, especie, temPelos, somEmitido, mesesGestacao, quantidadeMamas, metrosMaximoEscala);
        this.raca = raca;
    }

    public void setRaca(String raca){
        this.raca=raca;
    }
    
    public String getRaca(){
        return raca;
    }
}