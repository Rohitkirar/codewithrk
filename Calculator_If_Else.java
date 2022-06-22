package codewithrk;

import java.util.Scanner;

public class Calculator_If_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operator;
        int num1 = 0, num2 = 0, result = 0, n = 1;
        while (n == 1) {
            System.out.println("Enter number 1 : ");
            num1 = scan.nextInt();
            System.out.println("Enter operator :");
            operator = scan.next().charAt(0);
            System.out.println("Enter number 2 : ");
            num2 = scan.nextInt();

            if (operator == '+') {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            } else if (operator == '/') {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else if (operator == '%') {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
            } else {
                System.out.println("INVALID OPERATOR!");
            }
            System.out.println("ENTER 1 TO CONTINUE OR 0 TO EXIT!");
            n = scan.nextInt();
        }
    }
}