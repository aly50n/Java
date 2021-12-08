public class Contato {
    private String email;
    private String celular;
	private String redeSocial;

    public Contato(){}
    public Contato(String email, String celular,String redeSocial){
        this.email = email;
        this.celular = celular;
		this.redeSocial = redeSocial;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	
	public void setRedeSocial(String redeSocial){
		this.redeSocial = redeSocial;
	}

    public String getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }
	
	public String getRedeSocial(){
		return redeSocial;
	}


}
