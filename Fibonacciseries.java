import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        int a=0,b=1,c;
//        System.out.println("Enter the number");
//        Scanner sc=new Scanner(System.in);
//        int num= sc.nextInt();
//        for(int i=1;i<=num;i++){
//            System.out.println(a+" ");
//            c=a+b;
//            a=b;
//            b=c;
//        }
        System.out.println("Fibonacci series for number:"+fibonacci(5));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
