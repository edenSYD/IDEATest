package cn.syd.test;
import java.awt.*;
import java.io.*;

import java.io.IOException;
import java.nio.Buffer;
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

        Women women = new Women();
        women.growHeight(160);
        System.out.println(women.getHeight());
        System.out.println(women.getPopulation());

        //针对异常处理
        try {
            String content = "thank you for your fish";
            File file = new File("file.txt");
            //判断文件是否存在
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            BufferedReader bf =  new BufferedReader(new FileReader("file.txt"));
            StringBuilder builder = new StringBuilder();
            String line = bf.readLine();

            while (line != null){
                builder.append(line);
                builder.append("\n");
                line = bf.readLine();
            }
            bf.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("io problem");
        }finally {

        }
        Class c1 = human.getClass();
        System.out.println(c1.getName());

        Human antherPerson = new Women();
        Class c2 = antherPerson.getClass();
        System.out.println();
        System.out.println(c2.getName());
        System.out.println(c2.getPackage());


        //1.创建线程
        //NewThread thread = new NewThread();
        //NewThread thread2 = new NewThread();
        //thread.start();
        //thread2.start();
        Reservoir r = new Reservoir(100);

        //资源共享
        NewThread thread1 = new NewThread(r);
        NewThread thread2 = new NewThread(r);
        NewThread thread3 = new NewThread(r);


    }

    private static void getSum(){

    }

}

class NewThread extends Thread{
    private static int threadID = 0;
    private  Reservoir reservoir;
    private int count = 0;

    public NewThread(Reservoir r){
        super("ID" + (++threadID));
        this.reservoir = r;
        this.start();
    }
    public String tostring(){
        return super.getName();
    }

    public NewThread(){
        super("ID" + (++threadID));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
        //super.run();
        while (true){
            if (this.reservoir.sellTicket()){
                this.count = this.count + 1;
                System.out.println(this.getName() + ": sell 1");

                try {
                    sleep((int)Math.random() * 100);
                }catch (InterruptedException ex){
                    System.out.println(ex);
                }
            }else {
                break;
            }
        }
        System.out.println(this.getName() + " I sold" + count);
    }

}

class Reservoir {
    private  int total;
    public Reservoir(int t){
        this.total = t;
    }

    public synchronized boolean sellTicket(){
        if (this.total > 0){
            this.total = this.total - 1;
            return true;
        }else {
            return false;
        }
    }
}