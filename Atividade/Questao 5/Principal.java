public class Principal {


    public static void main(String[] args) {
        // Foi Criado os vetores G e R de 13 possicoes;
        int intVetG[] = new int[13];
        int intVetR[] = new int[13];
        // E também um ponteiro para ajudar a fazer a contagem de quantos acerto o apostador teve;
        int pontNumeroAcerto = -1;

        //  Inserindo todos os valores no vetor G
        intVetG[0] = 1;
        intVetG[1] = 2;
        intVetG[2] = 3;
        intVetG[3] = 4;
        intVetG[4] = 5;
        intVetG[5] = 6;
        intVetG[6] = 7;
        intVetG[7] = 8;
        intVetG[8] = 9;
        intVetG[9] = 10;
        intVetG[10] = 11;
        intVetG[11] = 12;
        intVetG[12] = 13;

        // Inserindo todos os valores no vetor R
        intVetR[0] = 1;
        intVetR[1] = 2;
        intVetR[2] = 3;
        intVetR[3] = 4;
        intVetR[4] = 5;
        intVetR[5] = 6;
        intVetR[6] = 7;
        intVetR[7] = 8;
        intVetR[8] = 9;
        intVetR[9] = 10;
        intVetR[10] = 11;
        intVetR[11] = 12;
        intVetR[12] = 13;

        // Um for para fazer a imprecão do vetor R
        for (int i = 0; i < intVetR.length; i++){
            System.out.println(intVetR[i]);
        }
        /* Aqui e o responsavel por percorre todo o vetor e ver se um vetor e igual ao outro, e também e responsavel
        por ver o total de numero igual ao vetor ganhador. */
        if (pontNumeroAcerto == -1){
            pontNumeroAcerto = 0;
            for (int i = 0; i < 13; i++){
                intVetG.equals(intVetR[i]);
                pontNumeroAcerto++;
            }
            System.out.println("O numero de acerto do Apostador é de: "+pontNumeroAcerto+" pontos");
        }
        if (pontNumeroAcerto >= 13){
            System.out.println("O apostadou GANHOU!!! Parabens ");
        }
        else
            System.out.println("Infelizmente o apostador não ganhou, Quem sabe na proxima");

    }
}
