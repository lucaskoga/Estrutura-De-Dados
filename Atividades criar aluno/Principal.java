import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.atribuirNome("Gustavo");
        a1.atribuirNota(9.0f);

        Aluno a2 = new Aluno();
        a2.atribuirNome("Carlos");
        a2.atribuirNota(6.0f);

        Aluno a3 = new Aluno();
        a3.atribuirNome("Vitor");
        a3.atribuirNota(7.0f);

        Aluno a4 = new Aluno();
        a4.atribuirNome("Richard");
        a4.atribuirNota(9.5f);

        Aluno a5 = new Aluno();
        a5.atribuirNome("Vitão");
        a5.atribuirNota(7.8f);

        System.out.println("");
        System.out.println(a1.verNome()+" Nota: "+a1.verNota());
        System.out.println(a2.verNome()+" Nota: "+a2.verNota());
        System.out.println(a3.verNome()+" Nota: "+a3.verNota());
        System.out.println(a4.verNome()+" Nota: "+a4.verNota());
        System.out.println(a5.verNome()+" Nota: "+a5.verNota());
        System.out.println("");

        System.out.println("Abaixo contem formatos cria com a entrada do teclado ");

        Scanner telaco1 = new Scanner(System.in);
        Scanner telaco2 = new Scanner(System.in);
        Scanner telaco3 = new Scanner(System.in);
        Scanner telaco4 = new Scanner(System.in);

        Aluno a6 = new Aluno();

        System.out.println("Digite a nome:");
        String nome = telaco1.nextLine();
        System.out.println("digite a nota:");
        float nota = telaco1.nextFloat();

        a6.atribuirNome(nome);
        a6.atribuirNota(nota);


        Aluno a7 = new Aluno();

        System.out.println("Digite a nome:");
        String nome2 = telaco2.nextLine();
        System.out.println("digite a nota:");
        float nota2 = telaco2.nextFloat();

        a7.atribuirNome(nome2);
        a7.atribuirNota(nota2);

        Aluno a8 = new Aluno();

        System.out.println("Digite a nome:");
        String nome3 = telaco3.nextLine();
        System.out.println("digite a nota:");
        float nota3 = telaco3.nextFloat();

        a8.atribuirNome(nome3);
        a8.atribuirNota(nota3);

        Aluno a9 = new Aluno();

        System.out.println("Digite a nome:");
        String nome4 = telaco4.nextLine();
        System.out.println("digite a nota:");
        float nota4 = telaco4.nextFloat();

        a9.atribuirNome(nome4);
        a9.atribuirNota(nota4);

        System.out.println(a6.verNome()+" Nota: "+a6.verNota());
        System.out.println(a7.verNome()+" Nota: "+a7.verNota());
        System.out.println(a8.verNome()+" Nota: "+a8.verNota());
        System.out.println(a9.verNome()+" Nota: "+a9.verNota());
    }
}
