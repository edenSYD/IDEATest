package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 18:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Humanity {

    private Cup myCup;
    private String name;
    //嵌套一个类
    private class Cup{
        //成员变量
        private double water = 1.0;
        //构造方法
        public void useCup(double w){

            this.water = this.water - w;
        }

        public double getWater() {
            return this.water;
        }

    }

    public Humanity(String n){
        this.myCup = new Cup();
        this.name = n;
    }
    public void drinkWater(double w){
        myCup.useCup(w);
        System.out.println(myCup.getWater());
    }

    //闭包类
    class Cup1{
        public String whoCup(){
            return name;
        }
    }

    public void changeName(String n){
        this.name = n;
    }

    //嵌套static类
    static class Mongolian{
        public void shout(){
            System.out.println("oh...oh...");
        }
    }
}
