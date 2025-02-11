import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("THIS IS A SIMPLE CALCULATOR.");
            System.out.print("\nType for x: ");
            float x = Float.parseFloat(sc.nextLine());
            System.out.print("Type for y: ");
            float y = Float.parseFloat(sc.nextLine());
            System.out.println("\n1. Addition." );
            System.out.println("2. Substraction." );
            System.out.println("3. Multiplication." );
            System.out.println("4. Division." );
            System.out.print("Select an operation among the options: ");
            String cases = sc.nextLine();

            float result;
            switch (cases) {
                case "1":
                result = x + y;
                System.out.println("\nx + y : " + result); // Addition result.
                break;
                case "2":
                result = x - y;
                System.out.println("\nx - y : " + result); // Substraction result.
                break;
                case "3":
                result = x * y;
                System.out.println("\nx * y : " + result); // Multiplication result.
                break;
                case "4":
                result = x / y;
                System.out.println("\nx / y : " + result); // Division result.
                break;
                default:
                System.out.println("\nIncorrect selection!");
            }
        }
    }
}