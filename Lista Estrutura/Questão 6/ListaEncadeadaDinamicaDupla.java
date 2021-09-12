public class ListaEncadeadaDinamicaDupla {

    No inicio;
    No fim;

    public void insereFim(No n){

        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            n.setAnterior(fim);
            fim = n;
        }
        System.out.println("Aluno Colocado Na Lista: "+n.toString());
    }


    public void imprimeLista(){
        No aux = inicio;
        System.out.println(" === IMPRIMINDO LISTA ===");

        while (aux!=null){
            System.out.print(aux.hashCode()+ " - ");
            System.out.print(aux.toString());
            if (aux.getAnterior()!=null)
                System.out.print("| ponteiro anterior -> "+aux.getAnterior().hashCode());
            if (aux.getProximo()!=null)
                System.out.print("| ponteiro proximo -> "+ aux.getProximo().hashCode());
            System.out.println();
            System.out.println("----------------------");
            aux = aux.getProximo();
        }
    }

    public No remove(String texto){
        No rem = inicio;

        while (rem!=null){
            if (rem.toString().contains(texto)){
                if (rem.getAnterior()!=null){

                    No anterior = rem.getAnterior();

                    anterior.setProximo(rem.getProximo());

                    if (rem.getProximo()!=null) {
                        No proximo = rem.getProximo();
                        proximo.setAnterior(rem.getAnterior());
                    }
                    if (rem == fim){
                        fim = anterior;
                    }
                    rem.setProximo(null);
                    System.out.println("Aluno Removida: "+rem.toString());
                    return rem;
                }
                else{
                    inicio.setAnterior(null);
                    if (fim == rem){
                        fim = rem.getProximo();
                    }
                    rem.setProximo(null);
                    System.out.println("Aluno Removida: "+rem.toString());
                    return rem;
                }
            }
            rem = rem.getProximo();
        }
        System.out.println("Aluno não encontradana lista !!!! ");
        return null;
    }


}
