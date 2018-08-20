package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 11:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
//implements 实施 interface
public class MusicCup  implements Cup,MusicPlayer{
    private int water = 0;

    @Override
    public void drinkWater(int w) {
        this.water = this.water - w;
    }

    @Override
    public void addWater(int w) {
        this.water = this.water + w;
    }

    public int waterContent(){
        return this.water;
    }

    @Override
    public void play() {
        System.out.println("la...la...la");
    }
}
