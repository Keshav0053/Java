import java.util.Scanner;
public class EvenorOdd {
    public static void main(string[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number");
        int b=a.nextInt();
        if(b%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}