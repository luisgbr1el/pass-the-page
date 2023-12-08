import projetojava.src.Entities.Usuario;
import projetojava.src.Entities.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List < Livro > livros = new ArrayList < Livro > ();

        boolean sair = true;

        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setEmail("joao@gmail.com");
        usuario.setSenha("123456");
        usuario.setDataNascimento("01/01/2000");
        usuario.setTelefone("999999999");


        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setAutor("J. R. R. Tolkien");
        livro1.setEditora("HarperCollins");
        livro1.setEdicao("1ª");
        livro1.setAno("2019");
        livro1.setSinopse("O Senhor dos Anéis é um livro de fantasia criado pelo escritor, professor e filólogo britânico J. R. R. Tolkien. A história começa como sequência de um livro anterior de Tolkien, O Hobbit, e logo se desenvolve numa história muito maior.");


        Livro livro2 = new Livro();
        livro2.setTitulo("Os Sete Maridos de Evelyn Hugo");
        livro2.setAutor("Taylor Jenkins Reid");
        livro2.setEditora("Paralela");
        livro2.setEdicao("1ª");
        livro2.setAno("2019");
        livro2.setSinopse("Evelyn Hugo sempre esteve sob os holofotes – seja estrelando uma produção vencedora do Oscar, protagonizando algum escândalo ou aparecendo com um novo marido… pela sétima vez. Agora, prestes a completar oitenta anos e reclusa em seu apartamento no Upper East Side, a famigerada atriz decide contar a própria história – ou sua “verdadeira história” –, mas com uma condição: que Monique Grant, jornalista iniciante e até então desconhecida, seja a entrevistadora. Ao embarcar nessa misteriosa empreitada, a jovem repórter começa a se dar conta de que nada é por acaso – e que suas trajetórias podem estar profunda e irreversivelmente conectadas.");


        Livro livro3 = new Livro();

        livro3.setTitulo("O Sol é Para Todos");
        livro3.setAutor("Harper Lee");
        livro3.setEditora("José Olympio");
        livro3.setEdicao("1ª");
        livro3.setAno("2015");
        livro3.setSinopse("Um dos maiores clássicos da literatura mundial. O sol é para todos ganhou o Prêmio Pulitzer em 1961 e deu origem a um filme homônimo, vencedor do Oscar de melhor roteiro adaptado, em 1962. Lançado pela primeira vez em 1960, até hoje vende mais de um milhão de cópias por ano em língua inglesa. Uma história atemporal sobre tolerância, perda da inocência e conceito de justiça. ");


        Livro livro4 = new Livro();

        livro4.setTitulo("O Conto da Aia");
        livro4.setAutor("Margaret Atwood");
        livro4.setEditora("Rocco");
        livro4.setEdicao("1ª");
        livro4.setAno("2017");
        livro4.setSinopse("O romance distópico O conto da aia, de Margaret Atwood, se passa num futuro muito próximo e tem como cenário uma república onde não existem mais jornais, revistas, livros nem filmes. As universidades foram extintas. Também já não há advogados, porque ninguém tem direito a defesa. Os cidadãos considerados criminosos são fuzilados e pendurados mortos no Muro, em praça pública, para servir de exemplo enquanto seus corpos apodrecem à vista de todos.");


        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);

        while (sair) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("MENU");
            System.out.println("1 - Solicitar Livro");
            System.out.println("2 - Listar meus livros");
            System.out.println("3 - Sair");

            Scanner scanner = new Scanner(System.in);
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Livros disponíveis: ");
                    for (Livro livro: livros) {
                        System.out.println(livros.indexOf(livro) + " - " + livro.getTitulo());
                    }

                    System.out.println("Digite o número do livro que deseja solicitar: ");
                    int index = scanner.nextInt();

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

                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("S")) {
                            System.out.println("Livro solicitado com sucesso!");
                            usuario.addLivro(livroSelecionado);
                            livros.remove(livroSelecionado);
                        } else {
                            System.out.println("Livro não solicitado!");
                        }
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 2:
                    List < Livro > livrosDoUsuario = usuario.getLivros();

                    if (livrosDoUsuario == null || livrosDoUsuario.isEmpty()) {
                        System.out.println("Você não possui livros!");
                        break;
                    } else {
                        System.out.println("Meus livros: ");
                        for (Livro livro: livrosDoUsuario) {
                            System.out.println(livrosDoUsuario.indexOf(livro) + " - " + livro.getTitulo());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
            scanner.close();       
        }
    }
    
}