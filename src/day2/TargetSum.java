package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int targetsum = input.nextInt();
        for(int i = 0;   i < N;   i++){
            A[i] = input.nextInt();
        }
        for(int i = 0;  i < N;  i++){
            String str = String.valueOf(A[i]);
       //     int sum = 0;
            if(str.length()==3){

                int sum1 = 0;
                for(int j = 0;  j < str.length();    j++){
                    sum1+=Character.getNumericValue(str.charAt(j));
                }
                if(sum1==targetsum){
                    arrayList.add(A[i]);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
