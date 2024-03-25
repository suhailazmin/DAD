import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many marks do you want to insert? ");
        int numberOfMarks = scanner.nextInt();
        
        double totalMark = 0.0;

        for (int i = 1; i <= numberOfMarks; i++) {
            System.out.print("Please enter mark no " + i + ": ");
            double mark = scanner.nextDouble();
            totalMark += mark;
            System.out.println("Mark: " + mark + " has been inserted.");
        }

        System.out.println("Total mark is: " + totalMark);
        
        System.out.println("Press any key to continue.....");
        scanner.close();
    }
}
