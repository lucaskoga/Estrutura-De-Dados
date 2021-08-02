public class Principal {

    public static void main(String[] args) {

        int []  a = new int[5];
        
         a[0] = 0;
         a[1] = 1;
         a[2] = 9;
         a[3] = 24;
         a[4] = 33;

         for (int i = 0; i < a.length; i++){
             System.out.println(a[i]);
         }
        System.out.println("------*------");

        int []  b = new int[5];

        for (int i = 0 ; i < b.length; i++){
            b[i] = a[i];
        }

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
