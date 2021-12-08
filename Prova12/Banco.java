import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {
    
    static private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Banco(){};
    public Banco(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
  		
    
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }   
    

	public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
	
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }



    public void cadastrar(Banco banco){
        while(true){
            int aux = 0;
            Contato contato = new Contato();
            Endereco endereco = new Endereco();
            Conta conta = new Conta();
            Cliente cliente = new Cliente();
            JOptionPane.showMessageDialog(null, "Digite os dados solicitados a seguir para fazer o cadastro! ", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            cliente.setNome(JOptionPane.showInputDialog(null, "Nome: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ", "Cadastro", JOptionPane.QUESTION_MESSAGE)));
            cliente.setSexo(JOptionPane.showInputDialog(null, "Genero: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            cliente.setCpf(JOptionPane.showInputDialog(null,"CPF: ","Cadastro",JOptionPane.QUESTION_MESSAGE));
            
            contato.setEmail(JOptionPane.showInputDialog(null, "Email: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            contato.setCelular(JOptionPane.showInputDialog(null, "Celular: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            contato.setTelefone(JOptionPane.showInputDialog(null, "Telefone: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
            cliente.setContato(contato);

            endereco.setPais(JOptionPane.showInputDialog( null , "Qual o Pais que reside?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE));
            endereco.setUf(JOptionPane.showInputDialog( null , "Qual Estado reside?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE));
            endereco.setCidade(JOptionPane.showInputDialog( null , "Qual Cidade reside?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE));
            endereco.setRua(JOptionPane.showInputDialog( null , "Qual a rua da sua residencia?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE));
            endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual o numero da casa?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE)));
            cliente.setEndereco(endereco);

            conta.setAgencia(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual a sua agencia de banco?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE)));
            conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual o numero da sua conta?" , "Cadastro" , JOptionPane.QUESTION_MESSAGE)));
            conta.setSaldo(0);
            conta.setSenha(Integer.parseInt(JOptionPane.showInputDialog( null , "Digite a senha para sua conta do banco:" , "Cadastro" , JOptionPane.QUESTION_MESSAGE)));
            cliente.setConta(conta);
            banco.addCliente(cliente);
            aux = JOptionPane.showConfirmDialog(null, "Deseja fazer mais um cadastro?", "CONTINUAR?",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(aux == 1){
                break;
            }
        }
        
    }
    
    public Cliente getCliente(String CPF){
        for(Cliente cli: clientes){
            if(cli.getCpf().equals(CPF)){
                return cli;
            }
        }
        return null;
    }

    public void mostrar(Banco banco){
        int senha;
        Cliente cli = banco.getCliente(JOptionPane.showInputDialog(null, "Digite o CPF da conta: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        while(cli == null){
            cli = banco.getCliente(JOptionPane.showInputDialog(null, "CPF Invalido, digite novamente: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        }
        senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da sua conta: ", "Login",JOptionPane.QUESTION_MESSAGE));
        while(senha != cli.getConta().getSenha()){
            senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Senha incorreta, digite novamente: ","Login",JOptionPane.QUESTION_MESSAGE));
        }
        
        JOptionPane.showMessageDialog(null, "Dados do Cliente solicitado:\nNome: "+cli.getNome()+"\nIdade: "
        +cli.getIdade()+"\nGênero: "+cli.getSexo()+"\nCPF: "+ cli.getCpf()+"\nEmail: "+cli.getContato().getEmail()
        +"\nCelular: "+cli.getContato().getCelular()+"\nTelefone: "+cli.getContato().getTelefone()+"\nPais: "
        +cli.getEndereco().getPais()+"\nEstado: "+cli.getEndereco().getUf()+"\nCidade: "+cli.getEndereco().getCidade()
        +"\nRua: "+cli.getEndereco().getRua()+"\nNumero: "+cli.getEndereco().getNumero()+"\nNumero da conta: "
        +cli.getConta().getNumConta()+"\nAgencia: "+cli.getConta().getAgencia());              
    }

    public void sacar(Banco banco){
        int senha;
        double saque, aux;
        Cliente cli = banco.getCliente(JOptionPane.showInputDialog(null, "Digite o CPF da conta: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        while(cli == null){
            cli = banco.getCliente(JOptionPane.showInputDialog(null, "CPF Invalido, digite novamente: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        }
        senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da sua conta: ", "Login",JOptionPane.QUESTION_MESSAGE));
        while(senha != cli.getConta().getSenha()){
            senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Senha incorreta, digite novamente: ","Login",JOptionPane.QUESTION_MESSAGE));
        }

        JOptionPane.showMessageDialog(null,"Bem Vindo!\nNome do cliente: "+cli.getNome()+"\nNumero da conta: "
        +cli.getConta().getNumConta()+"\nAgencia: "+cli.getConta().getAgencia()+"\n\nSALDO: "+cli.getConta().getSaldo()+" R$");       
        
        saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual valor deseja sacar? ","Saque",JOptionPane.QUESTION_MESSAGE));
        while(saque > cli.getConta().getSaldo()){
            saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Saque um valor menor ou igual ao seu saldo: ","Saque",JOptionPane.QUESTION_MESSAGE));
        }

        cli.getConta().setSaldo(cli.getConta().getSaldo()-saque);
        JOptionPane.showMessageDialog(null,"Saque feito com sucesso!");
    }

    public void depositar(Banco banco){
        int senha;
        double deposito, aux;
        
        Cliente cli = banco.getCliente(JOptionPane.showInputDialog(null, "Digite o CPF da conta: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        while(cli == null){
            cli = banco.getCliente(JOptionPane.showInputDialog(null, "CPF Invalido, digite novamente: ", "Consulta",JOptionPane.QUESTION_MESSAGE));
        }
        senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da sua conta: ", "Login",JOptionPane.QUESTION_MESSAGE));
        while(senha != cli.getConta().getSenha()){
            senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Senha incorreta, digite novamente: ","Login",JOptionPane.QUESTION_MESSAGE));
        }

        JOptionPane.showMessageDialog(null,"Bem Vindo!\nNome do cliente: "+cli.getNome()+"\nNumero da conta: "
        +cli.getConta().getNumConta()+"\nAgencia: "+cli.getConta().getAgencia()+"\n\nSALDO: "+cli.getConta().getSaldo()+" R$");       
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual valor deseja depositar? ","Deposito",JOptionPane.QUESTION_MESSAGE));

        cli.getConta().setSaldo(cli.getConta().getSaldo()+deposito);
		JOptionPane.showMessageDialog(null,"Deposito feito com sucesso!");
    }
}
