public class Cliente{
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private Conta conta;
    private Endereco endereco;
    private Contato contato;
    

    public Cliente(){}
    public Cliente(String nome, int idade, String sexo, String cpf, Endereco endereco, Contato contato, Conta conta){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.conta = conta;
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
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
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
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Contato getContato() {
        return contato;
    }
    public Conta getConta() {
        return conta;
    }


}



