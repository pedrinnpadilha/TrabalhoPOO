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

	public void listaPD() {// lista todos os professores com doutorado somente com nome e codigo
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

	public void listaPessoasM() {// lista todos os professores com mestrado
		if (professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else
			professorM.forEach((pm) -> {
				System.out.println("-----------------------------");
				System.out.println("Nome: " + pm.getNome());
				System.out.println("Idade: " + pm.getIdade());
				System.out.println("Codigo: " + pm.getCodigo());
				System.out.println("Salario: " + pm.calculaSalario());

				System.out.println("-----------------------------");
			});
	}

	public void listaPM() {// lista todos os professores com mestrado somente com nome e codigo
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

	public void listaTurma() {// lista todas as turmas
		turma.forEach((t) -> {
			System.out.println("-----------------------------");
			System.out.println("Codigo: " + t.getNumero());
			System.out.println("Turno: " + t.getTurno());
			System.out.println("Professor: " + t.getProf());

			System.out.println("-----------------------------");
		});

	}

	public void pesquisar() {// void para pesquisar. Usuario informar um codigo, e o sistema pesquisa se esse
								// codigo esta em alguma classe
		Scanner teclado = new Scanner(System.in);
		int cont1 = 0;
		int cont2 = 0;

		if (professorD.isEmpty() && professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else {

			System.out.println("Informe o codigo a ser pesquisado ");
			int pes = teclado.nextInt();
			for (int i = 0; i < professorD.size(); i++) {
				if (professorD.get(i).getCodigo() == pes) {
					System.out.println("-----------------------------");
					System.out.println("Nome: " + professorD.get(i).getNome());
					System.out.println("Codigo: " + professorD.get(i).getCodigo());
					System.out.println("Idade: " + professorD.get(i).getIdade());
					System.out.println("Classe: Doutor");
					System.out.println("-----------------------------");
					cont1++;
				}

			}
			for (int i = 0; i < professorM.size(); i++) {
				if (professorM.get(i).getCodigo() == pes) {
					System.out.println("-----------------------------");
					System.out.println("Nome: " + professorM.get(i).getNome());
					System.out.println("Codigo: " + professorM.get(i).getCodigo());
					System.out.println("Idade: " + professorM.get(i).getIdade());
					System.out.println("Classe: Mestre");
					System.out.println("-----------------------------");
					cont2++;

				}

			}
		}
		if (cont1 == 0 && cont2 == 0) {
			System.out.println("Nenhum Professor encontrado!");

		}

	}

	public void agregarD() {// Alocar um professor com Doutorado a uma turma
		Scanner teclado2 = new Scanner(System.in);
		int et = 0;
		String teste = null;
		
		if (professorD.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else {
			System.out.println("Informe a turma que deseja incluir um professor ");
			et = teclado2.nextInt();
			et = et - 1;
			if (et < 4) {
				System.out.println("Professores Cadastrados");
				listaPD();
				System.out.println("Informe o codigo do professor com Doutorado que deseja colocar na turma: ");
				int c1 = teclado2.nextInt();
				for (int i = 0; i < professorD.size(); i++) {
					if (professorD.get(i).getCodigo() == c1) {

						teste = professorD.get(i).getNome();
						turma.get(et).setProf(teste);
					

					}
				}
			} else {
				System.out.println("Turma Inválida");
			}

		}

	}

	public void agregarM() {// Alocar um professor com Mestrado a uma turma
		Scanner teclado2 = new Scanner(System.in);
		int et = 0;
		String teste = null;
		if (professorM.isEmpty()) {
			System.out.println("Nenhum Professor cadastrado!");
		} else {
			System.out.println("Informe a turma que deseja incluir um professor ");
			et = teclado2.nextInt();
			et = et - 1;
			if (et < 4) {
				System.out.println("Professores Cadastrados");
				listaPM();
				System.out.println("Informe o codigo professor com Mestrado que deseja colocar na turma: ");
				int c1 = teclado2.nextInt();
				for (int i = 0; i < professorM.size(); i++) {
					if (professorM.get(i).getCodigo() == c1) {

						teste = professorM.get(i).getNome();
						turma.get(et).setProf(teste);

					}
				}
			} else {
				System.out.println("Turma Inválida");

			}

		}
	}
}
