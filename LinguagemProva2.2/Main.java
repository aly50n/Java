import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        boolean a = true;
        ArrayList<Prontuario> prontuarios = new ArrayList<Prontuario>();
        new Arquivo().mostrarProntuarios();
        while(a){
            int aux=0;
            Prontuario auxP = new Prontuario();
            
            aux = Integer.parseInt(JOptionPane.showInputDialog( null , "Sistema de gerenciamento de pacientes do HRP\nMENU:\n1- Preencher novo prontuario.\n2- Ver o proximo paciente a ser atendido.\n3- Atender proximo paciente.\n4- Mostrar prontuario de um paciente.\n5- Salvar e Sair do programa." , "MENU:" , JOptionPane.INFORMATION_MESSAGE));
            
			if(aux == 1){
                prontuarios.add(cadastrar());
            }
			
            else if(aux == 2){
                aux =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fila de prioridade que deseja ver o proximo a ser atendido:\n1- Fila Vermelha[Prioridade, atendimento imediato]\n2-Amarelo[Atendimento em uma hora]\n3-Verde[Atendimento em ate duas horas]\n4-Azul[Atendimento em ate quatro horas]\n0- Voltar ao menu.", "Pesquisa", JOptionPane.QUESTION_MESSAGE));              
                getPrioridade(aux, prontuarios);
				while(getPrioridade(aux, prontuarios) == null && aux !=0){
                    switch(aux){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Na fila Vermelha nao ha paciente para ser atendido");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"Na fila Amarela nao ha paciente para ser atendido");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Na fila Verde nao ha paciente para ser atendido");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,"Na fila Azul nao ha paciente para ser atendido");
                            break;
                    }
					aux =  Integer.parseInt(JOptionPane.showInputDialog(null, "A fila digitada nao ha mais pacientes para serem atendidos, tente outra fila:\n1- Fila Vermelha[Prioridade, atendimento imediato]\n2-Amarelo[Atendimento em uma hora]\n3-Verde[Atendimento em ate duas horas]\n4-Azul[Atendimento em ate quatro horas]\n0- Voltar ao menu.", "Pesquisa", JOptionPane.QUESTION_MESSAGE));	
					
				}
				if (aux!=0){
					auxP = getPrioridade(aux, prontuarios);
					JOptionPane.showMessageDialog(null,"O proximo paciente a ser atendido e: "+auxP.getPaciente().getNome());
				}
                
            } 

            else if(aux == 3){
                aux =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a fila de prioridade que deseja atender o proximo paciente:\n1- Fila Vermelha[Prioridade, atendimento imediato]\n2-Amarelo[Atendimento em uma hora]\n3-Verde[Atendimento em ate duas horas]\n4-Azul[Atendimento em ate quatro horas]\n0- Voltar ao menu.", "Pesquisa", JOptionPane.QUESTION_MESSAGE));              
                getPrioridade(aux, prontuarios);
				while(getPrioridade(aux, prontuarios) == null && aux !=0){
                    switch(aux){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Na fila Vermelha nao ha paciente para ser atendido");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"Na fila Amarela nao ha paciente para ser atendido");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Na fila Verde nao ha paciente para ser atendido");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,"Na fila Azul nao ha paciente para ser atendido");
                            break;
                    }
					aux =  Integer.parseInt(JOptionPane.showInputDialog(null, "A fila digitada nao ha mais pacientes para serem atendidos, tente outra fila:\n1- Fila Vermelha[Prioridade, atendimento imediato]\n2-Amarelo[Atendimento em uma hora]\n3-Verde[Atendimento em ate duas horas]\n4-Azul[Atendimento em ate quatro horas]\n0- Voltar ao menu.", "Pesquisa", JOptionPane.QUESTION_MESSAGE));
						
				}
				if(aux != 0){
					atenderPaciente(aux, prontuarios);
				}
			}	
			
			else if(aux == 4){
                auxP = getProntuario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do prontuario do paciente para pesquisar: ", "Pesquisa", JOptionPane.QUESTION_MESSAGE)),prontuarios);
                while (auxP == null){
                  auxP = getProntuario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do prontuario do paciente para pesquisar: ", "Pesquisa", JOptionPane.QUESTION_MESSAGE)),prontuarios);
                }
                auxP.getPaciente().mostrar(auxP);
                
            }

            else if(aux == 5){
                new Arquivo().gravarProntuarios(prontuarios);
                a=false;         
            } 

        }
    }
    static private Prontuario cadastrar(){
        Prontuario p = new Prontuario();
        p.setNumeroProntuario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do prontuario do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE)));
        
        p.getPaciente().setNome(JOptionPane.showInputDialog(null, "Nome do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().setSexo(JOptionPane.showInputDialog(null, "Genero do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().setDataNasc(JOptionPane.showInputDialog(null, "Data de Nascimento do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Peso do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE)));
        p.getPaciente().setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Altura do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE)));
        p.getPaciente().setCpf(JOptionPane.showInputDialog(null, "CPF do Paciente:  ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        
        p.getPaciente().getContato().setEmail(JOptionPane.showInputDialog(null, "Email do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().getContato().setTelefone(JOptionPane.showInputDialog(null, "Telefone do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        
        p.getPaciente().getEndereco().setUf(JOptionPane.showInputDialog(null, "UF do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().getEndereco().setCidade(JOptionPane.showInputDialog(null, "Cidade do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().getEndereco().setRua(JOptionPane.showInputDialog(null, "Rua em que o paciente reside: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().getEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da casa do paciente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE)));
        
        p.getFuncionario().setNome(JOptionPane.showInputDialog(null, "Nome do Funcionario que atendeu o paciente: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().setCpf(JOptionPane.showInputDialog(null, "CPF do Funcionario que atendeu o paciente: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().setDataNasc(JOptionPane.showInputDialog(null, "Data de Nascimento do Funcionario que atendeu o paciente: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().setFuncao(JOptionPane.showInputDialog(null, "Funcao do Funcionario que Atendeu o Paciente(M-Medico ou E-Enfermeiro): ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        while((p.getFuncionario().getFuncao().equals("m") || p.getFuncionario().getFuncao().equals("M") || p.getFuncionario().getFuncao().equals("e") || p.getFuncionario().getFuncao().equals("E"))!=true){
            p.getFuncionario().setFuncao(JOptionPane.showInputDialog(null, "Funcao do Funcionario que Atendeu o Paciente(M-Medico ou E-Enfermeiro): ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        }
        if(p.getFuncionario().getFuncao().equals("M") || p.getFuncionario().getFuncao().equals("m")){
            p.getFuncionario().setCrm(JOptionPane.showInputDialog(null, "CRM do Medico que atendeu o paciente: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        }
        else if(p.getFuncionario().getFuncao().equals("E") || p.getFuncionario().getFuncao().equals("e")){
            p.getFuncionario().setCrm(JOptionPane.showInputDialog(null, "COREN do Enfermeiro que atendeu o paciente: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        }
        p.getFuncionario().getContato().setEmail(JOptionPane.showInputDialog(null, "Email do funcionario: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().getContato().setTelefone(JOptionPane.showInputDialog(null, "Telefone do funcionario: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        
        p.getFuncionario().getEndereco().setUf(JOptionPane.showInputDialog(null, "UF do funcionario: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().getEndereco().setCidade(JOptionPane.showInputDialog(null, "Cidade do funcionario: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().getEndereco().setRua(JOptionPane.showInputDialog(null, "Rua em que o funcionario reside: ", "Atendendo", JOptionPane.QUESTION_MESSAGE));
        p.getFuncionario().getEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da casa do funcionario: ", "Atendendo", JOptionPane.QUESTION_MESSAGE)));
		if(p.getFuncionario().getFuncao().equals("M") || p.getFuncionario().getFuncao().equals("m")){
        p.getFuncionario().setFuncao("Medico");
        }
        else if(p.getFuncionario().getFuncao().equals("E") || p.getFuncionario().getFuncao().equals("e")){
            p.getFuncionario().setFuncao("Enfermeiro");
        }
		p.setDataEntrada(JOptionPane.showInputDialog(null, "Data que o paciente ingressou no hospital: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        p.getPaciente().setProbSaude(JOptionPane.showInputDialog(null, "Qual o problema de saude do paciente? ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
		p.getPaciente().setRiscoSaude(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o risco de saude do paciente?\n1-Vermelho[Prioridade, atendimento imediato]\n2-Amarelo[Atendimento em uma hora]\n3-Verde[Atendimento em ate duas horas]\n4-Azul[Atendimento em ate quatro horas]", "Cadastro", JOptionPane.QUESTION_MESSAGE)), p);
        p.setHoraClassificacao(JOptionPane.showInputDialog(null, "Hora da classificacao de risco: ", "Cadastro", JOptionPane.QUESTION_MESSAGE));
        return p;
    }

    static private Prontuario getProntuario(int numero, ArrayList<Prontuario>prontuarios){
        for(Prontuario pront: prontuarios){
            if(pront.getNumeroProntuario() == numero){
                return pront;
            }
        }
        return null;
    }

    static private Prontuario getPrioridade(int risco, ArrayList<Prontuario>prontuarios){
        for(Prontuario pront: prontuarios){
            if(pront.getPaciente().getRiscoSaude() == risco && pront.isAtendido() == false){
                return pront;
            }
        }
        return null;
    }

    static private void atenderPaciente(int risco, ArrayList<Prontuario>prontuarios){
        for(Prontuario pront: prontuarios){
            if(pront.getPaciente().getRiscoSaude() == risco && pront.isAtendido() == false){
                pront.getPaciente().setRiscoSaude(0,pront);
                pront.setAtendido(true);
                JOptionPane.showMessageDialog(null, "Atendendo o paciente: "+ pront.getPaciente().getNome()+"\nProblema de saude: "+pront.getPaciente().getProbSaude()+"\nClassificacao de risco: "+pront.getRisco());
                pront.setInternado(JOptionPane.showConfirmDialog(null, "O paciente "+pront.getPaciente().getNome()+" precisa ser internado?", "Atendimento", JOptionPane.YES_NO_OPTION));
                pront.setDataSaida(JOptionPane.showInputDialog(null, "Data que o paciente vai ter alta do hospital: ", "Atendimento", JOptionPane.QUESTION_MESSAGE));
                break;
            }
        }
    }
}
