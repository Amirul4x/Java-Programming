package operators;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int digit;
        Scanner input= new Scanner (System.in);
        System.out.print("Enter a digit: ");
        digit = input.nextInt();
        switch(digit){
            case 0:
                System.out.println("Selected Language Is Bangla");
                break;
            case 1:
                System.out.println("Selected Language Is Hindi");
                break;
            case 2:
                System.out.println("Selected Language Is Urdu");
                break;
            default:
                System.out.println("Selected Language Is English");
        }
    }
    
}