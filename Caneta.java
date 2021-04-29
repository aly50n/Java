public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    private int carga;
    protected boolean tampada;
    
    public Caneta(){}
    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }


    public void status(){
        System.out.println("\n Informações da Caneta:");
        System.out.println("\nModelo: "+ this.modelo);
        System.out.println("Cor da tinta: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }

    public void setTinta(String cor, int carga){
        this.carga = carga;
        if(cor == this.cor){
            System.out.println("\nSua caneta agora está com " + this.carga + "% de carga de tinta " + this.cor);  
        }
        else{
            this.cor = cor;
            System.out.println("\nSua caneta agora está com " + this.carga + "% de carga de tinta " + this.cor);
        }
        
    }

    protected void rabiscar(){
        if (this.tampada == true || this.carga == 0){
            System.out.println("Estou tampada ou sem tinta, não posso rabiscar!");
        }
        else{
            System.out.println("Estou rabiscando!");
            this.carga-= 1;
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
