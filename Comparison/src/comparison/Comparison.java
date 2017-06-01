package comparison;

/**
* @author Ezequiel Alexandre <ezequielaraujo1997@gmail.com>
*/

// Compara inteiros utilizando instrções if, operadores relacionais
// e operadores de igualdade

import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison {

    // método main inicia a execução do aplicativo
    public static void main(String[] args) {
        
        // cria Scanner para obter entrada a partir da linha de comando
        Scanner teclado = new Scanner(System.in);
        
        int number1;    // primeiro número a comparar
        int number2;    // segundo número a comparar
        
        System.out.print("Insira o primeiro inteiro: ");    // prompt
        number1 = teclado.nextInt();  // lê o primeiro número fornecido pelo usuário
        
        System.out.print("Insira o segundo inteiro"); // prompt
        number2 = teclado.nextInt(); // lê o segundo número fornecido pelo usuário
        
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        
    }
    
}
