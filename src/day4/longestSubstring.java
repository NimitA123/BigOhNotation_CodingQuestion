package day4;

import java.util.*;

public class longestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
       LinkedHashMap<Character,  Integer>  hashMap = new LinkedHashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        for(int i = 0;  i < s.length();  i++){
            String empty = "";
            for(int j = i;  j < s.length();   j++){
                empty+=s.charAt(j);
                arrayList.add(empty);
            }
        }


        for(int i = 0;  i < arrayList.size();  i++){
          String  empty1 = arrayList.get(i);
            int count =0;
            for(int j = 0;  j < empty1.length();   j++){
                if(hashMap.containsKey(empty1.charAt(j))){
                   // arrayList.remove(i);
                    count++;
                   break;
                }
                else {
                    hashMap.put(empty1.charAt(j),   1);
                }
            }
            hashMap.clear();
            if(count == 0){
                arrayList1.add(empty1);
            }

        }
        int count1 = 0;
        for(int i= 0; i < arrayList1.size();    i++){
            if(count1 < arrayList1.get(i).length()){
                count1 = arrayList1.get(i).length();
            }
        }
        for(int i= 0;  i < arrayList1.size();  i++){
            if(count1 == arrayList1.get(i).length()){
                System.out.println(arrayList1.get(i));
                break;
            }
        }
        //System.out.println(arrayList1);
    }
}
