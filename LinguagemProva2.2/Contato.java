import java.io.Serializable;
public class Contato implements Serializable{
    private String email;
    private String telefone;
	
    public Contato(){}
    public Contato(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
	

}
