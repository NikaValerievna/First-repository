import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Sum ");
            System.out.println("2. Deduction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division ");
            System.out.println("0. Exit ");

            Scanner myObj = new Scanner(System.in);
            String menuItem = myObj.nextLine();
            System.out.println("Menu item is: " + menuItem);
            if (menuItem.contains("0") || menuItem.contains("exit")) {
                System.out.println("Bye");
                break;
            }
            switch (menuItem) {
                case "1":
                    System.out.println("Enter first number: ");
                    int firstNumber = myObj.nextInt();
                    System.out.println("Enter second number: ");
                    int secondNumber = myObj.nextInt();
                    System.out.println("Result of sum: " + sum(firstNumber, secondNumber));
                    break;
                case "2":
                    System.out.println("Enter first number: ");
                    int FirstNumber = myObj.nextInt();
                    System.out.println("Enter second number: ");
                    int SecondNumber = myObj.nextInt();
                    System.out.println("Result of deduction: " + sub(FirstNumber, SecondNumber));
                    break;
                case "3":
                    System.out.println("Enter first number: ");
                    int numberFirst = myObj.nextInt();
                    System.out.println("Enter second number: ");
                    int numberSecond = myObj.nextInt();
                    System.out.println("Result of multiplication: " + mult(numberFirst, numberSecond));
                    break;
                case "4":
                    System.out.println("Enter first number: ");
                    int NumberFirst = myObj.nextInt();
                    System.out.println("Enter second number: ");
                    int NumberSecond = myObj.nextInt();
                    System.out.println("Result of division: " + div(NumberFirst, NumberSecond));
                    break;
            }
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int sub(int FirstNumber, int SecondNumber) {
        return FirstNumber - SecondNumber;
    }
    public static int mult(int numberFirst, int numberSecond) {
        return numberFirst * numberSecond;
    }
    public static int div(int NumberFirst, int NumberSecond) {
        return NumberFirst / NumberSecond;
    }
}
