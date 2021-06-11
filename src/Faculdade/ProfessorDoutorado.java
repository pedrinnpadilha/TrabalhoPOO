package Faculdade;

public class ProfessorDoutorado extends Professor {
	
	private int extra;
	private String tese;
	
	public ProfessorDoutorado(String nome, int idade, int codigo, double salario, int extra, String tese) {
		super();
	}
	
	/*public ProfessorDoutorado(int extra, String tese) {
		super();
		this.extra = extra;
        this.tese = tese;                
    }	    */
        
    
	
	public ProfessorDoutorado() {
		// TODO Auto-generated constructor stub
	}

	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public String getTese() {
		return tese;
	}
	public void setTese(String tese) {
		this.tese = tese;
	}
	
	

}
