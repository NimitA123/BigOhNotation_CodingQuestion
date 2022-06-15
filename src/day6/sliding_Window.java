package day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sliding_Window {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;  i < N;  i++){
            A[i] = input.nextInt();
        }
        //1, 2, 3, 1, 4, 5, 2, 3, 6
        int target = input.nextInt();
        int loop = N-target;
        for(int i = 0;  i <= loop;   i++){
            for(int j = i;  j < target;  j++){
                arrayList.add(A[j]);
                //System.out.println(A[j]+" ");
            }
            //3 3 4 5 5 5 6
            Collections.sort(arrayList);
            System.out.print(arrayList.get(arrayList.size()-1)+" ");
            arrayList.clear();
            target++;
        }
    }
}
