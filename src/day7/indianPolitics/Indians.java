package day7.indianPolitics;

public class Indians {
   public static String getArrest(int N){
      if(N > 10000000){
         return "PM are arrested and  MP are arrested and Ministers are arrested";
      }
      else if(N> 1000000){
         return "Minister and MP are arrested";
      }
      else if(N > 100000){
         return "MP are arrested";
      }
      else{
         return "None of them are arrested";
      }
   }
}
