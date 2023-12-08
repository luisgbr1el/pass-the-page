package projetojava.src.Entities;
import java.util.ArrayList;
import java.util.List;

public class Usuario{


    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private List<Livro> livros;

    public Usuario(String nome, String email, String senha, String dataNascimento, String telefone, List<Livro> livros) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        if (livros != null) {
            this.livros = new ArrayList<>(livros);
        } else {
            this.livros = new ArrayList<>();
        }
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Livro> getLivros() {

        return livros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEmail(String email) {
        this.email = email;

    }

    public void setSenha(String senha) {
        this.senha = senha;

    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;

    }

    public void addLivro(Livro livro) {
    if (this.livros == null) {
        this.livros = new ArrayList<>();
    }
    this.livros.add(livro);
}

    public void removeLivro(Livro livro){
        this.livros.remove(livro);
    }

    public void removeLivro(int index){
        this.livros.remove(index);
    }




    @Override
    public String toString() {
        return "Usuario [dataNascimento=" + dataNascimento + ", email=" + email + ", livros=" + livros + ", nome="
                + nome + ", senha=" + senha + ", telefone=" + telefone + "]";
    }
}