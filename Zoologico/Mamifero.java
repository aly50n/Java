public abstract class Mamifero extends Animal {

    private int quantidadeMamas;
    private boolean temPelos;
    protected String somEmitido;
    protected double mesesGestacao;

    public Mamifero(){}

    public Mamifero(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean temPelos, String somEmitido, double mesesGestacao, int quantidadeMamas){
        super(reino,filo,classe,ordem,familia,genero,especie);
        this.quantidadeMamas = quantidadeMamas;
        this.temPelos = temPelos;
        this.somEmitido = somEmitido;
        this.mesesGestacao = mesesGestacao;
    }

    public void setQuantidadeMamas(int quantidadeMamas) {
        this.quantidadeMamas = quantidadeMamas;
    }
    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }
    public int getQuantidadeMamas(){
        return this.quantidadeMamas;
    }

    public void setSomEmitido (){ 
        this.somEmitido = "";
    }

    public double getMesesGestacao(){
        return this.mesesGestacao;
    }

    public void setMesesGestacao(){
        this.mesesGestacao = 0;
    }

    public String getSomEmitido(){
        return somEmitido;
    }
    public boolean isTemPelos() {
        return temPelos;
    }
}
