public abstract class Felinos extends Mamifero{
    private int metrosMaximoEscala;
    
    public Felinos(){}
    
    public Felinos(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean temPelos, String somEmitido, double mesesGestacao, int quantidadeMamas, int metrosMaximoEscala){
        super(reino,filo,classe,ordem,familia,genero,especie, temPelos, somEmitido, mesesGestacao, quantidadeMamas);
        this.metrosMaximoEscala = metrosMaximoEscala;
    }
    public void setMetrosMaximoEscala(int metrosMaximoEscala) {
        this.metrosMaximoEscala = metrosMaximoEscala;
    }
    public int getMetrosMaximoEscala() {
        return metrosMaximoEscala;
    }
    public void setSomEmitido (){ 
        super.somEmitido = "Miado";
    }
    
    public void setMesesGestacao(){
        super.mesesGestacao = 3;
    }
}
