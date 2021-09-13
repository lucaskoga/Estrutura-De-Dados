import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ListaEncadeadaDinamica lista = new ListaEncadeadaDinamica();
        Atleta atleta;
        Scanner leitor = new Scanner(System.in);

        String nome;
        float altura;
        float peso;
        String esporte;
        String patrocineo;
        int opicao;

        //Menu
        do{
            System.out.println("Opcão dos Menu");
            System.out.println("0 - Para sair do programa");
            System.out.println("1 - Registrar Atleta");
            System.out.println("2 - Imprimir Lista de Atleta");
            System.out.println("3 - Remover Atleta da Lista");
            System.out.println("4 - Buscar Por Atleta na Lista");
            System.out.println("Qual opicao Voce Escolhe: ");
            
            //Entrada para selecionar o menu
            opicao = leitor.nextInt();
            leitor.nextLine();

            switch (opicao) {
                case 1:{
                    System.out.print("===Informe os Dados Para Registrar===\n");
                    System.out.println("Nome: ");
                    nome = leitor.nextLine();
                    System.out.print("Altura: ");
                    altura = leitor.nextFloat();
                    leitor.nextLine();
                    System.out.print("Peso: ");
                    peso = leitor.nextFloat();
                    leitor.nextLine();
                    System.out.print("Modalidade do Esporte: ");
                    esporte = leitor.nextLine();
                    System.out.print("Patrocinadores: ");
                    patrocineo = leitor.nextLine();
                    atleta = new Atleta(nome, altura, peso, esporte, patrocineo);
                    lista.inserirAtleta(new No(atleta));
                    break;
                }
                case 2: {
                    lista.imprimeListaDeAtleta();
                    break;
                }
                case 3:{
                    String remover;
                    System.out.println("Qual o Atleta que deseja Remover: ");
                    remover = leitor.nextLine();
                    lista.removeAtleta(remover);
                    break;
                }
                case 4: {
                    String buscar;
                    System.out.println("Qual o nome do Atleta que deseja Buscar: ");
                    buscar = leitor.nextLine();
                    lista.buscaAtleta(buscar);
                    break;
                }

            }
        }while (opicao != 0);

    }

}
