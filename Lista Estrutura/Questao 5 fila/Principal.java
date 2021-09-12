public class Principal {
    public static void main(String[] args) {
        ListaEncadeadaDupla listaLivros = new ListaEncadeadaDupla();

        Livro l1 = new Livro("Estrutura", "LAFORE");
        Livro l2 = new Livro("Algoritmos", "CORMEN");
        Livro l3 = new Livro("Arquitetura", "Tenembau");
        Livro l4 = new Livro("Luka e Tuka","Fagorte");

        listaLivros.insereFim(new No(l1));
        listaLivros.insereFim(new No(l2));
        listaLivros.insereFim(new No(l3));
        listaLivros.insereFim(new No(l4));

        listaLivros.imprimeLista();

        listaLivros.remove();

        listaLivros.imprimeLista();

        listaLivros.remove();

        listaLivros.imprimeLista();

        listaLivros.remove();

        listaLivros.imprimeLista();
    }
}
