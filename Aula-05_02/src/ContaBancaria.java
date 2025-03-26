public class ContaBancaria {
    private  String titular;
    private  double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if (valor>saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
        }
    }
}
