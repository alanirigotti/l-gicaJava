import java.util.Scanner;

// Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão	
// informados	valores	iguais)	e	escrever	o	maior	deles.

public class exe01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva dois valores numéricos: ");
        double a = leitor.nextDouble(); 
        double b = leitor.nextDouble(); 

        if(a == b || b == a) {
            System.out.println("Os números são iguas.");
        }
        if(a > b) {
            System.out.println("O número "+a+" é maior.");
        } else {
            System.out.println("O número "+b+" é maior.");
        }
          
    leitor.close();
    }

}