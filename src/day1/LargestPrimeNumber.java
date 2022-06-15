package day1;

import java.util.Scanner;

public class LargestPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = N-1;  i >= 2;   i--){
          //  int count = 0;
            String name = String.valueOf(i);
           int result =  isValidPrime(name);
           if(name.length()==result){
               System.out.println(name);
               break;
           }
        }
       // System.out.println("No ");
    }

    private static int isValidPrime(String name) {
     //  System.out.println(name);
        int count= 0;
        for(int i = 0;  i < name.length();  i++){
            boolean flag = true;
            //int count = 0;
            int digit = Character.getNumericValue(name.charAt(i));
            //System.out.println(digit);
            for(int j = 2;  j <= digit/2;  j++){
                if(digit % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == false){

            }
            else{
                count++;
            }
        }
        return count;
    }
}
