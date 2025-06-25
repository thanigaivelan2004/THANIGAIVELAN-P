
import java.util.Scanner;
class Calculator {
    double n1, n2;
    String operator;
    Calculator(double n1, double n2, String operator) {
        this.n1 = n1;
        this.n2 = n2;
        this.operator = operator.toLowerCase();
    }
    public void calc() {
        switch (operator) {
            case "+":
                System.out.println("Sum: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Difference: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Product: " + (n1 * n2));
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println("Quotient: " + (n1 / n2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation entered.");
        }
    }
}

public class Problem_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double n = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double m = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter operation like +,-,*,/: ");
        String op = sc.nextLine();
        Calculator c = new Calculator(n, m, op);
        c.calc();
        sc.close();

    }
}
