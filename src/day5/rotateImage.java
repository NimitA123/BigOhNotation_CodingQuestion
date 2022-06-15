package day5;

import java.util.Scanner;

public class rotateImage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] A = new int[row][column];
        for(int i = 0; i < row;  i++){
            for(int j = 0;  j < column;  j++){
                A[i][j] = input.nextInt();
            }
        }
        for(int i = 0;  i < row;  i++){
            for(int j = column-1;   j >= 0;  j--){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }
}
