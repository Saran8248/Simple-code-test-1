import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.next();
        
        double result = 0;
        boolean valid = true;
        switch (operation.toLowerCase()) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("error");
                    valid = false;
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("error");
                valid = false;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
