package operators;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double base,length,Area;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter Base:");
        base =input.nextInt();
        System.out.print("Enter Length:");
        length =input.nextInt();

        Area= 0.5* base*length;
        System.out.println("Area of Triangle =" +Area);


    }
    
}
