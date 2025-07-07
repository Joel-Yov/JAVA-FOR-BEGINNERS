package OPERATORS;

public class OperatorUnarios {
    public static void main(String[] args) {
        //DECLARATION VARIABLES
        int a = 3, b = -2, resultado = 0;
        boolean c = false;

        //OPERATOR UNARIO -
        resultado = -a;
        System.out.println("RESULTADO: " + resultado);

        //OPERATOR UNARIO -
        resultado = -b;
        System.out.println("RESULTADO: " + resultado);

        // OPERATOR PREINCREMENTO ++a
        resultado = ++a;
        System.out.println("RESULTADO: " + resultado);

        //OPERATOR POST-INCREMENTO a++
        a = 3; //WE NEED TO USE THE VARIABLE BEFORE
        resultado = a++;
        System.out.println("RESULTADO: " + resultado);
    }
}
