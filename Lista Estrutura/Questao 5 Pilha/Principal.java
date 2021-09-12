public class Principal {

    public static void main(String[] args) {

        PilhaEncadeadaDinamicaDupla pilha = new PilhaEncadeadaDinamicaDupla();
        Livro l1 = new Livro("Estrutura", "LAFORE");
        Livro l2 = new Livro("Algoritmos", "CORMEN");
        Livro l3 = new Livro("Arquitetura", "Tenembau");
        Livro l4 = new Livro("Computacao Algebrica","Computacao de Velaz");

        pilha.inserir(new No(l1));
        pilha.inserir(new No(l2));
        pilha.inserir(new No(l3));
        pilha.inserir(new No(l4));

        pilha.imprimeLista();

        pilha.remove();

        pilha.imprimeLista();
        pilha.remove();

        pilha.imprimeLista();

    }

}
