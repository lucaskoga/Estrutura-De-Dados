public class PilhaEncadeadaDinamicaDupla {

    No topo;

    public void inserir(No n){

        if (topo == null){
            topo = n;
        }
        else{
            topo.setProximo(n);
            n.setAnterior(topo);
            topo= n;
        }
        System.out.println("Elemento inserido com sucesso: "+n.toString());
    }
    public void imprimeLista(){
        No aux = topo;
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
            aux = aux.getAnterior();
        }
    }

    public No remove(){
        No rem = topo;
        System.out.println("");
        while (rem!=null){
            if (rem.getAnterior()!=null){

                No anterior = rem.getAnterior();

                anterior.setProximo(rem.getProximo());

                if (rem.getProximo()!=null) {
                    No proximo = rem.getProximo();
                    proximo.setAnterior(rem.getAnterior());
                }
                if (rem == topo){
                    topo = anterior;
                }
                rem.setProximo(null);
                System.out.println("Elemento removido. "+rem.toString());
                return rem;
            }
            else{

                topo = rem.getProximo();
                topo.setAnterior(null);
                if (topo == rem){
                    topo= rem.getProximo();
                }
                rem.setProximo(null);
                System.out.println("Elemento removido. "+rem.toString());
                return rem;
            }

        }
        return null;
    }

}
