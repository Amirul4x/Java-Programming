package operators;

import java.util.Scanner;

public class logical{
    public static void main(String[] args) {
        char ch;
        Scanner input= new Scanner (System.in);
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
            System.out.println(" Vowel.");
        }
        else {
            System.out.println(" Consonant.");
        }
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
            System.out.println(" is an Alphabet.");
        }
        else {
            System.out.println(" is not an Alphabet.");
        }

    }
}