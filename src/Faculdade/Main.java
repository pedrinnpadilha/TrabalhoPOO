package Faculdade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		// Scanner teclado = new Scanner(System.in);
		Scanner dados = new Scanner(System.in);
		Scanner dados1 = new Scanner(System.in);
		Scanner dados2 = new Scanner(System.in);
		Scanner dados3 = new Scanner(System.in);
		Scanner dados4 = new Scanner(System.in);
		Scanner dados5 = new Scanner(System.in);
		Scanner dados6 = new Scanner(System.in);

		int cod = 123;

		ProfessorDoutorado pd = new ProfessorDoutorado();
		ProfessorMestre pm = new ProfessorMestre();
		Controller controller = new Controller();
		Turma t = new Turma();
		int numero = 123;
		t.setNumero(numero);
		controller.adicionarT(t);
		t = new Turma();
		numero = 124;
		t.setNumero(numero);
		controller.adicionarT(t);
		t = new Turma();
		numero = 125;
		t.setNumero(numero);
		controller.adicionarT(t);
		t = new Turma();

		String nome = "";
		int idade = 0;
		int codigo = 0;
		double salario = 0;
		int horas = 0;
		String tese = "";

		int numopc = 0;

		do {

			System.out.println("__________________MENU______________________\n" + "1-Cadastrar Professor\n"
					+ "2-Listar Professores com Doutorado\n" + "3-Listar Professores com Mestrado\n"
					+ "4-Listar Turmas\n" + "5-turma + professor \n" + "99-Sair\n");

			System.out.print("Número escolhido => ");

			numopc = dados.nextInt();

			switch (numopc) {

			case 1:
				System.out.println("Escolha o tipo de cadastro:\n" + "Professor Com Doutorado(aperte 1)\n" + "ou \n"
						+ "Professor Com Mestrado (aperte 2)? \n");

				System.out.print("Número escolhido => ");
				int p = dados.nextInt();

				if (p == 1) {

					System.out.println("Nome do professor: ");
					nome = dados1.nextLine();
					pd.setNome(nome);

					System.out.println("Idade: ");
					idade = dados2.nextInt();
					pd.setIdade(idade);

					System.out.println("Codigo: ");
					codigo = dados3.nextInt();
					pd.setCodigo(codigo);

					System.out.println("Salario: ");
					salario = dados4.nextDouble();
					pd.setSalario(salario);

					System.out.println("Horas: ");
					horas = dados5.nextInt();
					pd.setHoras(horas);

					System.out.println("informe o status da teste (1 Aguardando) (2 Aprovada): ");
					int te = 0;
					te = dados6.nextInt();
					if (te == 1) {
						//tese = dados6.nextLine();
						pd.setTese("Aguardando");
					}
					if (te == 2) {
						//tese = dados6.nextLine();
						pd.setTese("Aprovada");
					}

					controller.adicionarD(pd);
					pd = new ProfessorDoutorado();
				}
				if (p == 2) {
					System.out.println("Nome do professor: ");
					nome = dados1.nextLine();
					pm.setNome(nome);

					System.out.println("Idade: ");
					idade = dados2.nextInt();
					pm.setIdade(idade);

					System.out.println("Codigo: ");
					codigo = dados3.nextInt();
					pm.setCodigo(codigo);

					System.out.println("Salario: ");
					salario = dados4.nextInt();
					pm.setSalario(salario);

					System.out.println("Horas: ");
					horas = dados5.nextInt();
					pm.setHoras(horas);

					controller.adicionarM(pm);
					pd = new ProfessorDoutorado();
				}
				break;
			case 2:
				controller.listaPessoas();
				break;

			case 3:
				controller.listaPessoasM();
				break;
			case 4:
				controller.listaTurma();

				break;
			case 5:
				
				
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
