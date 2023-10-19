package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Start of execution");
        System.out.println("----- Welcome to Calculator -----");
        System.out.println("Choose the operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int input = sc.nextInt();

        Main obj = new Main();

        if(input < 1 || input > 4) {
            System.out.println("Invalid input");
            logger.error("Invalid input");
            sc.close();
            return;
        }

        System.out.println("Enter the 1st operand");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd operand");
        int b = sc.nextInt();

        if(input == 1) {
            System.out.println("Result of "+a+" + "+b+" = "+obj.add(a, b));
        } else if(input == 2) {
            System.out.println("Result of "+a+" - "+b+" = "+obj.subtract(a, b));
        } else if(input == 3) {
            System.out.println("Result of "+a+" * "+b+" = "+obj.multiply(a, b));
        } else if(input == 4) {
            if(b == 0) {
                System.out.println("Division by 0 is not possible");
                logger.error("Division by 0 is not possible");
                sc.close();
                return;
            }
            System.out.println("Result of "+a+" / "+b+" = "+obj.divide(a, b));
        }
        sc.close();
    }

    public int add(int a, int b) {
        logger.info("START OP: Add");
        int result = a + b;
        logger.info("END OP: Add");
        return result;
    }
    public int subtract(int a, int b) {
        logger.info("START OP: Subtract");
        int result = a - b;
        logger.info("END OP: Subtract");
        return result;
    }
    public int multiply(int a, int b) {
        logger.info("START OP: Multiply");
        int result = a * b;
        logger.info("END OP: Multiply");
        return result;
    }
    public int divide(int a, int b) {
        logger.info("START OP: Divide");
        int result = a / b;
        logger.info("END OP: Divide");
        return result;
    }
}