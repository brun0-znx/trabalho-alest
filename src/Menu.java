import java.util.Scanner;

public class Menu {

	private Scanner scan;

	/**
	 * Construtor
	 */
	public Menu() {
		scan = new Scanner(System.in);
	}

	/**
	 * Execução da interface do usuário
	 */
	public void executaMenu(ListaRuas listaRuas) {

		int opcao;

		do {
			apresentaMenuOpcoes();
			System.out.print("Digite a opção desejada: ");
			opcao = leInteiro();
			System.out.println("*************************************************");
			switch (opcao) {
				case 1:
					System.out.println("Sistema de consultas sobre os acidentes de trânsito de Porto Alegre");
					break;
				case 2:
					listaRuas.printar();
					break;
				case 3:
					menuConsultas();
					break;
				case 4:
					System.out.println(listaRuas.mostrarTotalAcidentesMoto());
					break;
				case 5:
					System.out.println("Saindo...");
					System.exit(0);
					break;
				default:
					System.out.println("Esta opção não existe! Digite novamente.");
			}
		} while (opcao != 5);
	}

	/**
	 * Menu de opções
	 */
	private void apresentaMenuOpcoes() {
		System.out.println("\n                                         ### Bem-vindo(a)! ###");
		System.out
				.println("                   ========================================================================");
		System.out
				.println("                  |     1 - Sobre                                                         |");
		System.out
				.println("                  |     2 - Navegar                                                       |");
		System.out
				.println("                  |     3 - Consultas                                                     |");
		System.out
				.println("                  |     4 - Total de acidentes envolvendo moto                            |");
		System.out
				.println("                  |     5 - Sair                                                          |");
		System.out.println(
				"                   ========================================================================\n");
	}

	/**
	 * Leitura de um número inteiro do teclado
	 * 
	 * @return número inteiro digitado
	 */
	private int leInteiro() {
		int numero = -1;
		boolean ok = false;
		while (!ok) {
			try {
				numero = scan.nextInt();
				ok = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida! Digite um número inteiro.");
			} finally {
				String aux = scan.nextLine();
			}
		}
		return numero;
	}

	/**
	 * Submenu para consultas
	 */
	private void menuConsultas() {
		System.out.println("\n                                         ### Você selecionou: Consultas! ###");
		System.out
				.println("                   ========================================================================");
		System.out
				.println("                  |     1 - RUA/AVENIDA/TRAVESSIA com mais acidentes                      |");
		System.out
				.println("                  |     2 - Dia da semana em X local que mais ocorreram acidentes         |");
		System.out
				.println("                  |     3 - Voltar para o menu principal                                  |");
		System.out.println(
				"                   ========================================================================\n");
		
		int opcao = -1;

		do {
			opcao = leInteiro();
			System.out.println("*************************************************");
			switch (opcao) {
				case 1:
					// TODO: método para mostrar RUA/AVENIDA/TRAVESSIA com mais acidentes  
				case 2:
					// TODO: método para mostrar dia da semana em X local que mais ocorreram acidentes   
					break;
				case 3:
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Esta opção não existe! Digite novamente.");
			}
		} while (opcao != 3);
	}

}

