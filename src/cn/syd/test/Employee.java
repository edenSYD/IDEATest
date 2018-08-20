package cn.syd.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/7/30
 * \* Time: 15:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Employee {
    String name;
    String designation;
    int age;
    double salary;
    //类的构造器
    public Employee(String name){
       this.name = name;
    }
    //赋值
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public  void empSalary(double empSalary){
        salary = empSalary;
    }
    /*打印信息*/
    public void printEmployee(){
        System.out.println("名字:" + name +",年龄:" + age + ",职位:" + designation + ",薪水:" + salary);
    }
}
