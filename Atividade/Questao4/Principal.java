public class Principal {
    public static void main(String[] args) {
        int intvet[] = new int[20];

        intvet[0] = 22;
        intvet[1] = 11;
        intvet[2] = 55;
        intvet[3] = 56;
        intvet[4] = 555;
        intvet[5] = 44;
        intvet[6] = 20;
        intvet[7] = 70;
        intvet[8] = 90;
        intvet[9] = 9;
        intvet[10] = 5;
        intvet[11] = 46;
        intvet[12] = 99;
        intvet[13] = 00;
        intvet[14] = 87;
        intvet[15] = 88;
        intvet[16] = 421;
        intvet[17] = 72;
        intvet[18] = 789;
        intvet[19] = 904;

        for (int i = 0; i < intvet.length; i++){
            System.out.println(intvet[i]);
        }

        System.out.println("\nVetor do 1 ao 20 Trocados\n");

        intvet[0] = 904;
        intvet[1] = 789;
        intvet[2] = 72;
        intvet[3] = 421;
        intvet[4] = 88;
        intvet[5] = 87;
        intvet[6] = 00;
        intvet[7] = 99;
        intvet[8] = 46;
        intvet[9] = 5;
        intvet[10] = 9;
        intvet[11] = 90;
        intvet[12] = 70;
        intvet[13] = 20;
        intvet[14] = 44;
        intvet[15] = 555;
        intvet[16] = 56;
        intvet[17] = 55;
        intvet[18] = 11;
        intvet[19] = 22;

        for (int i = 0; i < intvet.length; i++){
            System.out.println(intvet[i]);
        }
    }
}
