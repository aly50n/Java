import javax.swing.JOptionPane;

public class EntradaDados {

    public Gato pedirGatoUsuario(){         
        Gato gato = new Gato(
            JOptionPane.showInputDialog(null, "Qual a raça do Gato?"));
        return gato;
    }

    public Cachorro pedirCachorroUsuario(){
        Cachorro cachorro = new Cachorro(
            JOptionPane.showInputDialog(null, "Qual a raça do Cão?"));
        return cachorro;
    }

    public Gaviao pedirGaviaoUsuario(){
        Gaviao gaviao = new Gaviao(
            JOptionPane.showInputDialog(null, "Qual a plumagem do gaviao?"),
            JOptionPane.showInputDialog(null, "Qual o tamanho das garras do gaviao?"),
            JOptionPane.showInputDialog(null, "Qual a raca do gaviao?"));
        return gaviao;
    }
}
