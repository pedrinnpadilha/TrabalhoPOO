package Faculdade;

import java.awt.List;
import java.util.ArrayList;

public class Controller {	

			
		ArrayList<Professor> professor = new ArrayList<>();
		ArrayList<Professor> professorM = new ArrayList<>();


		public void adicionar(Professor cp) {
			professor.add(cp);
		}
		
		public void adicionarM(Professor m) {
			professorM.add(m);
		}


		public void listaPessoas() {
			professor.forEach((p) -> {
		        System.out.println("Nome: " + p.getNome());
		        System.out.println("Idade: " + p.getIdade());
		        System.out.println("Codigo: " + p.getCodigo());
		        System.out.println("Salario: " + p.getSalario());
		        System.out.println("Horas: " + p.getHoras());
		       System.out.println("-----------------------------");
		    });
		

	}
		
		public void listaPessoasM() {
			professorM.forEach((p) -> {
		        System.out.println("Nome: " + p.getNome());
		        System.out.println("Idade: " + p.getIdade());
		        System.out.println("Codigo: " + p.getCodigo());
		        System.out.println("Salario: " + p.getHoras());

		       System.out.println("-----------------------------");
		    });
	}
}

