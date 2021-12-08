public class Cachorro extends Caninos
{
    private String raca;

    public Cachorro(){}

    public Cachorro(String raca){
        super("Animalia","Chordata","Mammalia","Carnivora","Canidae","Canis","Cachorro", true, "Latido", 68 , 5, "Sim");
        this.raca = raca;
    }
    public Cachorro(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean temPelos, String somEmitido, double mesesGestacao, int quantidadeMamas, String capacidadeFarejar, String raca){
        super(reino,filo,classe,ordem,familia,genero,especie, temPelos, somEmitido, mesesGestacao, quantidadeMamas,capacidadeFarejar);
        this.raca=raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }

    public String getRaca(){
        return raca;
    }
}
