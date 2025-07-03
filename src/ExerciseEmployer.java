import java.util.Scanner;

public class ExerciseEmployer {
    public static void main(String[] args) {

        Scanner employer = new Scanner(System.in);

        //ASK FOR INFORMATION
        System.out.println("Employer's Register");
        System.out.print("Write your name: ");
        var name = employer.nextLine();
        System.out.print("Write your age: ");
        var age = Integer.parseInt(employer.nextLine());
        System.out.print("Input your salary: ");
        var salary = Double.parseDouble(employer.nextLine());
        System.out.println("Are you good employer? ");
        var good = Boolean.parseBoolean(employer.nextLine());

        //DATA OUTPUT
        System.out.println("THE INFORMATION IS: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Good? " + good);
    }
}
