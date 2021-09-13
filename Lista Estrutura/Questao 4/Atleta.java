public class Atleta {

    String nome;
    float altura;
    float peso;
    String esporte;
    String patrocinadores;

    public Atleta(String nome, float altura, float peso, String esporte, String patrocinadores) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.esporte = esporte;
        this.patrocinadores = patrocinadores;
    }

    public String toString(){
        return "Nome: "+nome+" Altura: "+altura+" Peso: "+peso+" Esporte: "+esporte+" Patrocinadores: "+patrocinadores;
    }
}
