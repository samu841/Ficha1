import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner teclado = new Scanner(System.in);

        // Implemente uma função que converta graus Celsius em Fahrenheit: F = (9/5) C + 32
        /*double c, f;
        System.out.print("\nIndique o valor em graus celsius: ");
        c = teclado.nextDouble();
        f = celsiusParaFahrenheit(c);
        System.out.println(c + "ºC = " + f + "ºF");*/

    }
    /* 1
     * @param c - graus celsius
     * @return graus fahrenheit */
    public static double celsiusParaFahrenheit(double c) {
        return (9.0/5) * c + 32;
    }
}