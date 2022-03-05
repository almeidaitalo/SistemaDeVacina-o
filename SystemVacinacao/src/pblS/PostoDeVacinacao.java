package pblS;

import java.text.ParseException;
import java.util.Scanner;

public class PostoDeVacinacao {

	public static void main(String[] args) throws ParseException {

		ControlarPaciente g = new ControlarPaciente();

		Scanner input = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("Menu de opções:");
			System.out.println("\t[1] Fase 1");
			System.out.println("\t[2] Fase 2");
			System.out.println("\t[3] Fase 3");
			System.out.println("\t[4] Fase 4");
			System.out.println("\t[5] Exibir paciente");
			System.out.println("\t[6] Remover paciente");
			System.out.println("\t[7] Desenfileira paciente");
			System.out.println("\t[8] Finalizar sistema");
			System.out.println("Informe sua opção: ");

			opcao = input.nextInt();
			switch (opcao) {

			case 1:

				System.out.println("===== Fase 1 =====");

				System.out.println("Informe o nome: "); 
				String nome = input.next();

				System.out.println("Informe idade: ");
				int idade = input.nextInt();

				System.out.println("Você é profissional de saúde:(S/N)?");
				String Profissional = input.next();

				if (Profissional.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 1: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");

					input.next();

				} else if (Profissional.equalsIgnoreCase("N")) {
					System.out.println("Continue!");

				}
				System.out.println("Você é pessoa com 60+ institucionalizado:(S/N)?");
				Profissional = input.next();
				if (Profissional.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 1: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");

					input.next();

				} else if (Profissional.equalsIgnoreCase("N")) {
					System.out.println("Continue!");
				}
				
				System.out.println("Você é Indígena aldeados:(S/N)?");
				Profissional = input.next();
				if (Profissional.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 1: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");

					input.next();

				} else if (Profissional.equalsIgnoreCase("N")) {
					System.out.println("Procure outra fase!");
				}
				break;
			case 2:
				System.out.println("===== Fase 2 =====");

				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe idade: ");
				idade = input.nextInt();
				
				if(idade >= 60 ) {
					g.InserirPaciente("Fase 2: " + nome, idade);//metodo de enfeleira
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if(idade <= 80) {
					System.out.println("Procure outra fase!");
				
				}
				
				
				break;
			case 3:
				System.out.println("===== Fase 3 =====");

				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe idade: ");
				idade = input.nextInt();

				System.out.println("Você tem comorbidades:(S/N)?");
				String Comorbidades = input.next();

				if (Comorbidades.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 3: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if (Comorbidades.equalsIgnoreCase("N")) {
					System.out.println("Procure outra fase!");
				}
				break;
			case 4:
				System.out.println("===== Fase 4 =====");

				System.out.println("Informe o nome: ");
				nome = input.next();
				System.out.println("Informe idade: ");
				idade = input.nextInt();
				
				System.out.println("Você é Professor(a):(S/N)?");
				String Professor = input.next();
				if (Professor.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 4: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if (Professor.equalsIgnoreCase("N")) {
					System.out.println("Continue!");
				}
				
				System.out.println("Você é Profissionais das forças de segurança:(S/N)?");
				String forçasDesegurança = input.next();
				if (forçasDesegurança.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 4: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if (forçasDesegurança.equalsIgnoreCase("N")) {
					System.out.println("Continue!");
				}
				
				System.out.println("Você é pessoas privadas de liberdades:(S/N)?");
				String PrivadasDeliberdades = input.next();
				if (PrivadasDeliberdades.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 4: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if (PrivadasDeliberdades.equalsIgnoreCase("N")) {
					System.out.println("Continue!");
				}
				
				System.out.println("Você é funcionário do sistema prisional :(S/N)?");
				String FuncionáriosPrisional = input.next();
				if (FuncionáriosPrisional.equalsIgnoreCase("S")) {
					g.InserirPaciente("Fase 4: " + nome, idade);
					System.out.println("\nCadastro criada com sucesso. Pressione qualquer tecla para continuar...");
					input.next();
				} else if (FuncionáriosPrisional.equalsIgnoreCase("N")) {
					System.out.println("Procure outra!");
				}

				break;
			case 5:
				System.out.println("===== Exibir paciente =====");

				g.ExibirPaciente();
				break;
			case 6:
				System.out.println("===== Remover paciente =====");
				g.RemoverPaciente();
				
				//Para remover é só clicar no número 5 quantas vezes for necessário para remover
				break;
			case 7:
				System.out.println("===== Desenfileirar paciente =====");
				g.desenfileira();
				//Metodo para remover elemento na primeira posição
				break;
			case 8:
				System.out.println("===== Finalizar sistema =====");
			}

		} while (opcao != 8);
		input.close();
	}
}