package codewithrk;

import java.util.Scanner;

public class Calculator_Switch_Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operator;
        int num1, num2, result, n = 1;
        while (n == 1) {
            System.out.println("Enter number 1 : ");
            num1 = scan.nextInt();
            System.out.println("Choose operator +, -, *, /, % : ");
            operator = scan.next().charAt(0);
            System.out.println("Enter number 2 : ");
            num2 = scan.nextInt();
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case '%':
                    result = num1 % num2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Please choose correct operator!");
            }
            System.out.println("Choose 1 to Continue or 0 to Exit!");
            n = scan.nextInt();
        }

    }
}