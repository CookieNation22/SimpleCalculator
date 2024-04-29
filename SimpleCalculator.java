import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String []args) {
        System.out.println("Enter the first number:");
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();

        System.out.println("Enter the second number:");
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();

        System.out.println("Enter the operation:");
        Scanner sc3 = new Scanner(System.in);
        String op = sc3.nextLine();

        if(op.equals("+")) {
            System.out.print(num1 + num2);
        } else if(op.equals("-")) {
            System.out.print(num1 - num2);
        } else if(op.equals("*")) {
            System.out.print(num1 * num2);
        } else if(op.equals("/")) {
            System.out.print(num1 / num2);
        } else if(op.equals("%")) {
            System.out.print(num1 % num2);
        } else {
            System.out.print("error");
        }
    }
}