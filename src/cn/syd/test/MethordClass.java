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
       Human human = new Human(150);
       //调用类的方法
       human.breath();
       System.out.print(human.height +"\n");
       Human human1 = new Human(160,"shit");
       System.out.print(human1.getHeight());
    }
}
