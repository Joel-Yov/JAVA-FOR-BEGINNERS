package OPERATORS;

public class RelationalOperators {
    public static void main(String[] args) {
        //==
        int a=3, b=3;
        var resultado = a == b;
        System.out.println("RESULTADO: " + resultado);

        //Distinto !=
        resultado = a != b;
        System.out.println("RESULTADO: " + resultado);

        // >
        resultado = a > b;
        System.out.println("RESULTADO: " + resultado);

        // >=
        resultado = a >= b;
        System.out.println("RESULTADO: " + resultado);

        // <
        resultado = a < b;
        System.out.println("RESULTADO: " + resultado);

        // <=
        resultado = a <= b;
        System.out.println("RESULTADO: " + resultado);
    }
}
