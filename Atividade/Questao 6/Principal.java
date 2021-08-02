import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int mat[][] = new int[5][5];
        Scanner leitor = new Scanner(System.in);

        mat[0][0] = 43;
        mat[0][1] = 67;
        mat[0][2] = 5;
        mat[0][3] = 43;
        mat[0][4] = 89;
        mat[1][0] = 43;
        mat[1][1] = 54;
        mat[1][2] = 63;
        mat[1][3] = 43;
        mat[1][4] = 23;
        mat[2][0] = 32;
        mat[2][1] = 26;
        mat[2][2] = 89;
        mat[2][3] = 45;
        mat[2][4] = 34;
        mat[3][0] = 56;
        mat[3][1] = 34;
        mat[3][2] = 55;
        mat[3][3] = 78;
        mat[3][4] = 12;
        mat[4][0] = 32;
        mat[4][1] = 34;
        mat[4][2] = 56;
        mat[4][3] = 43;
        mat[4][4] = 21;

        //Soma da linha
        int somaLinha = 0;
        System.out.println("Digite qual linha quer calcular:");
        int linha = leitor.nextInt();
        for (int i = 0; i < mat.length; i++){
            somaLinha =  somaLinha + mat[linha][i];
        }
        System.out.println("Soma Das Linha:"+ somaLinha+"\n");

        //Soma Coluna

        System.out.println("Digite qual coluna quer calcular:");
        int coluna = leitor.nextInt();
        int somaColuna = 0;
        for (int i = 0; i < mat.length;i++){
            somaColuna = somaColuna + mat[i][coluna];
        }
        System.out.println("Soma Das Coluna:" +somaColuna+"\n");

        //Soma Diagonal Primaria
        int somaDiaPrimaria = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (i == j){
                    somaDiaPrimaria = somaDiaPrimaria + mat[i][j];
                }
            }
        }
        System.out.println("Soma Da Diagonal Principal:" +somaDiaPrimaria+"\n");

        //Soma Diagonal Segundaria
        int somaDiaSegundaria = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (j ==( mat.length - 1 - i)){
                    somaDiaSegundaria = somaDiaSegundaria + mat[i][j];
                }
            }
        }
        System.out.println("Soma Da Diagonal Segundario: "+somaDiaSegundaria+"\n");


        // Matriz
        for (int i = 0; i < mat.length; i++){
            for (int y = 0; y < mat.length; y++){
                System.out.print(mat[i][y] +"|");
            }
            System.out.println();
        }
        System.out.println(""+"\n");
        //Soma total da matriz
        int somaTotal = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                somaTotal = somaTotal + mat[i][j];
            }
        }
        System.out.println("Soma Total Da Matriz:"+somaTotal);
        System.out.println(""+"\n");
    }
}
