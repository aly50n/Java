import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        int a = 0, quant_est, i, n,j;
        quant_est = Integer.parseInt(JOptionPane.showInputDialog( null , "Quantos estudantes quer cadastrar?" , "Quantidade de estudantes" , JOptionPane.QUESTION_MESSAGE));
        Estudante[] estudante = new Estudante[quant_est];
        Contato[] contato = new Contato[quant_est+1];
        Endereco[] endereco = new Endereco[quant_est+1];
        Disciplina[] disciplina = new Disciplina[quant_est];
        Universidade universidade = new Universidade();

        for(i=0;i<quant_est;i++){
            estudante[i] = new Estudante();
            contato[i] = new Contato();
            endereco[i] = new Endereco();
            disciplina[i] = new Disciplina();
            JOptionPane.showMessageDialog(null, "Digite os dados do "+(i+1)+" aluno", "INFORMATIVO!", JOptionPane.INFORMATION_MESSAGE);
            estudante[i].setNome (JOptionPane.showInputDialog( null , "Qual o seu nome?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE));
            estudante[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual a sua idade?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE)));
            estudante[i].setSexo(JOptionPane.showInputDialog( null , "Qual o seu genero?" , "Informacoes do Estudante" , JOptionPane.QUESTION_MESSAGE));
            estudante[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n da sua matricula:", "Informacoes do Estudante", JOptionPane.QUESTION_MESSAGE)));
            contato[i].setEmail(JOptionPane.showInputDialog( null , "Qual o seu e-mail?" , "Informações de Contato" , JOptionPane.QUESTION_MESSAGE));
            contato[i].setCelular(JOptionPane.showInputDialog( null , "Qual o seu numero do celular?" , "Informacoes de Contato" , JOptionPane.QUESTION_MESSAGE));
            contato[i].setRedeSocial(JOptionPane.showInputDialog(null, "Qual seu @ na rede social?","Informacoees de Contato",JOptionPane.QUESTION_MESSAGE));
            estudante[i].setContato(contato[i]);
            endereco[i].setPais(JOptionPane.showInputDialog( null , "Qual o Pais voce reside?" , "Informacoes de Endereco" , JOptionPane.QUESTION_MESSAGE));
            endereco[i].setUf(JOptionPane.showInputDialog( null , "Em que Estado voce reside?" , "Informacoes de Endereco" , JOptionPane.QUESTION_MESSAGE));
            endereco[i].setCidade(JOptionPane.showInputDialog( null , "Em que Cidade voce reside?" , "Informacoes de Endereco" , JOptionPane.QUESTION_MESSAGE));
            endereco[i].setRua(JOptionPane.showInputDialog( null , "Qual a rua da sua residencia?" , "Informacoes de Endereco" , JOptionPane.QUESTION_MESSAGE));
            endereco[i].setNumero(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual o numero da casa?" , "Informacoes de Endereco" , JOptionPane.QUESTION_MESSAGE)));
            estudante[i].setEndereco(endereco[i]);
            disciplina[i].setNome(JOptionPane.showInputDialog( null , "Qual o nome da disciplina?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE));
            disciplina[i].setProfessor(JOptionPane.showInputDialog( null , "Qual o nome do professor da disciplina?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE));
            disciplina[i].setPeriodoLetivo(JOptionPane.showInputDialog( null , "Qual o periodo letivo da disciplina?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE));
            disciplina[i].setNumeroFaltas(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual o numero de faltas na disciplina?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE)));
            
            for(j=0; j<2;j++){
                disciplina[i].setNotasUT1(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual a " +(j+1)+ " nota da primeira Unidade Tematica?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE)), j);
            }
            for(j=0; j<2;j++){
                disciplina[i].setNotasUT2(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual a " +(j+1)+ " nota da segunda Unidade Tematica?" , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE)), j);
            }

            double auxNota1= disciplina[i].getNotasUT1(0), auxNota2= disciplina[i].getNotasUT1(1);
            disciplina[i].setNotasUT1((auxNota1+auxNota2) / 2 , 2);
            auxNota1=disciplina[i].getNotasUT2(0);
            auxNota2=disciplina[i].getNotasUT2(1);
            disciplina[i].setNotasUT2((auxNota1+auxNota2) / 2 , 2);
            auxNota1=disciplina[i].getNotasUT1(2);
            auxNota2=disciplina[i].getNotasUT2(2);
            disciplina[i].setMediaFinal((auxNota1+auxNota2) / 2);
                        
            if(disciplina[i].getMediaFinal() >= 5 && disciplina[i].getMediaFinal() < 7 ){
                disciplina[i].setProvaFinal(Double.parseDouble(JOptionPane.showInputDialog( null , "Qual foi a nota da Prova Final?"+(i+1) , "Informacoes da Disciplina" , JOptionPane.QUESTION_MESSAGE)));
            }
            estudante[i].setDisciplina(disciplina[i]);
            
                
                                  
        }
        contato[quant_est] = new Contato();
        endereco[quant_est] = new Endereco();
        universidade.setNome(JOptionPane.showInputDialog(null,"Qual o nome da Universidade?","Informacoes da Universidade",JOptionPane.QUESTION_MESSAGE));
        universidade.setCampus(JOptionPane.showInputDialog(null,"Qual o Campus da Universidade?","Informacoes da Universidade",JOptionPane.QUESTION_MESSAGE));
		contato[quant_est].setEmail(JOptionPane.showInputDialog( null , "Qual o e-mail da Universidade?" , "Informacoes de Contato da Universidade" , JOptionPane.QUESTION_MESSAGE));
        contato[quant_est].setCelular(JOptionPane.showInputDialog( null , "Qual o numero do telefone/celular da Universidade?" , "Informacoes de Contato da Universidade" , JOptionPane.QUESTION_MESSAGE));
        contato[quant_est].setRedeSocial(JOptionPane.showInputDialog(null, "Qual o @ da rede social da Universidade?","Informacoes de Contato da Universidade",JOptionPane.QUESTION_MESSAGE));
        endereco[quant_est].setPais(JOptionPane.showInputDialog( null , "Qual o Pais da Universidade?" , "Informacoes de Endereco da Universidade" , JOptionPane.QUESTION_MESSAGE));
        endereco[quant_est].setUf(JOptionPane.showInputDialog( null , "Qual o Estado da Universidade?" , "Informacoes de Endereco da Universidade" , JOptionPane.QUESTION_MESSAGE));
        endereco[quant_est].setCidade(JOptionPane.showInputDialog( null , "Qual a Cidade da Universidade?" , "Informacoes de Endereco da Universidade" , JOptionPane.QUESTION_MESSAGE));
        endereco[quant_est].setRua(JOptionPane.showInputDialog( null , "Qual a rua que se localiza a Universidade?" , "Informacoes de Endereco da Universidade" , JOptionPane.QUESTION_MESSAGE));
        endereco[quant_est].setNumero(Integer.parseInt(JOptionPane.showInputDialog( null , "Qual o numero da Universidade?" , "Informacoes de Endereco da Universidade" , JOptionPane.QUESTION_MESSAGE)));
        universidade.setEndereco(endereco[quant_est]);
        universidade.setContato(contato[quant_est]);
        universidade.setEstudantes(estudante);

        while(a == 0){
            int aux=0;
            n=0;
            aux = Integer.parseInt(JOptionPane.showInputDialog( null , "MENU:\n1- Ver dados de um estudante\n2- Ver dados da universidade\n3- Ver notas de um aluno da sua escolha\n4- Ver resultado dos alunos(Aprovado ou Reprovado)" , "MENU:" , JOptionPane.INFORMATION_MESSAGE));
            if(aux == 1){
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero do estudante que deseja ver os dados?","INFORMACAO",JOptionPane.INFORMATION_MESSAGE));
                while(n > quant_est){
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero valido referente a um estudante para ver os dados:","INFORMACAO",JOptionPane.INFORMATION_MESSAGE));
                }
                n-= 1;
                JOptionPane.showMessageDialog(null,"Dados do estudante:\nNome: "+estudante[n].getNome()+"     Idade: "
                +estudante[n].getIdade()+"\nGenero: "+ estudante[n].getSexo()+"     Matricula: "+estudante[n].getMatricula()+
                "\nE-mail: "+estudante[n].getContato().getEmail()+"     Celular: "+ estudante[n].getContato().getCelular()+
                "\nRedes Sociais do estudante: "+estudante[n].getContato().getRedeSocial()+"\nMora no Pais: "+ estudante[n].getEndereco().getPais()+
                "     No estado: "+ estudante[n].getEndereco().getUf()+"\nNa cidade: "+estudante[n].getEndereco().getCidade()+
                "     Na rua: "+ estudante[n].getEndereco().getRua()+"\nNa casa de numero: "+ estudante[n].getEndereco().getNumero()+
                "\nEsta cursando a disciplina: "+ estudante[n].getDisciplina().getNome()+"     Com o professor: "+estudante[n].getDisciplina().getProfessor()+
                "\nPeriodo Letivo: "+ estudante[n].getDisciplina().getPeriodoLetivo()+"     Numero de faltas na Disciplina: "+
                estudante[n].getDisciplina().getNumeroFaltas(), "Informacoes do Estudante:",JOptionPane.INFORMATION_MESSAGE);                
            }
            else if(aux == 2){
                JOptionPane.showMessageDialog(null, "Dados da Universidade:\nNome da Univesidade: "+universidade.getNome()+
                "\nCampus: "+universidade.getCampus()+"\nE-mail da Universidade: "+universidade.getContato().getEmail()+"     Celular/Telefone: "+ universidade.getContato().getCelular()+
                "\nRedes Sociais da Universidade: "+universidade.getContato().getRedeSocial()+"\nLocalizada no: "+ universidade.getEndereco().getPais()+
                "     No estado: "+ universidade.getEndereco().getUf()+"\nNa cidade: "+universidade.getEndereco().getCidade()+
                "     Na rua: "+ universidade.getEndereco().getRua()+"\nNo numero: "+ universidade.getEndereco().getNumero(), "Informacoes da Universidade:", JOptionPane.INFORMATION_MESSAGE);			
            }
            
            else if(aux == 3){
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero do estudante que deseja ver as notas?","INFORMACAO",JOptionPane.INFORMATION_MESSAGE));
                while(n > quant_est){
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero valido referente a um estudante para ver os dados:","INFORMACAO",JOptionPane.INFORMATION_MESSAGE));
                }
                n -= 1;
                JOptionPane.showMessageDialog(null,"A primeira nota da primeira unidade de "+estudante[n].getNome()+" e "+estudante[n].getDisciplina().getNotasUT1(0)+
                "\nA segunda nota da primeira unidade de "+estudante[n].getNome()+" e "+estudante[n].getDisciplina().getNotasUT1(1)
                +"\nA media da primeira unidade e: "+ estudante[n].getDisciplina().getNotasUT1(2)+
                "\n\nA primeira nota da segunda unidade de "+estudante[n].getNome()+" e "+estudante[n].getDisciplina().getNotasUT2(0)+
                "\nA segunda nota da segunda unidade de "+estudante[n].getNome()+" e "+estudante[n].getDisciplina().getNotasUT2(1)
                +"\nA media da segunda unidade e: "+ estudante[n].getDisciplina().getNotasUT2(2)+"\n\nA media final do estudante "+estudante[n].getNome()+" e "+ estudante[n].getDisciplina().getMediaFinal(),"Informacoes das Notas:",JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            else if(aux == 4){
                for(i=0;i<quant_est;i++){
                    if( estudante[i].getDisciplina().getMediaFinal() >= 7){
                        JOptionPane.showMessageDialog(null,"O Estudante "+estudante[i].getNome()+" foi Aprovado com media "+ estudante[i].getDisciplina().getMediaFinal(), "Status", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(estudante[i].getDisciplina().getMediaFinal() >= 5 && estudante[i].getDisciplina().getMediaFinal() <7){
                        JOptionPane.showMessageDialog(null,"O Estudante "+estudante[i].getNome()+" foi para Prova Final com media "+ estudante[i].getDisciplina().getMediaFinal()+"\ne tirou nota: "+ estudante[i].getDisciplina().getProvaFinal()+" na prova final.", "Status", JOptionPane.WARNING_MESSAGE);
						
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"O Estudante: "+estudante[i].getNome()+" foi Reprovado com media: "+ estudante[i].getDisciplina().getMediaFinal(), "Status", JOptionPane.ERROR_MESSAGE);
                    }
                }
				
            }
            a = JOptionPane.showConfirmDialog(null, "Voce deseja continuar no programa?", "Continuar?", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);           
        }
	}
}