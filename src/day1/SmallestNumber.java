package day1;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i =1; i <= 9;   i++){
            int number = i;
            if(number%1 == 0 && number % 9 == 0){
                System.out.println(number);
            }
        }
    }
}
