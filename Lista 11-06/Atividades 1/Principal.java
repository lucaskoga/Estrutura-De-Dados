import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int intval[] = new int[10];

        Scanner teclado = new Scanner(System.in);
        //Ler a entrada
        for (int i = 0; i < 10; i++){
            System.out.println("Insira os Numeros");
            intval[i] = teclado.nextInt();
        }
        //Percorre o vetor e coloca as entrada nos seu vetores e imprime
        for (int i = 0; i < intval.length; i++){
            System.out.println(intval[i]);
        }

        System.out.println("\nSegundo Vetor \n");
        //Pega os valores do primeiro vetor e adiciona no segundo vetor e imprime
        int intval2[] = intval;
        for (int o = 0; o < intval.length; o++){
            System.out.println(intval2[o]);
        }
    }
}
