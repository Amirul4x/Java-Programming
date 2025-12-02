package operators;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        int x,y;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number:");
        x= input.nextInt();
        
        System.out.print("Enter Second Number:");
        y= input.nextInt();

        x+=y;
        System.out.println("Sum:" +x);
        x-=y;
        System.out.println("Sub:" +x);

        x*=y;
        System.out.println("Mul:" +x);
        x/=y;
        System.out.println("Div:" +x);

        x%=y;
        System.out.println("Rem:" +x);
        
    }
    
}
