package operators;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        int num1,num2,max;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two numbers:");
        num1=input.nextInt();
        num2=input.nextInt();
        max=(num1>num2)?num1:num2;
        System.out.println("Maximum number is:"+max);  
    
        
    }
    
}
