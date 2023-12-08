package projetojava.src;
import projetojava.src.Entities.Usuario;
import projetojava.src.Service.BibliotecaService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setEmail("joao@gmail.com");
        usuario.setSenha("123456");
        usuario.setDataNascimento("01/01/2000");
        usuario.setTelefone("999999999");

        BibliotecaService bibliotecaService = new BibliotecaService(usuario);

        boolean sair = true;
        Scanner scanner = new Scanner(System.in);

        while (sair) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("MENU");
            System.out.println("1 - Solicitar Livro");
            System.out.println("2 - Listar meus livros");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcao) {
                case 1:
                    bibliotecaService.solicitarLivro(scanner);
                    break;
                case 2:
                    bibliotecaService.listarMeusLivros();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
