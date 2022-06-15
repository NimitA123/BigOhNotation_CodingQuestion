package day5;
import java.util.ArrayList;
import java.util.Scanner;
public class possibleCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] A_1 = {"Z", "Y", "A"};
        String[] A_2 = {"B", "O"};
        String[] A_12 = {"Z"};
        String[] A_3 = {"U", "P"};
        if(s.length()==1){
            if(s.contains("A_1")){
                System.out.println(oneCombination(A_1));
            }
            else if(s.contains("A_2")){
                System.out.println(oneCombination(A_2));
            }
            else{
                System.out.println(oneCombination(A_3));
            }
        }
        else if(s.length()==2){
            if(s.contains("A_1") && s.contains("A_2")){
                System.out.println(twoCombination(A_1, A_2));
            }
            else if(s.contains("A_1") && s.contains("A_3")){
                System.out.println(twoCombination(A_1,  A_3));
            }
            else{
                System.out.println(twoCombination(A_2, A_3));
            }
        }
        else{
            if(s.contains("1") && s.contains("2") && s.contains("3")  ){
                if(s.contains("A_12")){
                    System.out.println(threeCombination(A_1, A_2,  A_3, A_12, s));
                }
                else{
                    System.out.println(threeCombination(A_1, A_2,  A_3, A_12, s));
                }

            }
        }
    }
    //ZBU, ZBP, ZOU, ZOP, YBU, YBP, YOU, YOP, ABU, ABP, AOU, AOP, LU, LP

    private static ArrayList<String> threeCombination(String[] a_1, String[] a_2, String[] a_3, String[] a_12, String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;  i < a_1.length;  i++){
            for(int j = 0;  j < a_2.length;  j++){
                for(int k = 0; k < a_3.length;   k++){
                    String S = a_1[i]+a_2[j]+a_3[k];
                    arrayList.add(S);
                }
            }
        }
        if(s.contains("A_12")){
            for(int i = 0;  i < a_12.length;   i++){
                if(s.charAt(s.length()-1)=='3'){
                    for(int j = 0;  j < a_3.length;  j++){
                        String S = a_12[i]+a_3[j];
                        arrayList.add(S);
                    }
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<String> twoCombination(String[] a_1, String[] a_2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;  i < a_1.length;   i++){
            for(int j = 0;  j < a_2.length;   j++){
                String s = a_1[i]+a_2[j];
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    private static ArrayList<String> oneCombination(String[] a_1) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;  i < a_1.length;   i++){
            arrayList.add(a_1[i]);
        }
        return arrayList;
    }
}
