import java.util.Scanner;
public class Submatrix {
        public static void main(string[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr1 = new int[3][3];
            int[][] arr2 = new int[3][3];
            int[][] arr3 = new int[3][3];
            int i, j;
            System.out.println("Enter the first matrix");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("First matrix:");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter the second matrix");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Second matrix:");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println( );
            }
            System.out.println("Resultant matrix:");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    arr3[i][j] = arr1[i][j] - arr2[i][j];
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }

