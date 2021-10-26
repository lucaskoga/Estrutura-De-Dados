public class Fatorial_Laco {

    int fatorial;

    public Fatorial_Laco(){
        this.fatorial = fatorial;
    }
    public int fatorial(int fatorial){
        int fat = 1;
        if (fatorial >= 0){
            for (int i = 1; i <= fatorial; i++){
                fat = fat * i;
                System.out.println(fat);
            }
        }
        return fat;
    }
}
