public class ContaBancaria {

    private String nomeTitular;
    private int numeroConta;
    private int numeroAgencia;
    private float saldoConta;

    public ContaBancaria(){
        this.nomeTitular = "";
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.saldoConta = 0;
    }


    public void cadastrastrarConta(String nomeTitular, int numeroConta, int numeroAgencia, float saldoConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldoConta = saldoConta;
    }


    public void deposistarValores(float deposito){
        System.out.println("*-----*");
        saldoConta = saldoConta + deposito;
        System.out.println("Nome da conta: "+nomeTitular+ " Valor depositado: "+deposito+" Saldo Disponivel na conta: "+ saldoConta);
    }

    public void retirarValores(float retirar){
        System.out.println("*======*");
        if (retirar < saldoConta){
            saldoConta = saldoConta - retirar;
            System.out.println("Nome da Conta: "+nomeTitular+" Valor Retirado:"+ retirar+" Saldo Restante: "+saldoConta);
        }
        else {
            System.out.println("Voce não possui esse saldo na sua conta");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String toString(){
        return " Nome do Titular: "+nomeTitular+" Numero da Conta: "+numeroConta+" Numero da Agencia: "+numeroAgencia+" Saldo Bancario: "+saldoConta;
    }
}
