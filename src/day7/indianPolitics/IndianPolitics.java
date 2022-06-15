package day7.indianPolitics;

import java.util.Scanner;

public class IndianPolitics extends Indian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(getConstituency(N));
        String driver = input.next();
        System.out.println(getDriver(driver));
        int expensive = input.nextInt();
        System.out.println(exceedsSpendingLimit(expensive));
    }
}

