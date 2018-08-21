package cn.syd.test;

import com.sun.tools.hat.internal.util.Comparer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/21
 * \* Time: 10:34
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Java8Test {

    private void sortUsingJava8(List<String> names){
        Collections.sort(names,(s1,s2) ->s1.compareTo(s2));
    }
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Xinlang");
        Java8Test test = new Java8Test();
        test.sortUsingJava8(names);
        System.out.println(names);
    }

}
