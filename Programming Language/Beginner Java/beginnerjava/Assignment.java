package beginnerjava;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        String Id;
        String Title;
        Double Price;
        String Description;
        String Category;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter Id:");
        Id=input.nextLine();

        System.out.print("Enter Title:");
        Title=input.nextLine();

        System.out.print("Enter Price:");
        Price=input.nextDouble();
        input.nextLine();                     // Consume the newline character after nextDouble()

        System.out.print("Enter Description:");
        Description=input.nextLine();

        System.out.print("Enter Category:");
        Category=input.nextLine();

        System.out.println("Id: " + Id);
        System.out.println("Title: " + Title);
        System.out.println("Price: " + Price);
        System.out.println("Description: " + Description);
        System.out.println("Category: " + Category);

    }
    
}
