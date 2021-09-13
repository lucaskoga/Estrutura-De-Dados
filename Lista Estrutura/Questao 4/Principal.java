public class Principal {

    public static void main(String[] args) {

        ListaEncadeadaDinamica lista = new ListaEncadeadaDinamica();

        Atleta l1 = new Atleta("Kaio",1.8f,96,"Basquete","Coca-Cola");
        Atleta l2 = new Atleta("Diogo",1.7f,87.5f,"Tiro","Winchester");

        lista.insereFim(new No(l1));
        lista.insereFim(new No(l2));

        lista.imprimeLista();
        lista.busca("Kaio");

        No atleta = lista.buscar("Kaio");

        Atleta a = (Atleta) atleta.getObj();
        System.out.println("");
        System.out.println("Busca Efetuada com Sucesso:"+a.toString());
    }

}
