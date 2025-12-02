package operators;

import java.util.Scanner;

public class AssignmentLogical {
    public static void main(String[] args) {
        char y='y';
        char Y='Y';
        char n='n';
        char N='N';
        Scanner input= new Scanner (System.in);
        System.out.println("Do you Love programming?");
        System.out.print("Answer:");
        char ch=input.next().charAt(0);
        if(ch==y||ch==Y){
            System.out.println("You are a programmer!");
        }
        else if(ch==n||ch==N){
            System.out.println("You are not a programmer!");
        }
        else{
            System.out.println("Invalid Input!");
        }

                // Ask about masters
        System.out.print("Have you completed your masters? (y/n): ");
        char masters = input.next().charAt(0);

                                                                    // Ask about English fluency
        System.out.print("Are you fluent in English? (y/n): ");
        char english = input.next().charAt(0);

                                                                          // Check eligibility
        if ((masters == y || masters == Y) && (english == y || english == Y)) {
                System.out.println("Congratulations! You are eligible for the job interview.");
            } else {
                System.out.println("Sorry, you are not eligible for the job interview.");
            }



    }
    
}