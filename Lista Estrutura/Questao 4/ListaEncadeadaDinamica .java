public class ListaEncadeadaDinamica {

    No inicio;
    No fim;

    //Inseri os atleta
    public void inserirAtleta(No n){
        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            fim = n;
        }
        System.out.println("Atleta Foi Registrado: "+n.toString());
    }

    //imprime a lista
    public void imprimeListaDeAtleta(){
        No aux = inicio;
        System.out.println(" === Lista de Atletas ===");
        while (aux!=null){
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }
    }

    //Remover Atleta
    public No removeAtleta(String texto){
        No ant = null;
        No rem = inicio;

        while (rem!=null){
            if (rem.toString().contains(texto)){
                if (ant!=null){
                    ant.setProximo(rem.getProximo());
                    if (rem == fim){
                        fim = ant;
                    }
                    rem.setProximo(null);
                    System.out.println("Atleta Removido: "+rem.toString());
                    return rem;
                }
                else{
                    //inicio da lista
                    inicio = rem.getProximo();
                    rem.setProximo(null);
                    if (fim == rem){
                        fim = rem.getProximo();
                    }
                    System.out.println("Atleta Removido: "+rem.toString());
                    return rem;
                }
            }
            ant = rem;
            rem = rem.getProximo();
        }
        System.out.println("Atleta nao encontrado para remocao ");
        return null;
    }

    //Busca pelo Atleta na lista
    public No buscaAtleta(String busca){
        No aux = inicio;
        while(aux != null){
            System.out.println("Resultado da Busca");
            if (aux.toString().contains(busca)){
                System.out.println(aux.toString());
                return aux;
            }
            aux = aux.getProximo();
        }
        System.out.println("Atleta nao Registrado");
        return null;
    }

}
