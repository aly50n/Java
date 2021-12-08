import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Paciente extends Pessoa{
    
    private String probSaude;
    private int riscoSaude;
    
    public Paciente(){}
    public Paciente(String probSaude, int riscoSaude, String nome,float peso, float altura ,String sexo, String dataNasc, Endereco endereco, Contato contato){
        super(nome, sexo, dataNasc, peso, altura, endereco, contato);
        this.probSaude = probSaude;
        this.riscoSaude = riscoSaude;
    }

    public String getProbSaude() {
        return probSaude;
    }
    public void setProbSaude(String probSaude) {
        this.probSaude = probSaude;
    }
    public int getRiscoSaude() {
        return riscoSaude;
    }
    public void setRiscoSaude(int risco, Prontuario prontuario) {
        this.riscoSaude = risco;
        if(risco == 1){
            prontuario.setRisco("Vermelho");
        }
        else if(risco == 2){
            prontuario.setRisco("Amarelo");
        }
        else if(risco == 3){
            prontuario.setRisco("Verde");
        }
        else if(risco == 4){
            prontuario.setRisco("Azul");
        }
    }

    public void mostrar(Prontuario prontuario){
        JOptionPane.showMessageDialog(null,"\nDados Pessoais do Paciente:\nClassificacao de risco: "+ prontuario.getRisco() +"\nJa foi atendido? "+prontuario.isAtendido()+"\nNome: " +this.getNome()+
        "\nData de Nascimento: "+this.getDataNasc()+"\nAltura: "+this.getAltura()+"      Peso(kg): "+this.getPeso()+"\nGenero: "+this.getSexo()+
        "\nProblema de saude: "+this.getProbSaude()+"\nIMC: "+this.calcImc()+
        "\nContato do Paciente:\nEmail: "+this.getContato().getEmail()
        +"      Telefone: "+this.getContato().getTelefone()+"\nEndereco do Paciente:\nEstado em que reside: "+this.getEndereco().getUf()+
        "\nCidade em que reside: "+this.getEndereco().getCidade()+"\nRua em que reside: "+this.getEndereco().getRua()+
        "\nNa casa de numero: " +this.getEndereco().getNumero()+"\n\nDados do funcionario que atendeu: "+
        "\nNome do funcionario: "+prontuario.getFuncionario().getNome()+"\nCPF: "+ prontuario.getFuncionario().getCpf()+
        "\nData de Nascimento"+prontuario.getFuncionario().getDataNasc()+"\nCRM: "+prontuario.getFuncionario().getCrm()
        +"\nContato do Funcionario:\nEmail: "+prontuario.getFuncionario().getContato().getEmail()+"      Telefone: "+
        prontuario.getFuncionario().getContato().getTelefone()+"\nEndereco do Funcionario:\nEstado em que reside: "+
        prontuario.getFuncionario().getEndereco().getUf()+"\nCidade em que reside: "+prontuario.getFuncionario().getEndereco().getCidade()+
        "\nRua em que reside: "+prontuario.getFuncionario().getEndereco().getRua()+"\nNa casa de numero: " +prontuario.getFuncionario().getEndereco().getNumero()+
        "\nInformacoes do Atendimento:\nData da entrada: " +prontuario.getDataEntrada()+"\nHora da classificacao de risco: "+
        prontuario.getHoraClassificacao()+ "\nFoi Internado? "+prontuario.isInternado()+"\nData da saida: "+prontuario.getDataSaida() ,"Dados do prontuario: ", JOptionPane.INFORMATION_MESSAGE);
    }
}
