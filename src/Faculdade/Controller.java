package Faculdade;

import java.util.ArrayList;


public class Controller {

	ArrayList<Professor> professorD = new ArrayList<>();
	ArrayList<Professor> professorM = new ArrayList<>();
	ArrayList<Turma> turma = new ArrayList<>();

	public void adicionarD(Professor d) {//adiciona um professor com doutorado
		professorD.add(d);
	}

	public void adicionarM(Professor m) {//adiciona um professor com mestrado
		professorM.add(m);
	}

	public void adicionarT(Turma t) {//adiciona uma turma
		turma.add(t);
	}

	public void listaPessoasD() {//lista todos os professores com doutorado
		professorD.forEach((d) -> {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + d.getNome());
			System.out.println("Idade: " + d.getIdade());
			System.out.println("Codigo: " + d.getCodigo());
			System.out.println("Salario Bruto: " + d.calculaSalario());
			System.out.println("Horas: " + d.getHoras());
			System.out.println("Tese: " + d.getTese());
			System.out.println("-----------------------------");
		});

	}

	public void listaPessoasM() {//lista todos os professores com mestrado
		professorM.forEach((m) -> {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + m.getNome());
			System.out.println("Idade: " + m.getIdade());
			System.out.println("Codigo: " + m.getCodigo());
			System.out.println("Salario: " + m.getSalario());

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
