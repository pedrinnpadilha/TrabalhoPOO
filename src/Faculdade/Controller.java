package Faculdade;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	ArrayList<Professor> professorD = new ArrayList<>();
	ArrayList<Professor> professorM = new ArrayList<>();
	ArrayList<Turma> turma = new ArrayList<>();

	public void adicionarD(Professor pd) {// adiciona um professor com doutorado
		professorD.add(pd);
	}

	public void adicionarM(Professor pm) {// adiciona um professor com mestrado
		professorM.add(pm);
	}

	public void adicionarT(Turma t) {// adiciona uma turma
		turma.add(t);
	}

	public void listaPessoasD() {// lista todos os professores com doutorado
		if (professorD.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
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

	public void listaPD() {// lista todos os professores com doutorado
		if (professorD.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			professorD.forEach((pd) -> {
				System.out.println("-----------------------------");
				System.out.println("Nome: " + pd.getNome());
				System.out.println("Codigo: " + pd.getCodigo());
				System.out.println("-----------------------------");
			});

	}

	public void listaPM() {// lista todos os professores com mestrado
		if (professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			professorM.forEach((pm) -> {
				System.out.println("-----------------------------");
				System.out.println("Nome: " + pm.getNome());
				System.out.println("Codigo: " + pm.getCodigo());
				System.out.println("-----------------------------");
			});

	}
	public void listaPessoasM() {// lista todos os professores com mestrado
		if (professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			professorM.forEach((pm) -> {
				System.out.println("-----------------------------");
				System.out.println("Nome: " + pm.getNome());
				System.out.println("Idade: " + pm.getIdade());
				System.out.println("Codigo: " + pm.getCodigo());
				System.out.println("Salario: " + pm.getSalario());

				System.out.println("-----------------------------");
			});
	}

	public void listaTurma() {// lista todas as turmas
		turma.forEach((t) -> {
			System.out.println("-----------------------------");
			System.out.println("Codigo: " + t.getNumero());
			System.out.println("Turno: " + t.getTurno());
			System.out.println("Professor: " + t.getProf());

			System.out.println("-----------------------------");
		});

	}

	public void listarD() {// lista todas as turmas
		for (int i = 0; i < professorD.size(); i++) {
			System.out.println(professorD.get(i).getNome());
		}
	}

	public void pesquisarD(int c) {// lista todas as turmas
		int cont=0;
		if (professorD.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			for (int i = 0; i < professorD.size(); i++) {
				if (professorD.get(i).getCodigo() == c) {
					System.out.println("-----------------------------");
					System.out.println("Nome: " + professorD.get(i).getNome());
					System.out.println("Codigo: " + professorD.get(i).getCodigo());
					System.out.println("Idade: " + professorD.get(i).getIdade());
					System.out.println("-----------------------------");
					cont++;
				}
				if(cont==0)
					System.out.println("Nenhum Professor encontrado!");
			}
	}

	public void pesquisarM(int c) {// lista todas as turmas
		int cont=0;
		if (professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			for (int i = 0; i < professorM.size(); i++) {
				if (professorM.get(i).getCodigo() == c) {
					System.out.println("-----------------------------");
					System.out.println("Nome: " + professorM.get(i).getNome());
					System.out.println("Codigo: " + professorM.get(i).getCodigo());
					System.out.println("Idade: " + professorM.get(i).getIdade());
					System.out.println("-----------------------------");
					cont++;

				}
				if(cont==0)
					System.out.println("Nenhum Professor encontrado!");
			}

	}

	public void agregarD(int cc, int tt) {// lista todas as turmas
		String teste = null;
		for (int i = 0; i < professorD.size(); i++) {
			if (professorD.get(i).getCodigo() == cc) {

				teste = professorD.get(i).getNome();

			}
		}

		turma.get(tt).setProf(teste);
	}

	public void agregarM(int cc, int tt) {// lista todas as turmas
		String teste = null;
		for (int i = 0; i < professorM.size(); i++) {
			if (professorM.get(i).getCodigo() == cc) {

				teste = professorM.get(i).getNome();

			}
		}

		turma.get(tt).setProf(teste);
	}

}
