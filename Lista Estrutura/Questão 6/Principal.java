public class Principal {

    public static void main(String[] args) {

        ListaEncadeadaDinamicaDupla lista = new ListaEncadeadaDinamicaDupla();

        Aluno l1 = new Aluno("Carlos",866566,80.8,"Computacao");
        Aluno l2 = new Aluno("Eduarda",866586,98.8,"Computacao");
        Aluno l3 = new Aluno("Yui",85423,100.0,"Veterinaria");
        Aluno l4 = new Aluno("Diogo",895736,94.8,"Agronomia");

        lista.insereFim(new No(l1));
        lista.insereFim(new No(l2));
        lista.insereFim(new No(l3));
        lista.insereFim(new No(l4));

        lista.imprimeLista();

    }
}
