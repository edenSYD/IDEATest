package cn.syd.test;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/23
 * \* Time: 16:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Retirement {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("how much money will you contribute every year?");

        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");

        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        //update account balance while user isn't ready to retire
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;

            //print current balance
            System.out.printf("After year %d,your balance is %,.2f%n",year,balance);
            System.out.println("Ready to retire? (Y/N) ");
            input = in.next();
        }while (input.equals("N"));
    }
}
