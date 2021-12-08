import java.util.Collection;

public abstract class Aves extends Animal{
    private boolean voa;
    private String plumagem;

    public Aves(){}
    public Aves(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean voa, String plumagem){
        super(reino,filo,classe,ordem,familia,genero,especie);
        this.voa = voa;
        this.plumagem = plumagem;
    }
    public Aves(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean voa, String plumagem, Collection<Localizacao> localizacao){
        super(reino,filo,classe,ordem,familia,genero,especie,localizacao);
        this.voa = voa;
        this.plumagem = plumagem;
    }

    public void setPlumagem(String plumagem) {
        this.plumagem = plumagem;
    }
    public void setVoa(boolean voa) {
        this.voa = voa;
    }
    public String getPlumagem() {
        return plumagem;
    }
    public boolean isVoa() {
        return voa;
    }

}
