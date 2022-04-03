package homework9;
//2. Re write the student mark sheet programme using if else and while loop.

import java.util.Scanner;

public class Q2MarkSheet {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("\nEnter Student Name \t\t:\t");
        String name = scr.nextLine();
        System.out.println("Enter Roll No.\t\t: \t");
        int rollNum = scr.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = scr.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
           // mathsMarks = scr.nextInt();
        }
        System.out.println("Enter Marks of Subject Science: \t:\t");
        int scienceMarks = scr.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
           // scienceMarks = scr.nextInt();
        }
        System.out.println("Enter Marks of Subject English: \t:\t");
        int englishMarks = scr.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct markss \t\t:\t");
          //  englishMarks = scr.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarksSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        scr.close();

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        }else {
            grade = "-";
        }
        return grade;
    }
    public static void printTheMarksSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                          int englishMarks, double total, double percentage, String result,
                                          String grade){
        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Name:" + name + "                         |");
        System.out.println("| Roll No:" + rollNum + "                      |");
        System.out.println("|------------------------------------|");
        System.out.println("| Subjects : Marks                   |");
        System.out.println("|------------------------------------|");
        System.out.println("| Math : " + mathsMarks + "                       |");
        System.out.println("| Science : " + scienceMarks + "                    |");
        System.out.println("| English : " + englishMarks + "                    |");
        System.out.println("|------------------------------------|");
        System.out.println("| Total : " + total + "                    |");
        System.out.println("|------------------------------------|");
        System.out.println("| Percentage : " + percentage + "                |");
        System.out.println("| Result : " + result + "                    |");
        System.out.println("| Grade : " + grade + "                       |");
        System.out.println("|------------------------------------|");
    }
    }
