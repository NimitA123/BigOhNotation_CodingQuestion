package day7.indianPolitics;

import java.util.Scanner;

public class Commisioner extends Indians  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(getArrest(N));
    }
}
