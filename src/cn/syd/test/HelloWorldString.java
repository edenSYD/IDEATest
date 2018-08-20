package cn.syd.test;
import javax.swing.*;
import java.awt.*;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/20
 * \* Time: 20:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class HelloWorldString {
   private static void createAndShowGUI(){

       JFrame frame = new JFrame("HelloWorld");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //layout
       Container container = frame.getContentPane();
       container.setLayout(new FlowLayout());

       //button
       JButton button1 = new JButton("click me");
       JButton button2 = new JButton("shit");

       container.add(button1);
       container.add(button2);

       //show the window
       frame.pack();
       frame.setVisible(true);
   }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        };
        javax.swing.SwingUtilities.invokeLater(runnable);
    }
}
