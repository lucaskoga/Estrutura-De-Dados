public class Principal {

    static Carro carrosVet[] = new Carro[10];
    static int pont_ultimo = -1;

    public static void insere_final(Carro c){
        // inserir no final:
        //verifica se tem posicoes vazias no vetor
        if (pont_ultimo+1 < carrosVet.length) {
            pont_ultimo++;
            carrosVet[pont_ultimo] = c;
        }
    }

    public static void insere_inicio(Carro c){
        if (pont_ultimo+1 < carrosVet.length) {
            //deslocamento dos elementos
            for (int i = pont_ultimo; i >= 0 ; i--) {
                carrosVet[i+1] = carrosVet[i];
            }
            //atualizo o ponteiro
            pont_ultimo++;
            //inserindo no inicio do vetor
            carrosVet[0] = c;
        }
    }

    public static int busca(String model){
        for (int i = 0; i <= pont_ultimo; i++) {
            if (carrosVet[i].modelo.equals(model)){
                System.out.println("Elemento localizado na posicao "+i);
                return i;
            }
        }
        //nao encontrou o elemento no vetor
        System.out.println("Elemento "+model+" nao localizado ");
        return -1;
    }

    public static Carro remove(String model){
        int pos_remover = busca(model);
        if (pos_remover != -1){
            Carro removido = carrosVet[pos_remover];
            System.out.println("Removendo:"  +removido.modelo);
            for (int i = pos_remover; i <= pont_ultimo; i++){
                carrosVet[i] = carrosVet[i+1];
            }
            carrosVet[pont_ultimo] = null;
            pont_ultimo--;
            System.out.println("Carro Removido!");
            return removido;
        }
        else
            return null;
    }

    public static void mostraCarros(){
        for (int i = 0; i <=pont_ultimo ; i++) {
            System.out.println("Carro "+i+" ->  "+carrosVet[i].toString());
        }
    }

    public static void main(String[] args) {

        Carro c1 = new Carro("Wolks", "fusca");
        insere_final(c1);

        Carro c2 = new Carro("Wolks", "kombi");
        insere_final(c2);

        Carro c3 = new Carro("Chevrolet", "onix");
        insere_final(c3);

        mostraCarros();

        Carro c4 = new Carro("Toyota", "corolla");
        insere_inicio(c4);

        Carro c5 = new Carro("Chevrolet", "corsa");
        insere_inicio(c5);

        Carro c6 = new Carro("Fiat", "uno");
        insere_inicio(c6);

        Carro c7 = new Carro("Audi", "A1");
        insere_inicio(c7);

        int pos_busca = busca("onix");
        if (pos_busca != -1)
        System.out.println("Busca, modelo "+carrosVet[pos_busca].modelo);

        mostraCarros();

        Carro rem = remove("uno");
        if (rem != null)
            System.out.println("Carro Removido: "+rem.toString());
        mostraCarros();

    }
}
