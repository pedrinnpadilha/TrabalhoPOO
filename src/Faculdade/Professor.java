package Faculdade;

import Faculdade.Pessoa;
import Faculdade.Controller;
import Faculdade.ProfessorDoutorado;
import Faculdade.Professor;


public class Professor extends Pessoa
{
	protected int codigo;
	private double salario;
	private int horas;
	
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

	
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

	}

	
	

	
	
	