public class Principal {
    public static void main(String[] args) {
        int intVet[] = new int[15];
        int resultado;
        int multiVetor;

        intVet[0] = 12;
        intVet[1] = 10;
        intVet[2] = 15;
        intVet[3] = 7;
        /*Percorre o vetor e achar os numero Par e armazena no resultado */
        for (int i = 0; i < 15; i++){
            if (intVet[i] %2 == 0){
                resultado = intVet[i];
                //Responsavel por percorrer denovo o vetor e fazer  multificacão
                for (int o = i+1; o < 15; o++){
                    if (intVet[o] %2 ==0){
                        multiVetor = resultado * intVet[o];
                        System.out.println(multiVetor);
                    }
                }
                break;
            }
        }
    }
}
