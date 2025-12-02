package assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            sum = sum + i;
        }
         System.out.println("Sum of 1 to " +num+ " = " + sum);
    }
    
}
