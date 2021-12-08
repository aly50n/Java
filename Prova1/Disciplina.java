public class Disciplina {
    private String nome;
    private String professor;
    private String sala;
    private String turno;

    public Disciplina(){}
    public Disciplina(String nome, String professor, String sala, String turno){
        this.nome = nome;
        this.professor= professor;
        this.sala= sala;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }
    public String getProfessor() {
        return professor;
    }
    public String getSala() {
        return sala;
    }
    public String getTurno() {
        return turno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
