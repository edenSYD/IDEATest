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

        //集合--不允许重复值存在
        Set<Integer> s1 = new HashSet<>();
        s1.add(4);
        s1.add(5);
        s1.add(4);
        s1.add(5);
        System.out.println(s1);
        System.out.println(s1.size());

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        //循环遍历
        Iterator  iter= list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //字典
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom",12);
        map.put("shuang",13);
        map.put("dong",28);
        System.out.println(map.get("shuang"));


        Humanity humanity = new Humanity("lily");
        humanity.drinkWater(0.3);

        Humanity me = new Humanity("Vamei");
        Humanity him = new Humanity("Jerry");
        Humanity.Cup1 myFirstCup = me.new Cup1();
        Humanity.Cup1 himFirstCup = him.new Cup1();
        System.out.println(myFirstCup.whoCup());
        System.out.println(himFirstCup.whoCup());
        me.changeName("newBee");
        System.out.println(myFirstCup.whoCup());
        //嵌套static类
        Humanity.Mongolian mongolian = new Humanity.Mongolian();
        mongolian.shout();
    }
}
