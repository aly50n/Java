public abstract class Caninos extends Mamifero {
   
    private String capacidadeFarejar;
    
    public Caninos(){}
    
    public Caninos(String reino, String filo,String classe, String ordem, String familia, String genero, String especie, boolean temPelos, String somEmitido, double mesesGestacao, int quantidadeMamas, String capacidadeFarejar){
        super(reino,filo,classe,ordem,familia,genero,especie, temPelos, somEmitido, mesesGestacao, quantidadeMamas);
        this.capacidadeFarejar = capacidadeFarejar;
    }
    public void setCapacidadeFarejar(String capacidadeFarejar) {
        this.capacidadeFarejar = capacidadeFarejar;
    }
    public String getCapacidadeFarejar() {
        return capacidadeFarejar;
    }
    public void setSomEmitido (){ 
        super.somEmitido = "Latido";
    }
    
    public void setMesesGestacao(){
        super.mesesGestacao = 6;
    }
}
