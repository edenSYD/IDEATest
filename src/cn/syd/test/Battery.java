package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 13:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Battery {
    private double power = 0.0;
    //充电
    public void  chargeBattery(double p){
        if (this.power < 1.0){
            this.power = this.power + p;
        }
    }

    public boolean userBattery(double p){
        if (this.power >= p){
            this.power = this.power - p;
            return true;
        }else {
            this.power = 0.0;
            return false;
        }
    }

}
