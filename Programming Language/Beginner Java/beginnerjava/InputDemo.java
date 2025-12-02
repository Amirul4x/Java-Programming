package beginnerjava;
import java.util.Scanner;
public class InputDemo{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Any Number:");
        String number= input.nextLine();
        System.out.println("You Entered: " + number);

    } 
}