public class Principal {

    public static void main(String[] args) {

        /* Foi Criado os vetores G, G1 e R de 13 possicoes;
        * G corresponde a coluna 1  e G1 corresponde a clouna 2 de vetores*/
        int intVetG[] = new int[13];
        int intVetG1[] = new int[13];
        int intVetR[] = new int[13];

        // E também um ponteiro para ajudar a fazer a contagem de quantos acerto o apostador teve;
        int pontNumeroAcerto = 0;

        //  Inserindo todos os valores no vetor Resultado G
        intVetG[0] = 1;
        intVetG[1] = 2;
        intVetG[2] = 3;
        intVetG[3] = 4;
        intVetG[4] = 5;
        intVetG[5] = 4;
        intVetG[6] = 7;
        intVetG[7] = 8;
        intVetG[8] = 2;
        intVetG[9] = 10;
        intVetG[10] = 1;
        intVetG[11] = 12;
        intVetG[12] = 13;

        //  Inserindo todos os valores no vetor Resultado G1
        intVetG1[0] = 1;
        intVetG1[1] = 2;
        intVetG1[2] = 3;
        intVetG1[3] = 4;
        intVetG1[4] = 5;
        intVetG1[5] = 6;
        intVetG1[6] = 7;
        intVetG1[7] = 8;
        intVetG1[8] = 9;
        intVetG1[9] = 10;
        intVetG1[10] = 11;
        intVetG1[11] = 1;
        intVetG1[12] = 13;

        System.out.println("*====*====*");

        // Inserindo todos os valores no vetor R
        intVetR[0] = 1;
        intVetR[1] = 4;
        intVetR[2] = 3;
        intVetR[3] = 7;
        intVetR[4] = 5;
        intVetR[5] = 2;
        intVetR[6] = 9;
        intVetR[7] = 8;
        intVetR[8] = 9;
        intVetR[9] = 10;
        intVetR[10] = 1;
        intVetR[11] = 12;
        intVetR[12] = 13;

        // Um for para fazer a imprecão do vetor Resultado R
        for (int i = 0; i < intVetR.length; i++){
            System.out.println(intVetR[i]);
        }

        /* Esse for vai ser responsavel por fazer a verificacão se o vetor G possui resultados igual ao vetor de R*/

        for (int i = 0; i < 13; i++){
            if (intVetG[i] == intVetR[i]){
                pontNumeroAcerto++;
            }
        }


        /* Esse for vai ser responsavel por fazer a verificacão se o vetor G1 possui resultados igual ao vetor de R*/
        for (int i = 0; i < 13; i++){
            if (intVetG1[i] == intVetR[i]){
                pontNumeroAcerto++;
            }
        }
            System.out.println("O numero de acerto do Apostador é de: "+pontNumeroAcerto +" pontos");

        if (pontNumeroAcerto  >= 13){
            System.out.println("O apostadou GANHOU!!! Parabens ");
        }
        else
            System.out.println("Infelizmente o apostador não ganhou, Quem sabe na proxima");
    }
}
