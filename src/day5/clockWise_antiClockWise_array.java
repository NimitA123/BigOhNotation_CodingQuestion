package day5;
import java.util.Scanner;
public class clockWise_antiClockWise_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] A = new int[row][column];
        for(int i = 0;  i < row;   i++){
            for(int j = 0;   j < column;   j++){
                A[i][j] = input.nextInt();
            }
        }
        int left = 0;
        int right = column-1;
        int top = 0;
        int bottom = row-1;
        while(bottom!= 0) {
            for (int i = left; i <right; i++) {
                System.out.print(A[top][i] + " ");

            }
            top++;
            for (int i = top; i < bottom; i++) {
                System.out.print(A[i][right] + " ");
            }
            right--;
            for (int i = right; i > left; i--) {
                System.out.print(A[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i > top; i--) {
                System.out.print(A[i][left] + " ");
            }
            left++;
        }
    }
}
