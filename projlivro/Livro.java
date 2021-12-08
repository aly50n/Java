public class Livro {
    private String titulo;
    private String tipoCapa;
    private String genero;
    private String corCapa;
    private int qntPaginas;
    private boolean aberto;
    
    public Livro(){}
    public Livro(String titulo,String genero, String tipoCapa, String corCapa, int qntPaginas, boolean aberto){
        this.titulo = titulo;
        this.tipoCapa = tipoCapa;
        this.corCapa= corCapa;
        this.qntPaginas = qntPaginas;
        this.aberto = aberto;
        this.genero = genero;
    }


    public void status(){
        System.out.println("\n ====================================================================");
        System.out.println("\n Informações do Livro:");
        System.out.println("\nTitulo: "+ this.getTitulo());
        System.out.println("\nGenero: "+ this.getGenero());
        System.out.println("Tipo da capa: " + this.getTipoCapa());
        System.out.println("Cor da capa: "+ this.getCorCapa());
        System.out.println("Quantidade de paginas: "+ this.getQntPaginas());
        System.out.println("Está aberto? "+ this.getAberto());
        System.out.println("\n ====================================================================");
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTitulo(String titulo){
      this.titulo = titulo;
    }
    public void setTipoCapa(String tipoCapa){
      this.tipoCapa = tipoCapa;
    }
    public void setCorCapa(String corCapa){
      this.corCapa = corCapa;
    }
    public void setQntPaginas(int qntPaginas){
      this.qntPaginas = qntPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public String getTitulo(){
      return titulo;
    }
    public String getTipoCapa(){
      return tipoCapa;
    }
    public String getCorCapa(){
      return corCapa;
    }
    public int getQntPaginas(){
      return qntPaginas;
    }
    public boolean getAberto(){
      return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void fechar(){
      this.aberto = false;
    }
    public void abrir(){
      this.aberto = true;
    }
}
