import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int intval[] = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Insira os Numeros");
            intval[i] = teclado.nextInt();
        }

        for (int i = 0; i < intval.length; i++){
            System.out.println(intval[i]);
        }

        System.out.println("\nSegundo Vetor \n");

        int intval2[] = intval;
        for (int o = 0; o < intval.length; o++){
            System.out.println(intval2[o]);
        }
    }
}
