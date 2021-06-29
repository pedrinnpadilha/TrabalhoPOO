package Faculdade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {

	

		ProfessorDoutorado pd = new ProfessorDoutorado();
		ProfessorMestre pm = new ProfessorMestre();
		Controller controller = new Controller();
		Random random = new Random();
		
		Scanner dados = new Scanner(System.in);

		Turma t = new Turma();// abre uma turma nova
		t.setNumero(1);
		t.setTurno("Manh�");
		t.setProf("");
		controller.adicionarT(t);// insere os dados, e adiciona
		t = new Turma();
		t.setNumero(2);
		t.setTurno("Manh�");
		t.setProf("");
		controller.adicionarT(t);
		t = new Turma();
		t.setNumero(3);
		t.setTurno("Manh�");
		t.setProf("");
		controller.adicionarT(t);
		t = new Turma();

		String nome = "";
		int idade = 0;
		double salario = 0;
		int horas = 0;
		int te = 0;
		int numero = random.nextInt(200);

		int numopc = 0;

		do {

			System.out.println("__________________MENU______________________\n" + "1-Cadastrar Professor\n"
					+ "2-Listar Professores com Doutorado\n" + "3-Listar Professores com Mestrado\n"
					+ "4-Listar Turmas\n" + "5-Pesquisar professor \n" + "6-Agregar um professor a turma \n"
					+ "99-Sair\n");

			System.out.print("N�mero escolhido => ");

			numopc = dados.nextInt();

			switch (numopc) {

			case 1:
				System.out.println("Escolha o tipo de cadastro:\n" + "Professor Com Doutorado(aperte 1)\n"
						+ "Professor Com Mestrado (aperte 2) \n");

				System.out.print("N�mero escolhido => ");
				int p = dados.nextInt();

				if (p == 1) {
					Scanner teclado = new Scanner(System.in);
					System.out.println("Nome do professor: ");
					nome = teclado.nextLine();
					pd.setNome(nome);

					System.out.println("Idade: ");
					idade = teclado.nextInt();
					pd.setIdade(idade);

					numero = random.nextInt(200);
					pd.setCodigo(numero);

					System.out.println("Salario: ");
					salario = teclado.nextDouble();
					pd.setSalario(salario);

					System.out.println("Horas: ");
					horas = teclado.nextInt();
					pd.setHoras(horas);

					System.out.println("informe o status da Tese (1 Aguardando) (2 Aprovada): ");
					
					te = teclado.nextInt();
					if (te == 1) {

						pd.setTese("Aguardando");
					}
					if (te == 2) {

						pd.setTese("Aprovada");
					}

					controller.adicionarD(pd);
					pd = new ProfessorDoutorado();
					System.out.println("Professor com Doutorado Cadastrado com Sucesso!! ");
				}
				if (p == 2) {
					Scanner teclado = new Scanner(System.in);
					System.out.println("Nome do professor: ");
					nome = teclado.nextLine();
					pm.setNome(nome);

					System.out.println("Idade: ");
					idade = teclado.nextInt();
					pm.setIdade(idade);

					numero = random.nextInt(200);
					pm.setCodigo(numero);

					System.out.println("Salario: ");
					salario = teclado.nextInt();
					pm.setSalario(salario);

					System.out.println("Horas: ");
					horas = teclado.nextInt();
					pm.setHoras(horas);

					controller.adicionarM(pm);
					pm = new ProfessorMestre();
					System.out.println("Professor com Mestrado Cadastrado com Sucesso!! ");
				}
				if (p > 2) {
					System.out.println("Op��o Errada! ");
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
				controller.pesquisar();
				break;
			case 6:
				Scanner teclado2 = new Scanner(System.in);
				System.out.println("Informe se deseja escolher um professor com Doutorado (1) ou Mestrado (2) ");
				p = teclado2.nextInt();
				if (p == 1) {
					System.out.println("Turmas Cadastradas "); // lista todas as turmas cadastradas
					controller.listaTurma();
					controller.agregarD();
				}
				if (p == 2) {
					System.out.println("Turmas Cadastradas "); // lista todas as turmas cadastradas
					controller.listaTurma();
					controller.agregarM();
				}
				if (p > 2) {
					System.out.println("Op��o Errada! ");
				}
				break;
			case 99:
				System.out.println("Voc� saiu do programa!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}

		} while (numopc != 99);

	}
}
