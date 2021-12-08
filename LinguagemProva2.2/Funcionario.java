import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
    private String crm="";
    private String coren="";
    private String funcao="";

    public Funcionario(){}
    
    public Funcionario(String funcao, String coremOuCRM, String nome, String cpf, String dataNasc, Contato contato, Endereco endereco){
        super(nome, cpf, dataNasc, contato, endereco);
        this.funcao = funcao;
        if(funcao == "M" || funcao == "m"){
            this.crm = coremOuCRM;
        }else if(funcao == "E" || funcao == "e"){
            this.coren = coremOuCRM;
        } 
    }
    public void setCoren(String coren) {
        this.coren = coren;
    }
    public String getCoren() {
        return coren;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getCrm() {
        return crm;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"\nDados do funcionario:\nNome do funcionario: " +this.getNome()+ 
        "\nCPF: "+ this.getCpf()+"\nData de Nascimento: "+this.getDataNasc()+ "CRM: "+this.getCrm()+"\n\nContato do Funcionario:\nEmail: "+this.getContato().getEmail()
        +"\nTelefone: "+this.getContato().getTelefone()+"\n\nEndereco do Funcionario:\nEstado em que reside: "+this.getEndereco().getUf()+
        "\nCidade em que reside: "+this.getEndereco().getCidade()+"\nRua em que reside: "+this.getEndereco().getRua()+
        "\nNa casa de numero: " +this.getEndereco().getNumero(),"Dados do funcionario: ", JOptionPane.INFORMATION_MESSAGE);
    }
    




}
