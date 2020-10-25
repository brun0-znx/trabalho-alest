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
	public void executa() {

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

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					System.out.println("Saindo...");
					System.exit(0);
					break;
				default:
					System.out.println("Esta opção não existe! Digite novamente.");
			}
		} while (opcao != 4);
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
				.println("                  |     2 - ?                                                             |");
		System.out
				.println("                  |     3 - ?                                                             |");
		System.out
				.println("                  |     4 - ?                                                             |");
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
}
