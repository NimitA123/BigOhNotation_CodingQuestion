package day4;

import java.util.*;

public class stringUtils {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
       // String pattern = input.next();
      //  char c = input.next().charAt(0);

     //   System.out.println(containsAllWordChar(s,  c));
       // System.out.println(reverseVowel(s));
        System.out.println(reverseString(s));
    }

    private static boolean containsAllWordChar(String s, char c) {
        for(int i = 0;  i < s.length();   i++){
            if(s.charAt(i) != c){
                return false;
            }
        }
        return true;
    }

    private static boolean hasPattern(String s, String pattern) {
        int count= 0;
        for(int i = 0;  i  < s.length();   i++){
            String empty = "";
            for(int j = i;  j < s.length();   j++){
                empty+=s.charAt(j);
                if(empty.equals(pattern)){
                    count++;
                    break;
                }
            }
        }
        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    private static char[] reverseVowel(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] c = s.toCharArray();

        for(int i = 0;  i < s.length();    i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'  ||s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' && s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                arrayList.add(s.charAt(i));
            }
        }

        int length = arrayList.size()-1;
        for(int i = 0;    i < s.length();   i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'  ||s.charAt(i) == 'i' || s.charAt(i) == 'o'||


                    s.charAt(i) == 'u' && s.charAt(i) == 'A' ||s.charAt(i) == 'E' || s.charAt(i) == 'I'
                ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'U'){

                c[i] = arrayList.get(length);
                length--;
            }
        }
        return c;
    }

    private static char[] reverseString(String s) {
       char[] str = s.toCharArray();
       int length = s.length()-1;
      for(int i = 0; i < s.length(); i++){
          str[i] = s.charAt(length);
          length--;
      }
      return  str;
    }

    private static LinkedHashMap<Character,  Integer> occurence_of_Character(String s) {
        LinkedHashMap<Character,  Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0;  i < s.length();   i++){
            if(hashMap.containsKey(s.charAt(i))){
                int count = hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i),   count+1);
            }
            else{
                hashMap.put(s.charAt(i),   1);
            }
        }
        return hashMap;
    }
}
