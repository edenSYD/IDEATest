package cn.syd.test;
//import cn.syd.test.*;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/17
 * \* Time: 18:24
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Human {

    //私有属性
    private int height;
    private static int population;
    private static  boolean is_mammal = true;

    //内部构造器,初始化赋值
    public Human(int h){
        this.height = h;
        Human.population = Human.population + 1;
        System.out.print("I'm born");
    }
    public Human(int h,String s){
        this.height = h;
        System.out.print("new zha: I'm born," + s);
    }
    public Human(){

    }
    private void breath(){
        System.out.print("hu...hu..." + "\n");
    }
    //方法重载
    public void breath(int rep){
        int i;
        for (i = 0;i < rep;i++){
            //调用内部私有方法
            this.breath();
        }
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        //this 是隐性参数
        this.height = height;
    }

    public static int getPopulation() {
        return population;
    }

    //this method()  --> 对象的内部方法
    public void growHeight(int h){
        this.height += h;
    }
}
