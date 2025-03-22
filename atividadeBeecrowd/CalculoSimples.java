import java.util.Scanner;
public class CalculoSimples{
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int peca1code = digitar.nextInt();
        int peca1numero = digitar.nextInt();
        double peca1valor = digitar.nextDouble();
        int peca2code = digitar.nextInt();
        int peca2numero = digitar.nextInt();
        double peca2valor = digitar.nextDouble();
        double total = (peca1numero*peca1valor)+(peca2numero*peca2valor);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
    }
}