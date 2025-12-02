package operators;

import java.util.Scanner;

public class IfElse {   
    public static void main(String[] args){
        int number;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number%2 ==0) {
            System.out.println(number + " is an even number.");

        }
        else if (number%2 != 0) {
            System.out.println(number + " is an odd number.");

        } 
        else {
            System.out.println("The number is neither even nor odd.");
        }
    }
}
