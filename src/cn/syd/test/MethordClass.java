package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/17
 * \* Time: 18:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class MethordClass {
    public static void main(String[] args){

        Human human1 = new Human(160,"shit");
        System.out.print(human1.getHeight());
        human1.growHeight(170);
        System.out.print("\n" + human1.getHeight());
        human1.breath(5);
    }
}
