import java.util.Scanner;
//Note: println ---> print line (jump line)

public class StringToInteger {
    public static void main(String[] args) {
        /*We have got two forms for converting variables,
        .nextLine(); ---> Convert our variable to String, but if we use Integer...so We can do it:*/

        //Scanner + nameVariable = new Scanner(System.in); REMEMBER THIS SINTAXIS
        Scanner info = new Scanner(System.in);

        //Input of data:
        System.out.print("Write your name: ");
        var name = info.nextLine();
        System.out.print("Write your age: ");
        var age = Integer.parseInt(info.nextLine());
        System.out.println("Have you got any sisters?");
        var sisters = Boolean.parseBoolean(info.nextLine());
        System.out.print("What is your favorite drink? ");
        var drink = info.nextLine();
        System.out.println("How much is " + drink + "? ");
        var price = Float.parseFloat(info.nextLine());

        //The result
        System.out.println("My name is " + name + ". I'm " + age + " years old");
        System.out.println("Have I got any sisters? " + sisters);
        System.out.println("My favorite drink is " + drink + ", and its price is s/." + price);
    }
}
