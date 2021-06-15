package Faculdade;

import java.util.ArrayList;




public class Controller {

	ArrayList<Professor> professorD = new ArrayList<>();
	ArrayList<Professor> professorM = new ArrayList<>();
	ArrayList<Turma> turma = new ArrayList<>();

	public void adicionarD(Professor d) {
		professorD.add(d);
	}

	public void adicionarM(Professor m) {
		professorM.add(m);
	}

	public void adicionarT(Turma t) {
		turma.add(t);
	}

	public void listaPessoas() {
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

	public void listaPessoasM() {
		professorM.forEach((m) -> {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + m.getNome());
			System.out.println("Idade: " + m.getIdade());
			System.out.println("Codigo: " + m.getCodigo());
			System.out.println("Salario: " + m.getSalario());

			System.out.println("-----------------------------");
		});
	}

	public void listaTurma() {
		turma.forEach((t) -> {
			System.out.println("-----------------------------");
			System.out.println("Codigo: " + t.getNumero());

			System.out.println("-----------------------------");
		});
	}
	public static boolean encontrou(ArrayList<Professor> professorD, int codigo) {
		if(professorD.contains(codigo)) {
			return true;
		} else {
			return false;
		}
	}

}
