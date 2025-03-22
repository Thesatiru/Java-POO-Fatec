
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int idadeEmDias = digitar.nextInt();
        int idadeAno = idadeEmDias/365;
        int idadeMes = (idadeEmDias%365)/30;
        int idadeDias = (idadeEmDias%365)%30;
        System.out.println(idadeAno+" ano(s)");
        System.out.println(idadeMes+" mes(es)");
        System.out.println(idadeDias+" dia(s)");
        
    }
}
