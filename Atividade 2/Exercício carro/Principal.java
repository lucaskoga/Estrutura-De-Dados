public class Principal {

    public static void main(String[] args) {
        Carro car = new Carro();
        car.atribuirMarca("Ford");
        car.atribuirModelo("Fiesta");
        car.atribuirAno(2019);
        car.atribuirPorta(4);


        System.out.println("");
        System.out.println("Marca:"+car.verMarca());
        System.out.println("Modelo:"+car.verModelo());
        System.out.println("Ano de Fabricacão:"+car.verAno());
        System.out.println("Portas:"+car.verPorta());

        Carro car1 = new Carro();

        car1.atribuirMarca("Ford");
        car1.atribuirModelo("Camaro");
        car1.atribuirAno(2021);
        car1.atribuirPorta(2);

        System.out.println("");
        System.out.println("Marca:"+car1.verMarca());
        System.out.println("Modelo:"+car1.verModelo());
        System.out.println("Ano de Fabricacão:"+car1.verAno());
        System.out.println("Portas:"+car1.verPorta());

        Carro car2 = new Carro();

        car2.atribuirMarca("Audi");
        car2.atribuirModelo("R8");
        car2.atribuirAno(2021);
        car2.atribuirPorta(2);

        System.out.println("");
        System.out.println("Marca:"+car2.verMarca());
        System.out.println("Modelo:"+car2.verModelo());
        System.out.println("Ano de Fabricacão:"+car2.verAno());
        System.out.println("Portas:"+car2.verPorta());
        System.out.println("");


    }

}
