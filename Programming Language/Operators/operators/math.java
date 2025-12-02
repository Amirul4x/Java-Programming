package operators;

public class math {
    public static void main(String[] args) {
        int x =-10;
        int y =2;
        int max= Math.max(x, y);
        System.out.println("Maximum number is:"+max);
        int  min = Math.min(x,y);
        System.out.println("Minimum number is:"+min);

        double absolute = Math.abs(x);
        System.out.println("Absolute value of X = "+absolute);

        double power = Math.pow(x, y);
        System.out.println("X to the power Y = "+power);

        double squareRoot = Math.sqrt(x);
        System.out.println("Square root of X = "+squareRoot);

        double pi= Math.PI;
        System.out.println("Value of Pi = "+pi);
    }
}
