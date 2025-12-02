package loop;

public class Break {
    public static void main(String[] args) {
        for(int i=1; i<=10; i=i + 2) {
            if(i==5) {
                break;
            }
            System.out.println(i);
        }
    }
}