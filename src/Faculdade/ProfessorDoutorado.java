package Faculdade;

public class ProfessorDoutorado extends Professor {

	private int extra = 25;//setei o valor do extra por hora, para ser igual para todos 
	private String tese;

	public ProfessorDoutorado() {
	}

	public ProfessorDoutorado(String nome, int idade, int codigo, double salario, int extra, String tese) {
		super();
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

	public double calculaSalario() {
		return this.getSalario() + (horas * extra);//faz o salario, pega o salario e soma com a multiplicação das horas pelo extra

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
