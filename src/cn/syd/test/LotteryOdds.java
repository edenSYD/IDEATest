package cn.syd.test;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/23
 * \* Time: 17:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class LotteryOdds {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("how many numbers do you want to draw?");
        int k = in.nextInt();

        System.out.print("what's the highest number you can draw");
        int n = in.nextInt();

       int lotteryOdds = 1;
       for (int i = 1;i<= k;i++){
           lotteryOdds = lotteryOdds * (n- i + 1) / i;
           System.out.print("you odds are 1  in " + lotteryOdds + ". good luck!");
        }
    }
}
