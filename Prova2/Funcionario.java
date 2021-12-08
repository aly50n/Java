import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
    private String crm;

    public Funcionario(){}
    public Funcionario(String crm, String nome, String cpf, String dataNasc, Contato contato, Endereco endereco){
        super(nome, cpf, dataNasc, contato, endereco);
        this.crm = crm;
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
