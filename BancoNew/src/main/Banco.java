package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banco.Cliente;
import dao.ClienteDAO;

public class Banco {

	private Scanner scanner = new Scanner(System.in);
	int opcao;

	public void menu() {

		Scanner menu = new Scanner(System.in);

		do {
			System.out.println("MENU");
			System.out.println("1 - Cadastro de Cliente.");
			System.out.println("2 - Cadastro de C.C");
			System.out.println("3 - Cadastro de C.P");
			System.out.println("4 - Sacar.");
			System.out.println("5 - Depositar.");
			System.out.println("0 - Sair.");
			System.out.print("Escolha uma opção: ");
			opcao = menu.nextInt();

			switch (opcao) {
				case 1:
				System.out.println("Cadastro de Cliente:");
				menuCliente();
				break;
				
				case 2:
				System.out.println("Cadastro de Conta Corrente: ");
				break;

				case 3:
				System.out.println("Cadastro de Conta Poupança: ");
				break;

				case 4:
				System.out.println("Realizar saque: ");
				break;

				case 5:
				System.out.println("Realizar Deposito: ");
				break;

				case 0:
				System.out.println("Saindo do programa...");
				break;

				default:
				System.out.println("Opção Invalida. Por favor, escolha novamente.");
				break;

			}

			System.out.println();

		} while (opcao != 0);
		
	  }

	  private void menuCliente(){

		do {
			System.out.println("1 - Listar.");
			System.out.println("2 - Cadastrar.");
			System.out.println("3 - Atualizar.");
			System.out.println("4 - Excluir.");
			System.out.println("0 - Retornar ao menu principal.");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			ClienteDAO dao = new ClienteDAO();
			List<Cliente> clientes;
			Cliente cliente;
			

			switch (opcao) {
				case 1:

				String cabecalho = "+-"+formatarString("", 4, "-")+"-+-"+formatarString("", 70, "-")+"-+-"+formatarString("", 70, "-")+"-+";

				System.out.println(cabecalho);

				System.out.println("| "+formatarString("ID", 4, " ")+" | "+formatarString("Nome", 70, " ")+" | "+formatarString("Endereço", 70, " ")+" |");

				System.out.println(cabecalho);

				for (Cliente c : dao.recuperar()) {
					System.out.println("| "+formatarString(String.valueOf(c.getId()), 4, " ")+" | "+formatarString(c.getNome(), 70, " ")+" | "+formatarString(c.getEndereco(), 70, " ")+" |");
					
				}
				System.out.println(cabecalho);
				break;
				
				case 2:
				clientes = new ArrayList<>();
				clientes = dao.recuperar();
				cliente = new Cliente();
				System.out.print("ID: ");
				cliente.setId(scanner.nextInt());
				scanner.nextLine();
				System.out.print("Nome: ");
				cliente.setNome(scanner.nextLine());
				System.out.print("Endereço: ");
				cliente.setEndereco(scanner.nextLine());
				clientes.add(cliente);
				dao.salvar(clientes);
				System.out.println("Cliente "+cliente.getNome()+" salvo com sucesso.");
				break;

				case 3:
				cliente = new Cliente();
				System.out.println("Id cliente: ");
				cliente = dao.consultar(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Novo endereço");
				cliente.setEndereco(scanner.nextLine());
				dao.atualizarCliente(cliente);
				break;

				case 4:
				System.out.println("Id cliente: ");
				dao.excluirCliente(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Cliente excluido com sucesso");
				break;
				
				case 0:
				menu();
				break;

				default: 
				System.out.println("Opção invalida. Por favor, escolha novamente");

			}
		} while (opcao != 0);
	  }

	  private String formatarString(String texto, int tamanho, String preenchimento) {

		int tamanhoDesejado = tamanho;
		int espacoEmBranco = tamanhoDesejado - texto.length();
		if (espacoEmBranco > 0 ) {
			StringBuilder builder = new StringBuilder(texto);
			for (int i = 0; i < espacoEmBranco; i++) {
				builder.append(preenchimento);
			}
			return builder.toString();
		} else {
			return texto;
		}
	  }
	}


