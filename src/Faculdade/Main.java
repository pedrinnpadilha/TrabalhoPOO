package Faculdade;

import java.io.IOException;
import java.util.Scanner;



public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		Scanner dados = new Scanner(System.in);
		Scanner dados1 = new Scanner(System.in);
	    Scanner dados2 = new Scanner(System.in);
	    Scanner dados3 = new Scanner(System.in);
	    Scanner dados4 = new Scanner(System.in);
	    Scanner dados5 = new Scanner(System.in);
	    
	    
	    //Pessoa pessoa = new Pessoa();
	    Professor professor = new Professor();
	    //ProfessorDoutorado pd = new ProfessorDoutorado();
	    Controller controller = new Controller();

	    String nome = "";
	    int idade = 0;
	    int codigo = 0;
	    double salario = 0;
	    int horas = 0;
	  
	    	    
	    int numopc = 0;
	   
	    do { 
	    	
	    	 System.out.println(
	 	     "__________________MENU______________________\n "
	 	     +"1-Cadastrar Professor\n"
	 	     +"2-Listar Professores com Doutorado\n"
	 	     +"3-Listar Professores com Mestrado\n "
	 	     +"4-Pesquisar por nome\n"
	 	     +"99-Sair\n");
	 	    

	 	    System.out.print( "nº: ");

	 	    numopc = dados.nextInt();


	        switch (numopc) {

	            case 1:
	            	System.out.println("Professor Com Doutorado (1)  ou Mestrado (2)? ");
	            	int p = dados.nextInt();
	            	
	            	if (p==1)
	            	{
	            	
	                System.out.println("Nome do professor: ");
	                nome = dados1.nextLine();
	                professor.setNome(nome);

	                System.out.println("Idade: ");
	                idade = dados2.nextInt();
	                professor.setIdade(idade);

	                System.out.println("Codigo: ");
	                codigo = dados3.nextInt();
	                professor.setCodigo(codigo);
	                
	                System.out.println("Salario: ");
	                salario = dados4.nextDouble();
	                professor.setSalario(salario);
	                
	                System.out.println("Horas: ");
	                horas = dados5.nextInt();
	                professor.setHoras(horas);             
	                
	                controller.adicionar(professor);
	                professor = new Professor();
	            	}
	                if (p==2)
	                {
	                	System.out.println("Nome do professor: ");
		                nome = dados1.nextLine();
		                professor.setNome(nome);

		                System.out.println("Idade: ");
		                idade = dados2.nextInt();
		                professor.setIdade(idade);

		                System.out.println("Codigo: ");
		                codigo = dados3.nextInt();
		                professor.setCodigo(codigo);		                
		                                
		                System.out.println("Horas: ");
		                horas = dados5.nextInt();
		                professor.setHoras(horas);             
		                
		                controller.adicionarM(professor);
		                professor = new Professor();
	                }
	                break;
	            case 2:
	             controller.listaPessoas();
	                break;	 
	                
	            case 3:
		             controller.listaPessoasM();
		                break;	 
	            case 4:
	            	
	            
		                break;	 
	            case 99:
					System.out.println("Você saiu do programa!");
					break;
				default:
					System.out.println("Opção inválida!");
	        }

	    }while(numopc != 99);
	    
		
	   
		
		
		
	
		/*pd.setNome("Andre");
		pd.setIdade(52);
		pd.setCodigo(123);
		pd.setSalario(5000);
		pd.setHoras(200);
		pd.setExtra(50);
		pd.setTese("Defendida");
		
		System.out.println(pd.getNome());
		System.out.println(pd.getIdade());
		System.out.println(pd.getCodigo());
		System.out.println(pd.getSalario());
		System.out.println(pd.getHoras());
		System.out.println(pd.getExtra());
		System.out.println(pd.getTese());*/
		
	/*	ArrayList<String> Pessoaa = new ArrayList<String>();
		

        

        do{
            System.out.println("##ESCOLHA UMA OPÇÃO##\n");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair \n");
            System.out.println("Digite uma opção: ");
            
            op = teclado.nextInt();
            switch(op)
            {
            
           
                case 1:
                    System.out.println("Bem vindo ao sistema de cadastro de Alunos\n");

                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.println("Idade: ");
                    int idade = teclado.nextInt();
                    

                case 2:
                    System.out.println("Bem vindo ao sistema de cadastro de Professores");

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(op != 3);
    }
*/
						  
		  


	
		
		
	}}

