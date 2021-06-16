package Faculdade;

import Faculdade.Professor;

public abstract class Professor extends Pessoa {
	protected int codigo;
	private double salario;
	protected int horas;

	public Professor() {
	}

	public Professor(int codigo, double salario, int horas) {
		super();
		this.codigo = codigo;
		this.salario = salario;
		this.horas = horas;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double calculaSalario() {
		return this.getSalario();

	}

	public String instituicao() {
		return this.instituicao();
	}

	public Boolean EmAula() {
		return this.EmAula();
	}

	public int size() {
		
		return 0;
	}

	public Object get(int i) {
		
		return null;
	}

	
	public String getTese() {
		
		return null;
	}

	
}
