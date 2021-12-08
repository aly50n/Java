import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Arquivo{
    private String caminho = "C:/Users/Alyson/Documents/LaboratorioProg/Lab.P2/LinguagemProva2.2/Bytes.byte";
        
    public void gravarProntuarios(ArrayList<Prontuario> pront){
        try(FileOutputStream fos = new FileOutputStream(caminho)){
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(pront);
            }
        }catch(IOException e){
            e.getMessage();
        }      
        
    }
    
    public ArrayList<Prontuario> lerProntuarios(){
        ArrayList<Prontuario> pront = new ArrayList<Prontuario>();
        
        try(FileInputStream fis = new FileInputStream(caminho)){
            try(ObjectInputStream ois = new ObjectInputStream(fis)){
                pront =  (ArrayList<Prontuario>) ois.readObject();
            }
        }catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }    
        
        return pront;
    }
    
    public void mostrarProntuarios(){
        for (Prontuario p : lerProntuarios()) {
            JOptionPane.showMessageDialog(null,"==================================================\n=== PRONTUARIOS ARQUIVADOS NA ULTIMA EXECUCAO ===\n==================================================");
            p.getPaciente().mostrar(p);
        }
    }
}
