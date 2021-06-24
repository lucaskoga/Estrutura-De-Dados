public class Carro {


    String marca;
    String modelo;

    public Carro(){

    }
    public Carro(String marc, String model){
        this.marca = marc;
        this.modelo = model;
    }

    public  String toString(){
        return "Marca:"+this.marca+" Modelo:"+this.modelo;
    }
}
