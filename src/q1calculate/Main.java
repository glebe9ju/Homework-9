package q1calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Calculator obj = new Calculator();

        while(true){
            System.out.print("Enter the 1st no : ");
            int a = scr.nextInt();

            System.out.print("Enter the 2nd no :");
            int b = scr.nextInt();

            System.out.print("Enter the symbol :");

            char symbol = scr.next().charAt(0);

            obj.calculateResult(a, b, symbol);

            System.out.println("Would you like to do more calculations? Please enter 'Y' or 'N' ");

            char verify = scr.next().charAt(0);

            if(verify=='N' || verify=='n'){
                break;
            }

        }

    }

}
