public class Fatorial_recur {

    int fatorial;

    public Fatorial_recur(){
        this.fatorial = fatorial;
    }
    public int fatorial(int fatorial){
        int fat = 0;
        if (fatorial == 0){
            return 1;
        }else {
            fat = fatorial * fatorial(fatorial - 1);
            System.out.println(fat);
        }
        return fat;
    }
}
