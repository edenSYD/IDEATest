package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/30
 * \* Time: 15:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class EmployeeTest {
    public static void main(String[] args){
      /*使用构造器创建两个函数*/
      Employee employee1 = new Employee("run001");
      Employee employee2 = new Employee("run002");
      //调用成员变量方法
      employee1.empAge(26);
      employee2.empAge(21);
      employee1.empDesignation("高级程序员");
      employee2.empDesignation("中级程序员");
      employee1.empSalary(1000);
      employee2.empSalary(500);

      employee1.printEmployee();
      employee2.printEmployee();
    }
}
