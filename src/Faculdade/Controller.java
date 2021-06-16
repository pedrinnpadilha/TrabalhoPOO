package Faculdade;

import java.util.ArrayList;


public class Controller {

	ArrayList<Professor> professorD = new ArrayList<>();
	ArrayList<Professor> professorM = new ArrayList<>();
	ArrayList<Turma> turma = new ArrayList<>();

	public void adicionarD(Professor pd) {//adiciona um professor com doutorado
		professorD.add(pd);
	}

	public void adicionarM(Professor pm) {//adiciona um professor com mestrado
		professorM.add(pm);
	}

	public void adicionarT(Turma t) {//adiciona uma turma
		turma.add(t);
	}

	public void listaPessoasD() {//lista todos os professores com doutorado
		professorD.forEach((pd) -> {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + pd.getNome());
			System.out.println("Idade: " + pd.getIdade());
			System.out.println("Codigo: " + pd.getCodigo());
			System.out.println("Salario Bruto: " + pd.calculaSalario());
			System.out.println("Horas: " + pd.getHoras());
			System.out.println("Tese: " + pd.getTese());
			System.out.println("-----------------------------");
		});

	}

	public void listaPessoasM() {//lista todos os professores com mestrado
		professorM.forEach((pm) -> {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + pm.getNome());
			System.out.println("Idade: " + pm.getIdade());
			System.out.println("Codigo: " + pm.getCodigo());
			System.out.println("Salario: " + pm.getSalario());

			System.out.println("-----------------------------");
		});
	}

	public void listaTurma() {//lista todas as turmas
		turma.forEach((t) -> {
			System.out.println("-----------------------------");
			System.out.println("Codigo: " + t.getNumero());
			System.out.println("Turno: " + t.getTurno());

			System.out.println("-----------------------------");
		});
	
		
	
	}
}
