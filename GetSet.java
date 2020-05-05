class GetSet{
    private String NIDN;
    private String NamaDosen;
    private String Jurusan;
    private String Fakultas;
    private String Email;

	public void setNidn(String NIDN){
	    this.NIDN = NIDN;
	}
	
	public String getNidn(){
	    return this.NIDN;
	}
	
	public void setNamadosen(String NamaDosen){
	    this.NamaDosen = NamaDosen;
	}
	
	public String getNamadosen(){
	    return this.NamaDosen;
	}
	
	public void setjurusan(String Jurusan){
	    this.Jurusan = Jurusan;
	}
	
	public String getjurusan(){
	    return this.Jurusan;
	}

	public void setfakultas(String Fakultas){
	    this.Fakultas = Fakultas;
	}
	
	public String getfakultas(){
	    return this.Fakultas;
	}
		
	public void setemail(String Email){
	    this.Email = Email;
	}
	
	public String getemail(){
	    return this.Email;
	}
}

