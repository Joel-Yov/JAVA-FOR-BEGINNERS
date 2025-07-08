package OPERATORS;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa el valor de la base: ");
        int base = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa el valor de la altura: ");
        int altura = Integer.parseInt(consola.nextLine());

        int perimetro = (base+altura)*2;

        int area = base * altura;

        System.out.println("El área es: " + area + " m^2");
        System.out.println("El perímetro es: " + perimetro + " m");
    }
}