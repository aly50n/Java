import java.io.Serializable;
import java.util.Collection;

public abstract class Animal implements Serializable {
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;
    private Collection<Localizacao> localizacao;

    public Animal(){}
    public Animal(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, Collection<Localizacao> localizacao){
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie= especie;
        this.localizacao = localizacao;
    }
    public Animal(String reino, String filo,String classe, String ordem, String familia, String genero, String especie){
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie= especie;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public void setFilo(String filo) {
        this.filo = filo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }
    public String getClasse() {
        return classe;
    }
    public String getEspecie() {
        return especie;
    }
    public String getFamilia() {
        return familia;
    }
    public String getFilo() {
        return filo;
    }
    public String getGenero() {
        return genero;
    }
    public String getOrdem() {
        return ordem;
    }
    public void setReino (String reino){ 
        this.reino = reino;
    }

    public String getReino(){
        return reino;
    }
    public void setLocalizacao(Collection<Localizacao> localizacao) {
        this.localizacao = localizacao;
    }
    public Collection<Localizacao> getLocalizacao() {
        return localizacao;
    }
}
