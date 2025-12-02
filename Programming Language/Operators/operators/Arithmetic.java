package operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        int Num1,Num2,Result;
        
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number:");
        Num1 =input.nextInt();
        System.out.print("Enter Second Number:");
        Num2 =input.nextInt();

        //Arithmetic Operator

        Result=Num1+Num2;
        System.out.println("Sum=" +Result);

        Result=Num1-Num2;
        System.out.println("Sub=" +Result);

        Result=Num1*Num2;
        System.out.println("Mul=" +Result);

        double Result2=(double) Num1/Num2;
        System.out.printf("Div=%.2f\n",Result2);

        Result=Num1%Num2;
        System.out.println("Rem=" +Result);

        //Assignment Operator

        Result+=Num2;
        System.out.println("Sum:" +Result);
        Result-=Num2;
        System.out.println("Sub:" +Result);
        Result*=Num2;
        System.out.println("Mul:" +Result);
        Result/=Num2;
        System.out.println("Div:" +Result);
        Result%=Num2;
        System.out.println("Rem:" +Result);


    }
        
    
}
