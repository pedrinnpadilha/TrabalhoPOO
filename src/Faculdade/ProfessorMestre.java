package Faculdade;

public class ProfessorMestre extends Professor {

	public ProfessorMestre() {
		super();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public double calculaSalario() {
		return this.getSalario() + 500;//faz o salario, pega o salario e soma com a multiplicação das horas pelo extra

	}
}