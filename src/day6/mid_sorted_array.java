package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mid_sorted_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0;   i < N;   i++){
            A[i] = input.nextInt();
        }
        for(int j = 0;  j < N;  j++){
            B[j] = input.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;  i < N;  i++){
            arrayList.add(A[i]);
        }
        for(int j = 0;  j < N;  j++){
            arrayList.add(B[j]);
        }
        Collections.sort(arrayList);
        int mid = (arrayList.size()-1)/2;
        System.out.println(arrayList.get(mid));
    }
}
