
public class aula01_ {

    // uma condição é representada pelo losangolo no fluxograma

    public static void main(String[] args) {
        
        //faça enquanto o i for menor ou igual a max (10)
        int i = 1; 
        int max = 10;

        System.out.println("Contando até: "+max);

        while(i <= max) {
            System.out.println("Valor de i: "+ i);
            i++;
        }
 
        // faça enquanto do for verdadeiro
        do {
            System.out.println("Valor de i: "+ i); 
            i++;          
        } while (i < 25);

        System.out.println(i);

        int c = 0;
        while(c < 10) {
            c++;
            if(c == 3 || c == 6 || c == 9) {
                continue;
            } 
            if(c == 7) {
                break;
            }
            System.out.println("Qt de cambalhotas: "+c);
         
        }
    }

}