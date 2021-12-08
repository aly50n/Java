import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arq{
    private String caminho = "C:/Users/Alyson/Documents/LaboratorioProg/Lab.P2/Zoologico/texto.byte";
        
    public void gravarGav(ArrayList<Gaviao> gaviao){
        try(FileOutputStream fos = new FileOutputStream(caminho)){
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(gaviao);
            }
        }catch(IOException e){
            e.getMessage();
        }      
        
    }
    
    public ArrayList<Gaviao> lerGav(){
        ArrayList<Gaviao> gavioes = new ArrayList<Gaviao>();
        
        try(FileInputStream fis = new FileInputStream(caminho)){
            try(ObjectInputStream ois = new ObjectInputStream(fis)){
                gavioes =  (ArrayList<Gaviao>) ois.readObject();
            }
        }catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }    
        
        return gavioes;
    }
    
    public void mostrarGavioes(){
        for (Gaviao g : lerGav()) {
            JOptionPane.showMessageDialog(null,"Gaviões Arquivados:\n\n"+
            "Reino: "+g.getReino()+
            "\nFilo: "+g.getFilo()+
            "\nClasse: "+g.getClasse()+
            "\nOrdem: "+g.getOrdem()+
            "\nFamilia: "+g.getFamilia()+
            "\nGenero: "+g.getGenero()+
            "\nEspecie: "+g.getEspecie()+
            "\nVoa? "+g.isVoa()+
            "\nPlumagem: "+g.getPlumagem()+
            "\nTamanho das garras: "+g.getTamanhoGarras()+
            "\nRaca: "+g.getRaca());
        }
    }
}
