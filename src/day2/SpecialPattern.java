package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class SpecialPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
     //   System.out.println("I love hindi\");
        String[][] Array = new String[row][column];
        int div= row /2;
        int target1 = row-1;

        for(int i = 0;   i < row;   i++){
            int target2 = i;
            for(int j = 0;  j < column;   j++){
                if(i == j){
                 ///  if(div == i)
                    Array[i][j] ="\\";


                }
                else if(target1 == j){
                 //   System.out.println(target1);
                    Array[i][j] = "/";
                }
                else{
                    Array[i][j] = "*";
                }
                // target1--;
            }
            target1--;
        }
        for(int i = 0; i < row;   i++){
            for(int j = 0;   j < column;   j++){
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }

    }
}
