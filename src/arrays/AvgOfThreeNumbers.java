package arrays;

import java.util.Scanner;

public class AvgOfThreeNumbers {
    public static void main(String[] args) {
        AvgOfThreeNumbers n1 =new AvgOfThreeNumbers();
        n1.avg();
    }
    void avg()
    {
        System.out.println("Enter three Numbers :-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average is : " + (a+b+c)/3);
    }
}
