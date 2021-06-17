import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        CarroF1 carroF1[] = new CarroF1[10];
            int cadastros =0;
            int opcao;

        do{
            System.out.print("\n\n\n=-=-Menu de Cadastro dos Carros de F1-=-=\n1 - Usuarios Cadastrados\n2 - Buscar Por Equipee\n0 - Sair\nSelecione opcao:");
            opcao = leitor.nextInt();

            if (opcao == 1){
                for (int i = 0; i < carroF1.length;i++){
                    carroF1[i] = new CarroF1();
                }if (cadastros < 10){
                    carroF1[cadastros].cadastra("Mercedes","Mercedes 1.6 V6","Pirelli","Prata","Hamilton","Bottas",650);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Aston Martin","Mercedes 1.6 v6","Pirelli","Verde","Vettel","Stroll",655);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("McLaren","Mercedes 1.6 v6","Pirelli","Amarelo","Ricciardo","Norris",650);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Alpine","Renault 1.6 v6","Pirelli","Preto","Alonso","Ocon",655);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Hass","Ferrari 1.6 v6","Pirelli","Branco","Schummacher","Mazepin",660);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Alpha Romeo","Ferrari 1.6 v6","Pirelli","Vermelho","Raikkonem","Giovinnazzi",640);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Alpha Tauri","Honda 1.6 v6","Pirelli","Preto Branco","Tsunoda","Gasly",640);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros <10){
                    carroF1[cadastros].cadastra("Williams","Honda 1.6 v6","Pirelli","Azul Vermelhor","Russel","Latifi",640);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros <10){
                    carroF1[cadastros].cadastra("Red Bull","Honda 1.6 v6","Pirelli","Preto Vermelho","Verstappen","Perez",630);
                    cadastros++;
                }else{
                    System.out.println("Cadastro Exedeu o Limite");
                }
                if (cadastros < 10){
                    carroF1[cadastros].cadastra("Ferrari","Ferrari 1.6 v6","Pirelli","Vermelho","Sainz","Leclerc",630);
                    cadastros++;
                }else {
                    System.out.println("Cadastro Exedeu o Limite");
                }
                
            }
            if (opcao == 1){
                System.out.println("Monstras todo os carro cadastrados");
                for (int i = 0; i < cadastros; i++){
                    carroF1[i].imprimir();
                }
            }

            if (opcao == 2){
                String buscaEquipe;
                leitor.nextLine();
                System.out.print("Nome da equipe para pesquisa:");
                buscaEquipe = leitor.nextLine();
                for (int i = 0; i < cadastros; i++){
                    if (buscaEquipe.equalsIgnoreCase(carroF1[i].equipe)){
                        System.out.println("=-=-Dados do Carro Pesquisado-=-=");
                        carroF1[i].imprimir();
                    }
                }
            }

        }while(opcao != 0);
        
    }
}
