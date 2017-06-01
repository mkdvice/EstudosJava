
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Ezequiel Alexandre <ezequielaraujo1997gmail.com>
 */
public class ProgramaIdade {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Em que ano você nasceu? ");
        
        int nasc = teclado.nextInt();      
               
        int i = 2017-nasc;
        
        System.out.println("Sua idade é " + i);
        
        if (i>18) {
            System.out.println("Maior de Idade");           
        } else {
            System.out.println("Manor de Idade");
        }
        
    }
    
}
