package Faculdade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner dados = new Scanner(System.in);

		ProfessorDoutorado pd = new ProfessorDoutorado();
		ProfessorMestre pm = new ProfessorMestre();
		Controller controller = new Controller();

		Turma t = new Turma();// abre uma turma nova
		t.setNumero(1);
		t.setTurno("Manhã");
		t.setProf("");
		controller.adicionarT(t);// insere os dados, e adiciona
		t = new Turma();
		t.setNumero(2);
		t.setTurno("Manhã");
		t.setProf("");
		controller.adicionarT(t);
		t = new Turma();
		t.setNumero(3);
		t.setTurno("Manhã");
		t.setProf("");
		controller.adicionarT(t);
		t = new Turma();

		String nome = "";
		int idade = 0;
		int codigo = 0;
		double salario = 0;
		int horas = 0;
		int te = 0;

		int numopc = 0;

		do {

			System.out.println("__________________MENU______________________\n" + "1-Cadastrar Professor\n"
					+ "2-Listar Professores com Doutorado\n" + "3-Listar Professores com Mestrado\n"
					+ "4-Listar Turmas\n" + "5-turma + professor \n" + "6-Pesquisar professor \n"
					+ "7-Agregar um professor a turma \n"
					+"99-Sair\n");

			System.out.print("Número escolhido => ");

			numopc = dados.nextInt();

			switch (numopc) {

			case 1:
				System.out.println("Escolha o tipo de cadastro:\n" + "Professor Com Doutorado(aperte 1)\n"
						+ "Professor Com Mestrado (aperte 2)? \n");

				System.out.print("Número escolhido => ");
				int p = dados.nextInt();

				if (p == 1) {
					Scanner teclado = new Scanner(System.in);
					System.out.println("Nome do professor: ");
					nome = teclado.nextLine();
					pd.setNome(nome);

					System.out.println("Idade: ");
					idade = teclado.nextInt();
					pd.setIdade(idade);

					System.out.println("Codigo: ");
					codigo = teclado.nextInt();
					pd.setCodigo(codigo);
					

					System.out.println("Salario: ");
					salario = teclado.nextDouble();
					pd.setSalario(salario);

					System.out.println("Horas: ");
					horas = teclado.nextInt();
					pd.setHoras(horas);

					System.out.println("informe o status da teste (1 Aguardando) (2 Aprovada): ");

					te = teclado.nextInt();
					if (te == 1) {

						pd.setTese("Aguardando");
					}
					if (te == 2) {

						pd.setTese("Aprovada");
					}

					controller.adicionarD(pd);
					pd = new ProfessorDoutorado();
				}
				if (p == 2) {
					Scanner teclado = new Scanner(System.in);
					System.out.println("Nome do professor: ");
					nome = teclado.nextLine();
					pm.setNome(nome);

					System.out.println("Idade: ");
					idade = teclado.nextInt();
					pm.setIdade(idade);

					System.out.println("Codigo: ");
					codigo = teclado.nextInt();
					pm.setCodigo(codigo);

					System.out.println("Salario: ");
					salario = teclado.nextInt();
					pm.setSalario(salario);

					System.out.println("Horas: ");
					horas = teclado.nextInt();
					pm.setHoras(horas);

					controller.adicionarM(pm);
					pm = new ProfessorMestre();
				}
				break;
			case 2:
				controller.listaPessoasD();
				break;

			case 3:
				controller.listaPessoasM();
				break;
			case 4:
				controller.listaTurma();
				
				break;
			case 5:
				controller.listarD();
				break;
			case 6:
				Scanner teclado = new Scanner(System.in);
				System.out.println("Informe se deseja procurar um professor com Doutorado (1) ou Mestrado (2) ");
				p = teclado.nextInt();
				if (p == 1) {
					System.out.println("Informe o codigo a ser pesquisado ");
					int c = teclado.nextInt();
					controller.pesquisarD(c);
				}
				if (p == 2) {
					System.out.println("Informe o codigo a ser pesquisado ");
					int c = teclado.nextInt();
					controller.pesquisarM(c);
				}
				break;
			case 7:
				int e = 0;
				Scanner tecladoo = new Scanner(System.in);
				System.out.println("Informe o codigo a ser pesquisado ");
				int c = tecladoo.nextInt();
				System.out.println("Informe a turma ");
				e = tecladoo.nextInt();
				
				if (e == 1) {
					controller.turmam1(c);
				}
				if (e == 2) {
					controller.turmam2(c);
				}
				if (e == 3) {
					controller.turmam3(c);
				}

				break;
			case 99:
				System.out.println("Você saiu do programa!");
				
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (numopc != 99);

	}
}
