package cn.syd.test;

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

    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        //this 是隐性参数
        this.height = height;
    }

    void breath(){
        System.out.print("hu...hu..." + "\n");
    }
    //方法重载
    void breath(int rep){

    }
    //this method()  --> 对象的内部方法
    void growHeight(int h){
        this.height += h;
    }
    //内部构造器,初始化赋值
    Human(int h){
        this.height = h;
        System.out.print("I'm born");
    }
    Human(int h,String s){
        this.height = h;
        System.out.print("new zha: I'm born," + s);
    }
}
