package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/30
 * \* Time: 14:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Person {
    private String name;
    private String city;
    private String cardno;
    private String eyesColor;
    private String faceColor;
    public void walkUp(String name,String time){
        //起床方法
        System.out.println(name + "起床时间" + time);
    }
    public void sleep(String name,String time){
        //休息方法
        System.out.println(name + "睡觉时间" + time);
    }
}
