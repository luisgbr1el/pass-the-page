package projetojava.src.Entities;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String ano;
    private String sinopse;

    public Livro(String titulo, String autor, String editora, String edicao, String ano, String sinopse) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.sinopse = sinopse;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getAno() {
        return ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;

    }

    public void setEditora(String editora) {
        this.editora = editora;

    }   

    public void setEdicao(String edicao) {
        this.edicao = edicao;

    }

    public void setAno(String ano) {
        this.ano = ano;

    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;

    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", edicao=" + edicao + ", ano=" + ano + ", sinopse=" + sinopse + '}';
    }

}
