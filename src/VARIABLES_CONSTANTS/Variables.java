package VARIABLES_CONSTANTS;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //CONCATENACIÓN
        var name = "Joel";
        var surname = "Yovera";

        //You can use " " here: No only in the System.out.println
        var fullName = name + " " + surname;
        System.out.println(fullName);


        //Using the Scanner class ... First import the class, see the line 1
        //With Scanner, can work in console
        Scanner consola = new  Scanner(System.in); //System.in is for: input in the console

        System.out.println("Write your name: ");
        var name2 = consola.nextLine(); //Next Line, the user can write the variable's value
        System.out.println("Name: " + name2);


        //EXERCISE WITH SCANNER
        //REMEMBER: First import the class
        Scanner biblioteca = new  Scanner(System.in);
        System.out.println("Write the book's tittle: ");
        var tittle = biblioteca.nextLine();
        System.out.println("Book's author: ");
        var author = biblioteca.nextLine();
        var messageBook = tittle + " was written by " + author;
        System.out.println(messageBook);
    }
}