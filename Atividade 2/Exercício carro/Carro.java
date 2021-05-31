public class Carro {
    String marca;
    String modelo;
    int ano;
    int porta;

    public void atribuirMarca(String marca){
        this.marca = marca;
    }
    public String verMarca(){
        return this.marca;
    }
    public void atribuirModelo(String modelo){
        this.modelo = modelo;
    }
    public String verModelo(){
        return this.modelo;
    }
    public  void atribuirAno(int ano){
        this.ano = ano;
    }
    public int verAno(){
        return this.ano;
    }
    public void atribuirPorta(int porta){
        this.porta = porta;
    }
    public int verPorta(){
        return this.porta;
    }
}
