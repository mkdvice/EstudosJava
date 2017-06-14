/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equacaodosegundo;

import java.util.Scanner;

/**
 *
 * @author 1411120102
 */
public class EquacaoDoSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int c = teclado.nextInt();
        
        System.out.println("X² + x + c = 0");
        System.out.println("b² - 4 * a * c");
        System.out.printf("%d",(b) , "² + ", "- 4 * ", + a, "* ", + c, "\n" );
                
        double d = Math.pow(b,2) - 4 * a * c;
        System.out.println("Valor de Delta é: " + d);
        
        double x1 = (- b - Math.sqrt(d)) / (2 * a);
        System.out.println("Valor de X linha é: " + x1);
        
        double x2 = (- b + Math.sqrt(d)) / (2 * a);
        System.out.println("Valor de X duas linhas é: " + x2);
        
        if (d<0)
            System.out.println("a equação não possui raízes reais.");
    }
    
}
