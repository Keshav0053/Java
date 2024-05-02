import java.util.Scanner;

public class Twonumswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ist number");
        int A = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int B = sc.nextInt();
        int Temp;
        Temp = A;
        A = B;
        B = Temp;
        System.out.println("After swap");
        System.out.println("a="+ A);
        System.out.println("b="+ B);
    }
}
