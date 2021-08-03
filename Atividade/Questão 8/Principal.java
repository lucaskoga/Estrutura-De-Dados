public class Principal {

    public static void main(String[] args) {

        ListaConta listaConta = new ListaConta();

        ContaBancaria conta0 = new ContaBancaria();
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();
        ContaBancaria conta4 = new ContaBancaria();

        conta0.cadastrastrarConta("Alex",584, 593,100);
        conta1.cadastrastrarConta("Lucas",1234,565,9_988);
        conta2.cadastrastrarConta("Pati",234,323,1200_000);
        conta3.cadastrastrarConta("Paula",353,442,2_000);
        conta4.cadastrastrarConta("Diogo",754,653,4_000);

        listaConta.cadastra(conta0);
        listaConta.cadastra(conta1);
        listaConta.cadastra(conta2);
        listaConta.cadastra(conta3);
        listaConta.cadastra(conta4);
        listaConta.imprimeVet();

        listaConta.busca("Alex");
        listaConta.busca("Diogo");

        conta1.deposistarValores(10_000);
        conta4.retirarValores(2_000);

    }
}
