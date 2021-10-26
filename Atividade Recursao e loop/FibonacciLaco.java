public class FibonacciLaco {

    int fibonacci;

    public FibonacciLaco(){
        this.fibonacci = fibonacci;
    }

    public int fibonacci(int fibonacci){
        int num1, num2, resuldo;
        num1 = 1;
        num2 = 0;
        resuldo = 0;
        for (int i = 0; i <= fibonacci; i++){
            resuldo = num1 + num2;
            num1 = num2;
            num2 = resuldo;
            System.out.println(resuldo);
        }
        return resuldo;
    }

}
