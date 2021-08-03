public class ListaConta {

    static ContaBancaria lista[] = new ContaBancaria[5];
    static int fim = -1;

    //insercao no final da lista
    public void cadastra(ContaBancaria p){
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
            System.out.println(" Possicão: " +i+ ""+lista[i].toString());
        }
    }

    //busca na lista
    public int busca(String nomeTitular){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].getNomeTitular().contains(nomeTitular)){
                System.out.println("----*----");
                System.out.println("Busca completa atraves do "+lista[i].toString());
                return i;
            }
        }
        return -1;
    }
}
