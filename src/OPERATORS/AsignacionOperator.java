package OPERATORS;

public class AsignacionOperator {
    public static void main(String[] args) {

        //ASIGNACIÓN
        var myNumber = 10;
        int mySecondNumber; //Only declaration, no asignación
        mySecondNumber = 5;

        //ASIGNACIÓN COMPUESTA

        //+=
        mySecondNumber += 5;
        System.out.println(mySecondNumber);

        //-=
        mySecondNumber -= 5;
        System.out.println(mySecondNumber);

        //*=
        mySecondNumber *= 5;
        System.out.println(mySecondNumber);
    }
}
