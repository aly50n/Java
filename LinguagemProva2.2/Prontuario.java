import java.io.Serializable;

public class Prontuario implements Serializable{
    private Paciente paciente = new Paciente();
    private Funcionario funcionario = new Funcionario();
    private int numeroProntuario;
    private String dataEntrada;
    private String dataSaida;
    private String horaClassificacao;
    private boolean internado = false;
    private boolean atendido = false;
    private String risco;

    public Prontuario(){}
    public Prontuario(Paciente paciente, Funcionario funcionario, String dataEntrada, String dataSaida, int numeroProntuario, String horaClassificacao, boolean internado, boolean atendido, String risco){
        this.paciente = paciente;
        this.funcionario = funcionario;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numeroProntuario= numeroProntuario;
        this.horaClassificacao = horaClassificacao;
        this.internado = internado;
        this.atendido = atendido;
        this.risco = risco;
    }
    public String getRisco() {
        return risco;
    }
    public boolean isAtendido() {
        return atendido;
    }
    public boolean isInternado() {
        return internado;
    }
    public String getHoraClassificacao() {
        return horaClassificacao;
    }
    public int getNumeroProntuario() {
        return numeroProntuario;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public String getDataSaida() {
        return dataSaida;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setInternado(int internado) {
        if(internado == 0){
            this.internado = true;
        }
        else{
            this.internado = false;
        }
         
    }
    public void setRisco(String risco) {
        this.risco = risco;
    }
    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setHoraClassificacao(String horaClassificacao) {
        this.horaClassificacao = horaClassificacao;
    }
    public void setNumeroProntuario(int numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
        
    }



    
}
