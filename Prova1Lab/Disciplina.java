public class Disciplina {
    private String nome;
    private String professor;
    private int numeroFaltas;
	private String periodoLetivo;
	private double[] notasUT1 = new double[3];
	private double[] notasUT2 = new double[3];
	private double provaFinal;
    private double mediaFinal;

    public Disciplina(){}
    public Disciplina(String nome, String professor,int numeroFaltas,String periodoLetivo, double[] notasUT1, double[] notasUT2, double provaFinal){
        this.nome = nome;
        this.professor= professor;
		this.numeroFaltas = numeroFaltas;
		this.periodoLetivo = periodoLetivo;
        this.provaFinal = provaFinal;
		for(int i=0;i<3;i++){
			this.notasUT1[i] = notasUT1[i];
			this.notasUT2[i] = notasUT2[i];
		}
		
    }
    public double getMediaFinal() {
        return mediaFinal;
    }
    public String getNome() {
        return nome;
    }
    public String getProfessor() {
        return professor;
    }
    public int getNumeroFaltas() {
        return numeroFaltas;
    }
    public String getPeriodoLetivo() {
        return periodoLetivo;
    }
    public double getProvaFinal() {
        return provaFinal;
    }
    public double getNotasUT1(int i){
        return notasUT1[i];
    }
    public double getNotasUT2(int i){
        return notasUT2[i];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }
    public void setPeriodoLetivo(String periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }
    public void setProvaFinal(double provaFinal) {
        this.provaFinal = provaFinal;
    }
    public void setNotasUT1(double valor, int i){
        this.notasUT1[i] = valor;
    }
    public void setNotasUT2(double valor2, int i){
        this.notasUT2[i] = valor2;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}
