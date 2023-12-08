package projetojava.src.Service;

import projetojava.src.Entities.Livro;
import projetojava.src.Entities.Usuario;
import projetojava.src.Repository.BibliotecaRepository;

import java.util.List;
import java.util.Scanner;

public class BibliotecaService {

    private List<Livro> livros;
    private Usuario usuario;
    BibliotecaRepository bibliotecaRepository = new BibliotecaRepository();

    public BibliotecaService(Usuario usuario) {
        this.livros = bibliotecaRepository.getLivrosDisponiveis();
        this.usuario = usuario;
    }

    public void solicitarLivro(Scanner scanner) {
        System.out.println("Livros disponíveis: ");
        for (Livro livro: livros) {
            System.out.println(livros.indexOf(livro) + " - " + livro.getTitulo());
        }

        System.out.println("Digite o número do livro que deseja solicitar: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (index >= 0 && index < livros.size()) {
            Livro livroSelecionado = livros.get(index);

            System.out.println("Livro encontrado!");
            System.out.println("Titulo: " + livroSelecionado.getTitulo());
            System.out.println("Autor: " + livroSelecionado.getAutor());
            System.out.println("Editora: " + livroSelecionado.getEditora());
            System.out.println("Edição: " + livroSelecionado.getEdicao());
            System.out.println("Ano: " + livroSelecionado.getAno());
            System.out.println("Sinopse: " + livroSelecionado.getSinopse());
            System.out.println("Deseja solicitar esse livro? (S/N)");

            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Livro solicitado com sucesso!");
                usuario.addLivro(livroSelecionado);
                bibliotecaRepository.removerLivro(index);
            } else {
                System.out.println("Livro não solicitado!");
            }
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarMeusLivros() {
        List<Livro> livrosDoUsuario = usuario.getLivros();

        if (livrosDoUsuario == null || livrosDoUsuario.isEmpty()) {
            System.out.println("Você não possui livros!");
        } else {
            System.out.println("Meus livros: ");
            for (Livro livro: livrosDoUsuario) {
                System.out.println(livrosDoUsuario.indexOf(livro) + " - " + livro.getTitulo());
            }
        }
    }

    // Other methods related to the library can be added here
}
