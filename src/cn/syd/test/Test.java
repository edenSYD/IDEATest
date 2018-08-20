package cn.syd.test;

import javafx.scene.control.Tab;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/17
 * \* Time: 17:15
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args){
        System.out.print("Declare in the middle\n");
        //定义一个变量
        int a = 5;
        System.out.print(a + "\n");//打印int

        //定义数组
        int[] arr;
        arr = new int[]{1,3,5,7,9,2,4,6,8,10};
        //数组的打印
        System.out.print(Arrays.toString(arr) + "\n");

        //计算从1..+100
        int sum = 0;
        int x = 1;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.print("从1累加到100：" + sum + "\n");
        getSum();

        String lin = "A",b = "B",c = "C",max = "D";
        List<String> list = new LinkedList<>();
        list.add(lin);
        list.add(b);
        list.add(c);
        list.add(max);
        list.set(1,lin);
        list.set(2,b);
        list.set(3,c);
        list.set(0,max);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + "\n");
        }

        Human human = new Human(160);
        System.out.print(human.getHeight() + "\n");
        System.out.println();
        System.out.println("Test.main");
        System.out.println("Test.main");

        //human.setHeight(170);
        //System.out.print(human.getHeight());


        //手电筒练习
        Torch torch = new Torch();
        System.out.println("charge 2 hour");
        torch.charge(2);
        System.out.println("First turn on: 3 hour");
        torch.torchOn(3);
        System.out.println("Second turn on: 3 hour");
        torch.torchOn(3);
    }

    private static void getSum(){

    }

}
