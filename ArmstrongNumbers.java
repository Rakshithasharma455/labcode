package day2;

import java.util.Scanner;

public class ArmstrongNumbers {

    //  to print Armstrong numbers in the range
    public static void printArmstrongNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    //  to check if a number is an Armstrong number
    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int cube = digit * digit * digit; 
            sum += cube;
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        System.out.println("Armstrong numbers in the range:");
        printArmstrongNumber(start, end);

      
    }
}