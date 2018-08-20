package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 11:13
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Torch {
    //封装一个手电筒类
    private Battery theBattery = new Battery();

    public void torchOn(int h){
        boolean usable;
        usable = this.theBattery.userBattery(h * 0.1);
        if (usable != true){
            System.out.println("No more usable,must charge");
        }
    }
    public void charge(int h){
        this.theBattery.chargeBattery(h * 0.2);
    }
}
