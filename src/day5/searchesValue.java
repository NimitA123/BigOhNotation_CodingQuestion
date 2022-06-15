package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchesValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for(int i = 0; i < N;  i++) {
            arrayList1.add(input.nextInt());
        }
        for(int i = 0; i < N;  i++) {
            arrayList2.add(input.nextInt());
        }
        for(int i = 0; i < N;  i++) {
            arrayList3.add(input.nextInt());
        }
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        System.out.println(SearchValue(arrayList));

    }

    private static boolean SearchValue(List<ArrayList<Integer>> arrayList) {
        int count = 0;
       for(int i = 0;  i < arrayList.size();  i++){
           for(int j = 0;  j < arrayList.get(i).size()-1;   j++){
               if(arrayList.get(i).get(j)>arrayList.get(i).get(j+1)){
                   count++;
                   return false;
               }
           }

       }
        for(int i = 0;  i < arrayList.size()-1;   i++){
            if(arrayList.get(i).get(arrayList.size()-1)> arrayList.get(i+1).get(arrayList.size()-1)){
                return false;
            }
        }
        return true;


    }


}
