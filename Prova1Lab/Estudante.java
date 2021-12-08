public class Estudante{
    private String nome;
    private int idade;
    private String sexo;
    private int matricula;
    private Endereco endereco;
    private Contato contato;
    private Disciplina disciplina;

    public Estudante(){}
    public Estudante(String nome, int idade, String sexo, int matricula, Endereco endereco, Contato contato, Disciplina disciplina){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
        this.endereco = endereco;
        this.contato = contato;
        this.disciplina = disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    public int getMatricula() {
        return matricula;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Contato getContato() {
        return contato;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
}



