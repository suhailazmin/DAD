import java.util.Scanner;

public class Lab2Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your first number:");
        float firstNumber = scanner.nextInt();

        System.out.println("Insert your second number:");
        float secondNumber = scanner.nextInt();

        float sum = firstNumber + secondNumber;

        System.out.println("The sum of the two values is: " + sum);

        scanner.close(); 
    }
}