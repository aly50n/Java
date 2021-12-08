public class Contato {
    private String email;
    private String celular;
	private String telefone;

    public Contato(){}
    public Contato(String email, String celular,String telefone){
        this.email = email;
        this.celular = celular;
		this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

    public String getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }
	
	public String getTelefone(){
		return telefone;
	}


}
