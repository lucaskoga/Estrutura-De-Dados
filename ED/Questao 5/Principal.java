public class Principal {

    public static void main(String[] args) {
        Lista lista1 = new Lista(421412421,"Carlos","O Grande",87,"Terror","luiz");

        lista1.cadastra(lista1);

        lista1.imprimeVet();
        lista1.busca("O Grande");
    }
}
