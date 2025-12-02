package operators;

public class Unary {
    public static void main(String[] args) {
        int x=10;
        int y;
        int result;
        
        result=+x;
        System.out.println("result of Unary Plus=" +result);
        
        result=-x;
        System.out.println("result of Unary Minus=" +result);
        




        y=++x;
        System.out.println("Y=" +y); //Y=11

        y=x--;
        System.out.println("Y=" +y); //Y=11
       
        y=++x;
        System.out.println("Y=" +y); //Y=11
       
        y=--x;
        System.out.println("Y=" +y);  //Y=10
       
        y=x--;
        System.out.println("Y=" +y);  //Y=10
        
        y=x++;
        System.out.println("Y=" +y);  //Y=9

        y=x++;
        System.out.println("Y=" +y);  //Y=10
        

    }

}
