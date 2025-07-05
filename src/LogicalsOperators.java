import java.util.Scanner;
public class LogicalsOperators {
    public static void main(String[] args) {
        /*
        false = 0
        true = 1

        AND (MULTIPLICACIÓN)
        0 * 0 = 0
        0 * 1 = 0
        1 * 0 = 0
        1 * 1 = 1
        OR (ADICCIÓN)
        0 + 0 = 0
        0 + 1 = 1
        1 +  0 = 1
        1 + 1 = 1
         */

        Scanner console = new  Scanner(System.in);

        System.out.println("WRITE YOUR FIRST VARIABLE (true/false): ");
        boolean a = Boolean.parseBoolean(console.nextLine());
        System.out.println("WRITE YOUR SECOND VARIABLE (false/true): ");
        boolean b = Boolean.parseBoolean(console.nextLine());

        System.out.println("---RESULTS---");
        var resultadoAND = a && b;
        var resultadoOR = a || b;
        var resultadoNot = !a;

        System.out.println("AND (&&): " + resultadoAND);
        System.out.println("OR (||): " + resultadoOR);
        System.out.println("NOT (!): " + resultadoNot);
    }
}
