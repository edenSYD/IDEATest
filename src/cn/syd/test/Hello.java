package cn.syd.test;
/*
*   create by syd  2018-07-16
* */
public class Hello {
    public static final double CM_PER_INCH = 2.54;//类常量
    public static void main(String[] args){

        double paperWidth = 8.5;
        double paperHeight = 11;
        double salary = 65000.0;
        int vacationDays;
        long earthPopulation;
        boolean done;
        vacationDays = 12;
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println("Paper size in centimeters:" + paperWidth *CM_PER_INCH + " by " + paperHeight *CM_PER_INCH);
        System.out.println(y);

        String string = "this is no null string";
        int length = string.length();
        if (string != null && string.length() != 0){
            System.out.println(string + " " + length);
        }

        System.out.println("what's your name?");

    }

}
