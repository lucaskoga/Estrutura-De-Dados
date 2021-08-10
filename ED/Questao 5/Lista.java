public class Lista extends Livro{

    public Lista(long isbnDoLivro, String autor, String nomeDoLivro, int numeroDePaginas, String categoria, String emprestado) {
        super(isbnDoLivro, autor, nomeDoLivro, numeroDePaginas, categoria, emprestado);
    }
    static Livro lista[] = new Livro[5];
    static int fim = -1;

    //insercao no final da lista
    public void cadastra(Livro p){
        //insere no vetor
        if (fim == -1 || fim < (lista.length-1)){
            //vetor vazio
            fim++;
            lista[fim] = p;
        }
    }

    //imprime lista
    public void imprimeVet(){
        System.out.println("-----IMPRIME LISTA-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ lista[i].toString());
        }
    }

    //busca na lista
    public int busca(String nomeDolivro){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].nomeDoLivro.contains(nomeDolivro)){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    //remove
    public Livro remove(String n){
        int r = busca(n);
        Livro aux = lista[r];
        for (int i = r; i < fim ; i++) {
            lista[i] = lista[i+1];
        }
        lista[fim] = null;
        fim--;
        return aux;
    }


}
