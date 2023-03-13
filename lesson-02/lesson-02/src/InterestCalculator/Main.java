package InterestCalculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = input.nextDouble();
        System.out.println("Enter number of months: ");
        int month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        double totalInterest = 0;
//        double interestOneMonth = money * (interestRate / 100) / 12;
//        for (int i = 1; i <= month; i++) {
            totalInterest += money * (interestRate / 100)/12 * month;
        //}
        System.out.println("Total of interest: " + totalInterest);
    }
}
