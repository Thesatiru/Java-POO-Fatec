public class App {
    public static void main(String[] args) throws Exception {
        Corpo_humano c1 = new Corpo_humano();
        c1.setMassa(80);
        c1.setVolume(10);
        c1.calcularDensidade();
        System.out.println(c1.getDensidade());


        ContaBancaria cb = new ContaBancaria();
        cb.setTitular("Rafael");
        cb.depositar(500);
        System.out.println("O saldo é " +cb.getSaldo());


        cb.sacar(500);
        System.out.println("O saldo é: "+cb.getSaldo());
    }
}
