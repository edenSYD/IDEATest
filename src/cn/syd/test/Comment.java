package cn.syd.test;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/23
 * \* Time: 13:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
class FreshJuice{
    enum FreshJuiceSize{SMALL,MEDIUE,LARGE}
    FreshJuiceSize freshJuiceSize;
}
public class Comment {
    public static void main(String[] args){
        System.out.println("we will not use 'hello world!'");

        //1.声明一个数组
        String[] arr1 = new String[5];
        String[] arr2 = {"a","b","c","d","e"};
        String[] arr3 = new  String[]{"a","b","c","d","e"};
        int[] a = new int[100];
        for (int i = 0;i<100;i++){
            a[i] = i;
        }
        for (int element : a){
            System.out.print(element + " ");
        }
        //2.输出一个数组
        String arrString = Arrays.toString(arr2);
        System.out.println(arrString);

        //3.检查一个数组是否包含某一个值
        boolean isexist = Arrays.asList(arr2).contains("e");
        System.out.print(isexist);

        FreshJuice juice = new FreshJuice();
        juice.freshJuiceSize = FreshJuice.FreshJuiceSize.MEDIUE;





    }
}
