import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b;
        double result;

        Scanner enter = new Scanner(System.in);

        //Taking inputs from the form the user
        System.out.println("Enter first number ");
        a = enter.nextDouble();

        System.out.println("Enter second number ");
        b = enter.nextDouble();

        System.out.println("Arithmetic operation? (+,-,/,*):");
        char operator = enter.next().charAt(0);

        switch (operator){
            case '+' :
                result = a + b;
                break;

            case '-' :
                result=a - b;
                break;

            case '*' :
                result = a * b;
                break;

            case '/' :
                result = a / b;
                break;

            default:
                System.out.println("Invalid operator");
                return;

        }

        System.out.println(a + " "+ operator+ " "+ b +" = "+ result);

        enter.close();

    }
}