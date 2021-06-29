import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < mat.length; i++){
            for (int y = 0; y < mat.length; y++){
                mat[i][y] = leitor.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++){
            for (int y = 0; y < mat.length; y++){
                System.out.print(mat[i][y] +"|");
            }
            System.out.println();
        }

    }
}
