package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] Array =  new int[N];
        for(int i = 0;  i < N;   i++){
            Array[i] = input.nextInt();
        }
        ArrayList<Integer> B = uniqueArray(Array);
        System.out.println(B);
    }

    private static ArrayList<Integer> uniqueArray(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;   i < array.length;   i++){
            hashSet.add(array[i]);
        }
        for(int element : hashSet){
            arrayList.add(element);
        }
        return arrayList;
    }
}
