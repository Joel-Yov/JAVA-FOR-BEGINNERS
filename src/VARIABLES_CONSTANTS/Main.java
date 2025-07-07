package VARIABLES_CONSTANTS;

public class Main {
    public static void main(String[] args) {
        //THIS IS MY FIRST JAVA'S EXERCISE
        /*
            H
            E
            L
            L
            O
         */
        System.out.println("JAVA FOR BEGINNERS");

        //DECLARATION OF VARIABLES: (KIND OF DATA) + (variableName(Use camelCase for variables)) = value;
        int variableInteger = 10;
        System.out.println(variableInteger);

        int edad = 20;
        double sueldo = 1025.50;
        String name = "Joel Yovera";

        System.out.println("Mi nombre es " + name + " tengo " + edad + ", y mi sueldo mínimo es: " + sueldo);

        //We can change the value of our variable, now variableInteger is 15, no 10.
        variableInteger = 15;
        System.out.println(variableInteger);

        //Now, we use String, this isn´t a primitive variable
        String variableString = "Hi String";
        //We can use control + click when we want to know where the definition of variable is.
        System.out.println(variableString);

        //USE VAR - INFERENCIA DE TIPOS EN JAVA
        var myVariableInteger2 = 20;
        System.out.println(myVariableInteger2);

        var myVariableString2 = "Hi GitHub";
        System.out.println("myVariableString2 = " + myVariableString2);
    }
}