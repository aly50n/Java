public class Universidade{
    private String nome;
    private String campus;
    private Endereco endereco;
    private Contato contato;
    private Estudante[] estudantes;

    public Universidade(){}
    public Universidade(String nome, String campus, Endereco endereco, Contato contato, Estudante[] estudantes){
        this.nome = nome;
        this.campus= campus;
        this.endereco = endereco;
        this.contato = contato;
        this.estudantes = estudantes;
    }
    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getCampus() {
        return campus;
    }
    public Contato getContato() {
        return contato;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public Estudante[] getEstudantes() {
        return estudantes;
    }

}
