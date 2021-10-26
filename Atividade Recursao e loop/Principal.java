import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        //Chamo a classe de Fatorial com laco de repeticao
        Fatorial_Laco fat = new Fatorial_Laco();
        //Chamo a classe de Fatorial com recursao
        Fatorial_recur fat1 = new Fatorial_recur();
        //Chamo a classe da Fibonacci com Laco de repeticao
        FibonacciLaco fibo = new FibonacciLaco();
        //Chamo a classe da Fibonacci recursao
        FibonacciRecursibo fibonacciRecursibo = new FibonacciRecursibo();

        //leitor para a Fatorial
        Scanner leitor = new Scanner(System.in);
        //leitor para a fibonacci
        Scanner leitorFibo = new Scanner(System.in);

        //chama o classe e a funcao Fatorial com laco de repeticao
        System.out.println("Informe a fatorial do Laco de repeticao");
        int fatorial = leitor.nextInt();
        fat.fatorial(fatorial);

        //chama o classe e a funcao Fatorial recursao
        System.out.printf("informe a fatorial recursivo ");
        fat1.fatorial(fatorial);

        //chama o classe e a funcao da Fibonacci com laco de repeticao
        System.out.println("informe o valor da fibonacci com laco");
        int fibonacci = leitorFibo.nextInt();
        fibo.fibonacci(fibonacci);

        //chama o classe e a funcao da Fibonacci com recursao
        System.out.println("informe o valor da fibonacci recursivo");
        fibonacciRecursibo.fibonacciRecursivo(fibonacci);

    }
}
