import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        int a = 0;
        Estudante estudante = new Estudante();
        estudante.setNome (JOptionPane.showInputDialog( null , "Qual o seu nome?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE));
        estudante.setIdade(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual a sua idade?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE)));
        estudante.setSexo(JOptionPane.showInputDialog( null , "Qual o seu genero?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE));
        Contato contato = new Contato();
        contato.setEmail(JOptionPane.showInputDialog( null , "Qual o seu e-mail?" , "Informações de Contato" , JOptionPane.QUESTION_MESSAGE));
        contato.setCelular(JOptionPane.showInputDialog( null , "Qual o seu numero do celular?" , "Informações de Contato" , JOptionPane.QUESTION_MESSAGE));
        Endereco endereco = new Endereco();
        endereco.setPais(JOptionPane.showInputDialog( null , "Em que Pais voce reside?" , "Informações de Endereco" , JOptionPane.QUESTION_MESSAGE));
        endereco.setCidade(JOptionPane.showInputDialog( null , "Em que Cidade voce reside?" , "Informações de Endereco" , JOptionPane.QUESTION_MESSAGE));
        endereco.setUf(JOptionPane.showInputDialog( null , "Em que Estado voce reside?" , "Informações de Endereco" , JOptionPane.QUESTION_MESSAGE));
        endereco.setBairro(JOptionPane.showInputDialog( null , "Em que Bairro voce reside?" , "Informações de Endereco" , JOptionPane.QUESTION_MESSAGE));
        endereco.setRua(JOptionPane.showInputDialog( null , "qual a rua que voce reside?" , "Informações de Endereco" , JOptionPane.QUESTION_MESSAGE));
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(JOptionPane.showInputDialog( null , "Qual o nome da disciplina?" , "Informações do Curso" , JOptionPane.QUESTION_MESSAGE));
        disciplina.setProfessor(JOptionPane.showInputDialog( null , "Qual o nome do professor da disciplina?" , "Informações do Curso" , JOptionPane.QUESTION_MESSAGE));
        disciplina.setSala(JOptionPane.showInputDialog( null , "Qual a sala em que estuda?" , "Informações do Curso" , JOptionPane.QUESTION_MESSAGE));
        disciplina.setTurno(JOptionPane.showInputDialog( null , "Qual o turno que esta estudando?" , "Informações do Curso" , JOptionPane.QUESTION_MESSAGE));
        UT1 ut1 = new UT1();
        ut1.setNota1(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual a primeira nota da primeira unidade?" , "Notas" , JOptionPane.QUESTION_MESSAGE)));
        ut1.setNota2(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual a segunda nota da primeira unidade?" , "Notas" , JOptionPane.QUESTION_MESSAGE)));
        UT2 ut2 = new UT2();
        
        ut2.setNota1(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual primeira nota da segunda unidade?" , "Notas" , JOptionPane.QUESTION_MESSAGE)));
        
        ut2.setNota2(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual segunda nota da segunda unidade?" , "Notas" , JOptionPane.QUESTION_MESSAGE)));
        double n1 = ut1.getNota1(),n2= ut1.getNota2(),n3=ut2.getNota1(),n4=ut2.getNota2(), media;
        media = (n1+n2+n3+n4) / 4;
		
        
        while(a == 0){
            int aux=0;
            aux = Integer.parseInt(JOptionPane.showInputDialog( null , "1- Ver dados do estudante\n2- Ver notas da primeira unidade\n3- Ver notas da segunda unidade\n4- Ver media final\n5- Ver resultado(Aprovado ou Reprovado)" , "MENU:" , JOptionPane.INFORMATION_MESSAGE));
            if(aux == 1){
                JOptionPane.showMessageDialog(null,"Dados do estudante:\nNome: "+estudante.getNome()+"\nIdade: "+estudante.getIdade()+
				"\nGenero: "+ estudante.getSexo()+"\nE-mail: "+contato.getEmail()+"\nCelular: "+ contato.getCelular()+"\nMora no: "+ endereco.getPais()+"\nNa cidade: "+endereco.getCidade()+
				"\nNo estado: "+ endereco.getUf()+"\nNo bairro: "+ endereco.getBairro()+"\nNa rua: "+ endereco.getRua()+"\nEsta cursando a disciplina: "+ disciplina.getNome()+
				"\nCom o professor: "+ disciplina.getProfessor()+"\nNa sala: "+ disciplina.getSala()+"\nNo turno: "+ disciplina.getTurno());
            }
            else if(aux == 2){
				JOptionPane.showMessageDialog(null,"A primeira nota da primeira unidade de "+estudante.getNome()+" e "+ut1.getNota1()+
				"\nA segunda nota da primeira unidade de "+estudante.getNome()+" e "+ut1.getNota2());
            }
            else if(aux == 3){
				JOptionPane.showMessageDialog(null,"A primeira nota da segunda unidade de "+estudante.getNome()+" e "+ut2.getNota1()+
				"\nA segunda nota da segunda unidade de "+estudante.getNome()+" e "+ut2.getNota2());
            }
            else if(aux == 4){
				JOptionPane.showMessageDialog(null,"A media final do estudante "+estudante.getNome()+" e "+ media);
            }
            else if(aux == 5){
                if(media >= 7){
					JOptionPane.showMessageDialog(null,"O estudante "+estudante.getNome()+" foi aprovado com media "+ media, null, JOptionPane.INFORMATION_MESSAGE);
                }
                else if(media >= 5 && media <7){
					JOptionPane.showMessageDialog(null,"O estudante "+estudante.getNome()+" foi para prova final com media "+ media, null, JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"O estudante "+estudante.getNome()+" foi reprovado com media "+ media, null, JOptionPane.ERROR_MESSAGE);
                }
            }
            a = JOptionPane.showConfirmDialog(null, "Voce deseja continuar no programa?", null, JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);           
        }
	}
}