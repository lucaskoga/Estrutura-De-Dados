public class FibonacciRecursibo {

    int fibonacci;

    public FibonacciRecursibo(){
        this.fibonacci = fibonacci;
    }

    public int fibonacciRecursivo(int fibonacci){
        int resultado = 0;
        if (fibonacci == 0 || fibonacci == 1){
            return 1;
        }
        else {
            resultado = fibonacciRecursivo(fibonacci - 1) + fibonacciRecursivo( fibonacci - 2);
            System.out.println(resultado);
        }

        return resultado;
    }

}
