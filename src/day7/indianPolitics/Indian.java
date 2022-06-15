package day7.indianPolitics;

public class Indian {
    public static String getConstituency(int N){
        if(N >= 545/2){
            return "Winning";
        }
        else{
            return "Not Winning";
        }

    }
    public static String getDriver(String s){
        return s;
    }
    public static String exceedsSpendingLimit(int N){
        if(N> 100000){
            return "You do not have enough fund in the bank Because your fund arw exceeds";
        }
        else{
            return "Your fund are not exceeds";
        }
    }
}
