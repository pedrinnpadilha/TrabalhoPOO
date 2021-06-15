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
		
		Turma t = new Turma();//abre uma turma nova
		t.setNumero(123);
		t.setTurno("Manh�");
		controller.adicionarT(t);//insere os dados, e adiciona
		t = new Turma();		
		t.setNumero(124);
		t.setTurno("Manh�");
		controller.adicionarT(t);
		t = new Turma();		
		t.setNumero(125);
		t.setTurno("Manh�");
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
					+ "4-Listar Turmas\n" + "5-turma + professor \n" + "99-Sair\n");

			System.out.print("N�mero escolhido => ");

			numopc = dados.nextInt();

			switch (numopc) {

			case 1:
				System.out.println("Escolha o tipo de cadastro:\n" + "Professor Com Doutorado(aperte 1)\n" + "ou \n"
						+ "Professor Com Mestrado (aperte 2)? \n");

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
					pd = new ProfessorDoutorado();
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
