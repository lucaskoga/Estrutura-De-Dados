public abstract class Livro {

    long isbnDoLivro;
    String autor;
    String nomeDoLivro;
    int numeroDePaginas;
    String categoria;
    String emprestado;

    public Livro(long isbnDoLivro, String autor, String nomeDoLivro, int numeroDePaginas, String categoria, String emprestado) {
        this.isbnDoLivro = isbnDoLivro;
        this.autor = autor;
        this.nomeDoLivro = nomeDoLivro;
        this.numeroDePaginas = numeroDePaginas;
        this.categoria = categoria;
        this.emprestado = emprestado;
    }
    public String toString(){
        return "Nome do Autor: "+ autor+ "Nome do livro: "+nomeDoLivro+  "Qual o tipo de livro: "+categoria+ "Quantidade de Paginas: "+numeroDePaginas+ "Numero do ISBN: "+isbnDoLivro;
    }
}
