package cn.syd.test;
import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 17:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Test2 {
    public static void main(String[] args) {
        //容器--->定义数组
        Human[] persons = new Human[2];
        persons[0] = new Human(170);
        persons[1] = new Human(180);

        int[] dict = {1,2,3,4,5};
        System.out.println(dict[2]);

        int[] aTo = new int[3];

        System.arraycopy(dict,1,aTo,0,3);
        System.out.println(aTo[2]);
        String[] names = {"Tom","Jerry","Luffy"};
        System.out.println(names[0]);

        List<String> ll = new ArrayList<String>();
        ll.add("good");
        ll.add("bad");
        ll.add("shit");
        System.out.println(ll.get(1));
        System.out.println(ll.size());
        ll.remove(1);
        System.out.println(ll.size());
    }
}
