import javax.swing.JOptionPane;
import java.io.Serializable;

public abstract class Pessoa implements Serializable{
    private String nome;
    private String sexo;
    private String dataNasc;
    private float peso;
    private float altura;
    private String cpf;
    private Endereco endereco = new Endereco();
    private Contato contato = new Contato();

    public Pessoa(){}

    public Pessoa(String nome, String cpf, String dataNasc, Contato contato, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.contato = contato;
        this.endereco = endereco;
    }
    
    public Pessoa(String nome, String sexo, String dataNasc, float peso, float altura, Endereco endereco, Contato contato){
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.altura = altura;
        this.endereco = endereco;
        this.contato = contato;
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null,"\nDados Pessoais:\nNome:" +getNome()+ "\nCPF: "+ getCpf()+ "\nData de nascimento:"+getDataNasc()+"\nAltura:"+
        getAltura()+"\nPeso(kg):"+getPeso()+"\nGenero: "+getSexo()+"\n\nDados de Contato:\nEmail: "+getContato().getEmail()+"\nTelefone:"
        +getContato().getTelefone()+"\n\nDados de Endereco:\nEstado de residencia: "+getEndereco().getUf()+"\nCidade em que reside: "
        +getEndereco().getCidade()+"\nRua em que reside:"+getEndereco().getRua()+"\nNa casa de numero:" +getEndereco().getNumero() ,"Dados Pessoais: ", JOptionPane.INFORMATION_MESSAGE);
    }
    public float calcImc(){
        return peso / (altura*altura); 
    }
    public float getAltura() {
        return altura;
    }  
    public Contato getContato() {
        return contato;
    }  
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    public String getSexo() {
        return sexo;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

















}
