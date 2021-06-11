public class Principal {
    public static void main(String[] args) {
        int intval[] = new int[10];
        intval[0] = 22;
        intval[1] = 66;
        intval[2] = 34;
        intval[3] = 67;
        intval[4] = 45;
        intval[5] = 56;
        intval[6] = 788;
        intval[7] = 890;
        intval[8] = 90;
        intval[9] = 43;

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
