import java.time.LocalDate;
import java.util.Scanner;

public class exe02 {
    
    /*Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e	
    escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano	
    (não	é	necessário	considerar	o	mês	em	que	ela	nasceu). */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a sua data de nascimento:");
        int data = leitor.nextInt();

        if(data <= 2005) {
            System.out.println("Você poderá votar neste ano.");
        } else {
            System.out.println("Você não poderá votar ainda.");
        }
    
        leitor.close();
    }

}
