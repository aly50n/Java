import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int a = 0,n;
        while(a == 0){
            int aux=0;
            n=0;
            Banco banco = new Banco();
            aux = Integer.parseInt(JOptionPane.showInputDialog( null , "MENU:\n1- Cadastrar Novo Cliente.\n2- Mostrar Dados de um Cliente.\n3- Fazer Deposito.\n4- Fazer Saque." , "MENU:" , JOptionPane.INFORMATION_MESSAGE));
            if(aux == 1){
                banco.cadastrar(banco);
            }
            else if(aux == 2){
                banco.mostrar(banco);
            }
            
            else if(aux == 3){
                banco.depositar(banco);                               
            }
            else if(aux == 4){
                banco.sacar(banco);
            }
            a = JOptionPane.showConfirmDialog(null, "Voce deseja continuar no programa?", "Continuar?", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);           
        }
    }
}
