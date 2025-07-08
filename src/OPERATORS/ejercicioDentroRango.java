package OPERATORS;

import java.util.Scanner;

public class ejercicioDentroRango {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Write your number: ");
        int number = Integer.parseInt(consola.nextLine());

        boolean resultado = number >= 0 && number <=5;

        System.out.println(resultado);
    }
}